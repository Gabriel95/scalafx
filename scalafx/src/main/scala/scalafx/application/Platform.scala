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
package scalafx.application

import javafx.{application => jfxa}


/** Application platform support, wrapper for [[javafx.application.Platform]]. */
object Platform {

  /** Causes the JavaFX application to terminate. */
  def exit() {
    jfxa.Platform.exit()
  }

  /** Returns true if the calling thread is the JavaFX Application Thread. */
  def isFxApplicationThread: Boolean = jfxa.Platform.isFxApplicationThread

  /** Gets the value of the implicitExit attribute. */
  def implicitExit: Boolean = jfxa.Platform.isImplicitExit

  /** Sets the implicitExit attribute to the specified value. */
  def implicitExit_=(implicitExit: Boolean) {
    jfxa.Platform.setImplicitExit(implicitExit)
  }

  /** Queries whether a specific conditional feature is supported by the platform. */
  def isSupported(feature: ConditionalFeature) = jfxa.Platform.isSupported(feature)

  /** Run the specified Runnable on the JavaFX Application Thread at some unspecified time in the future.
    * Returns immediately.
    */
  def runLater(runnable: java.lang.Runnable) {
    jfxa.Platform.runLater(runnable)
  }

  /** Run the specified code block on the JavaFX Application Thread at some unspecified time in the future.
    * Returns immediately.
    */
  def runLater[R](op: => R) {
    runLater(new Runnable {
      def run() {
        op
      }
    })
  }
}