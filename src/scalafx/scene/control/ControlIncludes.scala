/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scalafx.scene.control
import javafx.scene.{control => jfxsc}

object ControlIncludes extends ControlIncludes
trait ControlIncludes {
  implicit def jfxAccordion2sfx(a: jfxsc.Accordion) = new Accordion(a)
  implicit def jfxControl2sfx(c: jfxsc.Control) = new Control(c) {}
  implicit def jfxLabel2sfx(l: jfxsc.Label) = new Label(l)
  implicit def jfxLabeled2sfx(l: jfxsc.Labeled) = new Labeled(l) {}
  implicit def jfxTitledPane2sfx(t: jfxsc.TitledPane) = new TitledPane(t)
}
