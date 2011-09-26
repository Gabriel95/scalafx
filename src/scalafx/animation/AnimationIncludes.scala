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

package scalafx.animation

import javafx.{animation => jfxa}
import javafx.util.Duration

object AnimationIncludes extends AnimationIncludes

trait AnimationIncludes {
  def at(time: Duration)(value: => KeyValue[_, _]) = KeyFrame(time, values = Set(value))
  implicit def jfxAnimation2sfx(v: jfxa.Animation) = new Animation() {
    override def delegate = v
  }
  implicit def jfxFadeTransition2sfx(v: jfxa.FadeTransition) = new FadeTransition(v)
  implicit def jfxFillTransition2sfx(v: jfxa.FillTransition) = new FillTransition(v)
  implicit def jfxKeyFrame2sfx(v: jfxa.KeyFrame) = new KeyFrame(v)
  implicit def jfxKeyValue2sfx(v: jfxa.KeyValue) = new KeyValue(v)
  implicit def jfxParallelTransition2sfx(v: jfxa.ParallelTransition) = new ParallelTransition(v)
  implicit def jfxPathTransition2sfx(v: jfxa.PathTransition) = new PathTransition(v)
  implicit def jfxPauseTransition2sfx(v: jfxa.PauseTransition) = new PauseTransition(v)
  implicit def jfxTimeline2sfx(v: jfxa.Timeline) = new Timeline(v)
  implicit def jfxTransition2sfx(v: jfxa.Transition) = new Transition() {
    override def delegate = v
  }
}