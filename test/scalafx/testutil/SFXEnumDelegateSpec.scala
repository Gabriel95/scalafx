/*
 * Copyright (c) 2012, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package scalafx.testutil

import java.util.EnumSet

import scala.collection.JavaConversions._

import scalafx.util.SFXEnumDelegate
import scalafx.util.SFXEnumDelegateCompanion

/**
 * @author Rafael
 *
 */
abstract class SFXEnumDelegateSpec[E <: java.lang.Enum[E], S <: SFXEnumDelegate[E]] protected (javaClass: Class[E], scalaClass: Class[S], companion: SFXEnumDelegateCompanion[E, S])
  extends SimpleSFXDelegateSpec[E, S](javaClass, scalaClass) {

  private val javaEnumConstants = EnumSet.allOf(javaClass)

  private def nameIsPresent(name: String) = {
    try {
      val scalaEnum = companion(name)
      true
    } catch {
      case e: IllegalArgumentException => false
    }
  }

  def assertScalaEnumWithOrdinal(s: S, index: Int): Unit =
    assert(s.delegate.ordinal() == index, "%s - Expected position: %d, actual: %d".format(s, s.delegate.ordinal(), index))

  // Simply it gets the first constant available.
  override protected def getScalaClassInstance = companion.values.toList.head

  // 
  override protected def getJavaClassInstance = javaEnumConstants.iterator.next

  it should "presents all constants from its original JavaFX class" in {
    val diff = javaEnumConstants -- companion.values.map(_.delegate)

    assert(diff.isEmpty, "Missing constants: " + diff.mkString(", "))
  }

  it should "generate all ScalaFX enums from JavaFX enums names" in {
    val missingJavaEnumNames = javaEnumConstants.map(_.name).filterNot(nameIsPresent(_))

    assert(missingJavaEnumNames.isEmpty, "Missing constants: " + missingJavaEnumNames.mkString(", "))
  }

  it should "not find a non registered name among enum constants" in {
    intercept[IllegalArgumentException] {
      companion("!@#$%")
    }
  }

  it should "presents its values at same order as its JavaFX enum ordinal" in {
    companion.values.zipWithIndex.foreach({ case (s, i) => assertScalaEnumWithOrdinal(s, i) })
  }

}