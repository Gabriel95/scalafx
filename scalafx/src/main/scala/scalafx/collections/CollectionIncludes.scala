/*
 * Copyright (c) 2011-2013, ScalaFX Project
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
package scalafx.collections

import scala.collection.JavaConversions.mapAsScalaMap

import javafx.{ collections => jfxc }

object CollectionIncludes extends CollectionIncludes

/**
 * @define JFXC http://docs.oracle.com/javafx/8/api/javafx/collections
 * Contains implicit methods to convert from 
 * [[$JFXC/package-summary.html `javafx.collections`]] 
 * Classes to their ScalaFX counterparts.
 */
trait CollectionIncludes {
  
  /**
   * Converts a [[$JFXC/ObservableList.html `ObservableList`]]
   * to a [[scalafx.collections.ObservableBuffer]].
   * 
   * @tparam T List Type
   * @param ol JavaFX ObservableList
   * @return ScalaFX ObservableBuffer
   */
  implicit def observableList2ObservableBuffer[T](ol: jfxc.ObservableList[T]): ObservableBuffer[T] =
    new ObservableBuffer[T](ol)

  /**
   * Converts a JavaFX [[$JFXC/ObservableMap.html `ObservableMap`]]
   * to a ScalaFX [[scalafx.collections.ObservableMap]].
   * 
   * @tparam K Key Type
   * @tparam V Value Type
   * @param om JavaFX ObservableMap
   * @return ScalaFX ObservableMap
   */
  implicit def jfxObservableMap2sfxObservableMap[K, V](om: jfxc.ObservableMap[K, V]): ObservableMap[K, V] =
    new ObservableMap[K, V] {
      override val delegate = om
    }

  /**
   * Converts a JavaFX [[$JFXC/ObservableSet.html `ObservableSet`]]
   * to a ScalaFX [[scalafx.collections.ObservableSet]].
   * 
   * @tparam T Set Type
   * @param os JavaFX Observableset
   * @return ScalaFX ObservableSet
   */
  implicit def jfxObservableSet2sfxObservableSet[T](os: jfxc.ObservableSet[T]): ObservableHashSet[T] = new ObservableHashSet[T](os)

  /**
   * Converts a JavaFX [[$JFXC/ObservableFloatArray.html
   * `ObservableFloatArray`]] to a ScalaFX
   * [[scalafx.collections.ObservableFloatArray!]].
   * 
   * @param ofa JavaFX ObservableFloatArray
   * @return ScalaFX ObservableFloatArray
   */
  implicit def jfxObservableFloatArray2sfxObservableFloatArray (ofa:
    jfxc.ObservableFloatArray): ObservableFloatArray =
      new ObservableFloatArray (ofa)

  /**
   * Converts a JavaFX [[$JFXC/ObservableIntegerArray.html
   * `ObservableIntegerArray`]] to a ScalaFX
   * [[scalafx.collections.ObservableIntegerArray!]].
   * 
   * @param oia JavaFX ObservableIntegerArray
   * @return ScalaFX ObservableIntegerArray
   */
  implicit def jfxObservableIntegerArray2sfxObservableIntegerArray (oia:
    jfxc.ObservableIntegerArray): ObservableIntegerArray =
      new ObservableIntegerArray (oia)
}
