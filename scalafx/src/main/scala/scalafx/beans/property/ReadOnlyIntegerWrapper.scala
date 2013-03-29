/*
 * Copyright (c) 2012-2013, ScalaFX Project
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
package scalafx.beans.property

import javafx.beans.{property => jfxbp}
import scalafx.Includes._
import scalafx.delegate.SFXDelegate


object ReadOnlyIntegerWrapper {
  implicit def sfxReadOnlyIntegerWrapper2jfx(w: ReadOnlyIntegerWrapper) = w.delegate

  /** Creates a new ReadOnlyIntegerWrapper instance.
    * @param value the initial value of the wrapped value
    */
  def apply(value: Int) = new ReadOnlyIntegerWrapper(new jfxbp.ReadOnlyIntegerWrapper(value))
}


/** Wrapper for [[javafx.beans.property.ReadOnlyIntegerWrapper]] */
class ReadOnlyIntegerWrapper(override val delegate: jfxbp.ReadOnlyIntegerWrapper = new jfxbp.ReadOnlyIntegerWrapper())
  extends IntegerProperty(delegate)
  with SFXDelegate[jfxbp.ReadOnlyIntegerWrapper] {

  /** The read-only property, that is synchronized with this ReadOnlyIntegerWrapper.
    * @param bean the bean of this ReadOnlyIntegerWrapper
    * @param name the name of this ReadOnlyIntegerWrapper
    */
  def this(bean: Object, name: String) = this(new jfxbp.ReadOnlyIntegerWrapper(bean, name))

  /** Creates a new ReadOnlyIntegerWrapper instance.
    * @param initialValue the initial value of the wrapped value
    * @param bean the bean of this ReadOnlyIntegerWrapper
    * @param name the name of this ReadOnlyIntegerWrapper
    */
  def this(bean: Object, name: String, initialValue: Int) = this(new jfxbp.ReadOnlyIntegerWrapper(bean, name, initialValue))

  /** Creates a new ReadOnlyIntegerWrapper instance. */
  def readOnlyProperty: ReadOnlyIntegerProperty = delegate.getReadOnlyProperty
}
