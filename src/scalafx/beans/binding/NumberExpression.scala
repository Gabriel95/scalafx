/*
 * Copyright (c) 2011, ScalaFX Project
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

package scalafx.beans.binding

import javafx.beans.binding.{NumberExpression => JFXNumberExpression}
import javafx.beans.value.ObservableNumberValue
import scalafx.beans.binding.NumberExpression.VariablePrecisionNumber

object NumberExpression {
  implicit def sfxNumberExpression2jfx(ne: NumberExpression) = ne.delegate
  implicit def jfxNumberExpression2sfx(ne: NumberExpression) = new NumberExpression(ne)
  case class VariablePrecisionNumber(number:Double, var precision:Double = 0) {
    def +-(p:Double):VariablePrecisionNumber = {
      precision = p
      this
    }
  }
}

class NumberExpression(val delegate: JFXNumberExpression) {
  def +(v: Int) = new NumberExpression(delegate.add(v))
  def +(v: Long) = new NumberExpression(delegate.add(v))
  def +(v: Float) = new NumberExpression(delegate.add(v))
  def +(v: Double) = new NumberExpression(delegate.add(v))
  def +(v: ObservableNumberValue) = new NumberExpression(delegate.add(v))
  def +(v: NumberExpression) = new NumberExpression(delegate.add(v.delegate))

  def -(v: Int) = new NumberExpression(delegate.subtract(v))
  def -(v: Long) = new NumberExpression(delegate.subtract(v))
  def -(v: Float) = new NumberExpression(delegate.subtract(v))
  def -(v: Double) = new NumberExpression(delegate.subtract(v))
  def -(v: ObservableNumberValue) = new NumberExpression(delegate.subtract(v))
  def -(v: NumberExpression) = new NumberExpression(delegate.subtract(v.delegate))

  def *(v: Int) = new NumberExpression(delegate.multiply(v))
  def *(v: Long) = new NumberExpression(delegate.multiply(v))
  def *(v: Float) = new NumberExpression(delegate.multiply(v))
  def *(v: Double) = new NumberExpression(delegate.multiply(v))
  def *(v: ObservableNumberValue) = new NumberExpression(delegate.multiply(v))
  def *(v: NumberExpression) = new NumberExpression(delegate.multiply(v.delegate))

  def /(v: Int) = new NumberExpression(delegate.divide(v))
  def /(v: Long) = new NumberExpression(delegate.divide(v))
  def /(v: Float) = new NumberExpression(delegate.divide(v))
  def /(v: Double) = new NumberExpression(delegate.divide(v))
  def /(v: ObservableNumberValue) = new NumberExpression(delegate.divide(v))
  def /(v: NumberExpression) = new NumberExpression(delegate.divide(v.delegate))

  def ==(v: Int) = delegate.isEqualTo(v)
  def ==(v: Long) = delegate.isEqualTo(v)
  def ==(v: Float) = delegate.isEqualTo(v, 0)
  def ==(v: Double) = delegate.isEqualTo(v, 0)
  def ==(v: VariablePrecisionNumber) = delegate.isEqualTo(v.number, v.precision)
  def ==(v: ObservableNumberValue) = delegate.isEqualTo(v)
  def ==(v: NumberExpression) = delegate.isEqualTo(v.delegate)

  def !=(v: Int) = delegate.isNotEqualTo(v)
  def !=(v: Long) = delegate.isNotEqualTo(v)
  def !=(v: Float) = delegate.isNotEqualTo(v, 0)
  def !=(v: Double) = delegate.isNotEqualTo(v, 0)
  def !=(v: VariablePrecisionNumber) = delegate.isNotEqualTo(v.number, v.precision)
  def !=(v: ObservableNumberValue) = delegate.isNotEqualTo(v)
  def !=(v: NumberExpression) = delegate.isNotEqualTo(v.delegate)

  def <(v: Int) = delegate.lessThan(v)
  def <(v: Long) = delegate.lessThan(v)
  def <(v: Float) = delegate.lessThan(v)
  def <(v: Double) = delegate.lessThan(v)
  def <(v: ObservableNumberValue) = delegate.lessThan(v)
  def <(v: NumberExpression) = delegate.lessThan(v.delegate)

  def >(v: Int) = delegate.greaterThan(v)
  def >(v: Long) = delegate.greaterThan(v)
  def >(v: Float) = delegate.greaterThan(v)
  def >(v: Double) = delegate.greaterThan(v)
  def >(v: ObservableNumberValue) = delegate.greaterThan(v)
  def >(v: NumberExpression) = delegate.greaterThan(v.delegate)

  def <=(v: Int) = delegate.lessThanOrEqualTo(v)
  def <=(v: Long) = delegate.lessThanOrEqualTo(v)
  def <=(v: Float) = delegate.lessThanOrEqualTo(v)
  def <=(v: Double) = delegate.lessThanOrEqualTo(v)
  def <=(v: ObservableNumberValue) = delegate.lessThanOrEqualTo(v)
  def <=(v: NumberExpression) = delegate.lessThanOrEqualTo(v.delegate)

  def >=(v: Int) = delegate.greaterThanOrEqualTo(v)
  def >=(v: Long) = delegate.greaterThanOrEqualTo(v)
  def >=(v: Float) = delegate.greaterThanOrEqualTo(v)
  def >=(v: Double) = delegate.greaterThanOrEqualTo(v)
  def >=(v: ObservableNumberValue) = delegate.greaterThanOrEqualTo(v)
  def >=(v: NumberExpression) = delegate.greaterThanOrEqualTo(v.delegate)

  def unary_- = delegate.negate()

  def toInt = delegate.intValue
  def toLong = delegate.longValue
  def toFloat = delegate.floatValue
  def toDouble = delegate.doubleValue
}