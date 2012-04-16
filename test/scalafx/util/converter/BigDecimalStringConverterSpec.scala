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
package scalafx.util.converter

import org.junit.runner.RunWith
import javafx.util.{ converter => jfxuc }
import scalafx.Includes._
import org.scalatest.junit.JUnitRunner

/**
 * BigDecimalStringConverter Spec tests.
 *
 *
 */
@RunWith(classOf[JUnitRunner])
class BigDecimalStringConverterSpec
  extends AbstractStringConverterDelegateSpec[java.math.BigDecimal, jfxuc.BigDecimalStringConverter, BigDecimal, BigDecimalStringConverter](classOf[jfxuc.BigDecimalStringConverter], classOf[BigDecimalStringConverter], classOf[BigDecimal]) {

  override val examples = List((BigDecimal(0), "0"), (BigDecimal(12345), "12345"),
    (BigDecimal(-12345), "-12345"), (BigDecimal(12.345), "12.345"))

  protected def getScalaClassInstance = new BigDecimalStringConverter

  protected def convertScalaClassToJavaClass(sfxControl: BigDecimalStringConverter) = {
    val jfxBigDecimalStringConverter: jfxuc.BigDecimalStringConverter = sfxControl
    jfxBigDecimalStringConverter
  }

  protected def convertJavaClassToScalaClass(jfxControl: jfxuc.BigDecimalStringConverter) = {
    val sfxBigDecimalStringConverter: BigDecimalStringConverter = jfxControl
    sfxBigDecimalStringConverter
  }

}
