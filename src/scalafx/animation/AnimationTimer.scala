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
package scalafx.animation

import javafx.{ animation => jfxa }
import scalafx.Includes._
import scalafx.util.SFXDelegate

object AnimationTimer {
  implicit def sfxAnimationTimer2jfx(at: AnimationTimer) = at.delegate

  /**
   * Creates a new [[AnimationTimer]] from a handle function that receives a
   * Long parameter.
   *
   * @param handler function that is called in every frame while the
   * AnimationTimer is active.
   * @return a new [[AnimationTimer]].
   */
  def apply(handler: Long => Unit): AnimationTimer = new AnimationTimer(new jfxa.AnimationTimer {
    def handle(now: Long) = handler(now)
  }) {}

}

/**
 * Wraps a [[http://docs.oracle.com/javafx/2/api/javafx/animation/Animation.html AnimationTimer]]. 
 */
abstract class AnimationTimer(override val delegate: jfxa.AnimationTimer)
  extends SFXDelegate[jfxa.AnimationTimer] {

  /**
   * This method needs to be overridden by extending classes.
   */
  def handle(now: Long) {
    delegate.handle(now)
  }

  /**
   * Starts the `AnimationTimers`.
   */
  def start = delegate.start

  /**
   * Stops the `AnimationTimers`. It can be activated again by calling start().
   */
  def stop = delegate.stop

}