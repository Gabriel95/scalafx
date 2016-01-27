This is a proposed release plan. It is open for discussion. Please use [scala-dev](http://groups.google.com/group/scalafx-dev) group to comment, propose items, change priority, volunteer to own an item, etc.



# ScalaFX 1.0 #

**Themes**
  * Wrappers for JavaFX enums
  * Scala 2.10 compatibility - replacement for `then` in construct: **`when`** _`condition`_ **`then`** _`value1`_ **`otherwise`** _`value2`_
  * Object properties/binding improvements

Milestones will be released in roughly monthly intervals, possibly adjusted by significance of changes made since previous release, till we deliver planned features or JavaFX 8 is released (we will have to shift gears to support it).

## Milestone 1 ##

First download-able release planned for middle of February 2013. Mostly based on what is already implemented + potentially major compatibility braking changes that are easy to implement.

| **Tracker** | **Description**                                                               | **Priority** | **Coordinator** | Status  |
|:------------|:------------------------------------------------------------------------------|:-------------|:----------------|:--------|
| [Issue 4](https://code.google.com/p/scalafx/issues/detail?id=4)   | Download-able ScalaFX jar                                                     | Critical     | Jarek           | Fixed   |
| [Issue 38](https://code.google.com/p/scalafx/issues/detail?id=38)  | Sonatype.org setup for artifact publishing                                    | Critical     | Jarek           | Fixed   |
| [Issue 37](https://code.google.com/p/scalafx/issues/detail?id=37)  | `then` is Scala reserved word from 2.10 onwards                               | Critical     | Jarek           | Fixed   |
| [Issue 32](https://code.google.com/p/scalafx/issues/detail?id=32)  | The main ScalaFX artifact should be renamed back to `scalafx_{version}.jar`   | Critical     | Jarek           | Fixed   |
| [Issue 12](https://code.google.com/p/scalafx/issues/detail?id=12)  | `ComboBox` value property is not a ScalaFX property                           | Medium       | Rafael          | Fixed   |
| [Issue 18](https://code.google.com/p/scalafx/issues/detail?id=18)  | Let eventClosureWrapper take functions of =>Any                               | Medium       | Alain           | Fixed   |

...

## Milestone 2 ##

No particular focus for Milestone 2 yet, most likely will contain some opportunistic fixes.

| **Tracker** | **Description**                                               | **Priority** | **Coordinator** | Status  |
|:------------|:--------------------------------------------------------------|:-------------|:----------------|:--------|
| [Issue 9](https://code.google.com/p/scalafx/issues/detail?id=9)   | `ClassCastException` when working with Binding Expression     | Medium       |                 | Fixed   |
| [Issue 10](https://code.google.com/p/scalafx/issues/detail?id=10)  | Setting cellValueFactory on table column doesn't work         | Medium       |                 | Done    |
| [Issue 40](https://code.google.com/p/scalafx/issues/detail?id=40)  | Cannot create TableColumn using default constructor           | Medium       |                 | Fixed   |
| [Issue 41](https://code.google.com/p/scalafx/issues/detail?id=41)  | Assigning columns to TableView does nothing                   | Medium       |                 | Fixed   |
| [Issue 42](https://code.google.com/p/scalafx/issues/detail?id=42)  | Assigning items to ContextMenu does nothing                   | Medium       |                 | Fixed   |
| [Issue 43](https://code.google.com/p/scalafx/issues/detail?id=43)  | Cannot pragmatically sort TableView columns                   | Medium       |                 | Fixed   |
| [Issue 44](https://code.google.com/p/scalafx/issues/detail?id=44)  | Cannot create nested columns in TableView                     | Medium       |                 | Fixed   |

## Milestone _N_ ##

Placeholder for issues not yet scheduled for a particular milestone but nice to have in final 1.0 release. Mostly related to property and binding improvements. Some of those may not be critical for Release 1.0, and may be moved to release 1.1 (suggestions welcome).

| **Tracker** | **Description**                                               | **Priority** | **Coordinator** | Status  |
|:------------|:--------------------------------------------------------------|:-------------|:----------------|:--------|
| [Issue 39](https://code.google.com/p/scalafx/issues/detail?id=39)  | scalafx.scene.control.Pagination PageFactory is not working as expected |  High        |                 |         |
| [Issue 27](https://code.google.com/p/scalafx/issues/detail?id=27)   | Resolve issues leading to tests failing for Scala 2.10        |    High      |                 | Fixed   |
|             | Giter8 ScalaFX Template                                       |              | JUGChennai      | Started |
|             | Advertise ScalaFX on the list of Scala Community Projects     |              |                 |         |
|             | ScalaFX logo                                                  |              |                 |         |
| [Issue 33](https://code.google.com/p/scalafx/issues/detail?id=33)  | Outstanding TODO tags in the source code                      |              |                 |         |
|             | Use ScalaFX types for arguments and return values of methods  |              | Alain           |   Done   |


# ScalaFX 1.1 #

JavaFX 8 will be released in a couple of months. It has some support parts of the code that are not compatible with JavaFX 2.2 - changes that break current ScalaFX. Once ScalaFX 1.0 is released focus may shift, depending on timing and demand, to support for JavaFX 8. Possible other themes
  * Improvements for JavaFX `Task`s and concurrency support
  * Improvement for numeric value properties, expressions, and bindings
  * Leveraging new Scala 2.10 features, like implicit value classes.
  * Improved test coverage - aiming at 80%
