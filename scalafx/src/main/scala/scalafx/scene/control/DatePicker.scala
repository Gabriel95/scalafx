/*
 * Copyright (c) 2011-2014, ScalaFX Project
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
package scalafx.scene.control

import java.time.LocalDate
import java.time.chrono.Chronology

import javafx.scene.{control => jfxsc}
import javafx.{util => jfxu}
import scalafx.Includes._
import scalafx.delegate.SFXDelegate
import scalafx.util.StringConverter

object DatePicker {
  implicit def sfxDatePicker2jfx(v: DatePicker) = v.delegate
}

/**
 * Wraps [[http://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/DatePicker.html]].
 */
class DatePicker(override val delegate: jfxsc.DatePicker) extends ComboBoxBase[LocalDate](delegate) with SFXDelegate[jfxsc.DatePicker] {
  
  /**
   * Creates a default <code>DatePicker</code> instance with a <code>null</node> date value set.
   */
  def this() = this(new jfxsc.DatePicker())
  
  /**
   * Creates a <code>DatePicker</code> instance and sets the value to the given date.
   */
  def this(localDate: LocalDate) = this(new jfxsc.DatePicker(localDate))
  
  /**
   * The calendar system used for parsing, displaying, and choosing dates in the DatePicker control.
   */
  def chronology = delegate.chronologyProperty
  def chronology_=(value: Chronology) {
    chronology() = value
  }
  
  /**
   * Converts the input text to an object of type <code>LocalDate</code> and vice versa.
   */
  def converter = delegate.converterProperty
  def converter_=(value: StringConverter[LocalDate]) {
    converter() = value
  }
  
  /**
   * A custom cell factory can be provided to customize individual day cells in the <code>DatePicker</code> popup.
   */
  def dayCellFactory = delegate.dayCellFactoryProperty
  def dayCellFactory_=(value: DatePicker => DateCell) {
    dayCellFactory() = new jfxu.Callback[jfxsc.DatePicker, jfxsc.DateCell] {
      def call(result: jfxsc.DatePicker) = {
        value(result)
      }
    }
  }
  
  /**
   * The editor for the <code>DatePicker</code>.
   */
  def editor = delegate.editorProperty
  
  /**
   * Whether the <code>DatePicker</code> popup should display a column showing week numbers.
   */
  def showWeekNumbers = delegate.showWeekNumbersProperty
  def showWeekNumbers_=(value: Boolean) = {
    showWeekNumbers() = value
  }
}