# ScalaFX Release Notes #

Currently there are two parallel releases:

  * v.1.0.0 - supports JavaFX 2 and Java 7 (SFX-1)
  * v.8.0.0 - supports JavaFX 8 and Java 8 (SFX-8)

SFX-1 is the main development branch. Changes made to SFX-1 are ported to SFX-8. SFX-8 has some additional features that are only possible due to JavaFX 8, and are not back ported to SFX-1. In general, all changes made to SFX-1 are also available in SFX-8.

## `v.1.0.0-R8` and `v.8.0.0-R4` ##

March 6, 2014

### User visible ###

  * Version naming convention change to use R (release) instead of M (Milestone), to signify that releases are stable.
  * More fixes for use of code blocks in event handlers (similar to [Issue 102](https://code.google.com/p/scalafx/issues/detail?id=102))
  * Fixed [Issue 115](https://code.google.com/p/scalafx/issues/detail?id=115): `EventHandlerDelegate#filterEvent` should allow to remove created filters.
  * Resolved [Issue 118](https://code.google.com/p/scalafx/issues/detail?id=118):	Add scaladoc root page.
  * Resolved [Issue 117](https://code.google.com/p/scalafx/issues/detail?id=117): Remove obsolete build files and documentation.
  * Resolved [Issue 120](https://code.google.com/p/scalafx/issues/detail?id=120): Scene is missing two constructors.
  * Some code changes to support Scala 2.11 stricter compiler.

### Contributor visible ###

  * Resolve [Issue 116](https://code.google.com/p/scalafx/issues/detail?id=116) - move settings from project/build.scala to build.sbt
  * Remove "sbt-idea" plugin since IDEA can now import SBT projects directly.
  * SBT is ScalaFX official build system, drop outdated Gradle and Maven files. It is difficult to maintain multiple build system support.
  * Fixed [Issue 121](https://code.google.com/p/scalafx/issues/detail?id=121): Build script has some not needed resolvers.
  * Update ScalaTest to v.2.1 - mostly to support testing in Scala 2.11

### `v.1.0.0.R8` ###

Tested with Java 1.7.0 u51. All changes mentioned above. Binaries are released for Scala [2.9.3](http://search.maven.org/#artifactdetails|org.scalafx|scalafx_2.9.3|1.0.0-R8|jar), [2.10](http://search.maven.org/#artifactdetails|org.scalafx|scalafx_2.10|1.0.0-R8|jar), and [2.11.0-RC1](http://search.maven.org/#artifactdetails|org.scalafx|scalafx_2.11.0-RC1|1.0.0-R8|jar).

### `v.8.0.0.R4` ###

Tested with early release Java 1.8.0 b129 (final release preview of Java 8). All changes mentioned above plus:

  * Improvements to `TriangleMeshDemo`
  * `DrawMode`, `CullFace` are now using Scala naming convention for constants.
  * Resolved [Issue 92](https://code.google.com/p/scalafx/issues/detail?id=92): SFX-8: Add wrapper for `TextFlow` and added `TextFlowDemo`.
  * Resolved [Issue 99](https://code.google.com/p/scalafx/issues/detail?id=99): add wrappers for new classes in `javafx.scene.layout`: `Background`, `BackgroundFill`, `BackgroundImage`, `BackgroundPosition`, `BackgroundRepeat`, `BackgroundSize`, `CornerRadii`, `BorderImage`, `BorderRepeat`, `BorderStroke`, `BorderStrokeStyle`, `BorderWidths`.

Binaries are released for Scala [2.10](http://search.maven.org/#artifactdetails|org.scalafx|scalafx_2.10|8.0.0-R4). Scala 2.11.0-RC1 cannot compile current ScalaFX SFX-8 code yet.

For downloads visit [ScalaFX on Sonatype](http://search.maven.org/#search|ga|1|scalafx).

## v.1.0.0-M7 and v.8.0.0-M3 ##

December 30, 2013

### v.1.0.0 - Milestone 7 ###

Tested with Java 1.7.0 u45.

#### Use visible ####

  * New factory methods for Label, supporting common uses: Label("text") and Label("text", node)
  * Change in parameter names for RowConstraint constructor, to better reflect their meaning.
  * Added demo illustrating simple monitoring of selection in a ListView using `onChange`: ListViewWithSelectionDemo.
  * Extended demo of using TableColumn cellFactory: TableWithCustomCellDemo.
  * Updated README files in the source code.
  * Add simple project illustrating how to use pre-build ScalaFX binaries with SBT: scalafx-hello-world.
  * Fixed [Issue 100](https://code.google.com/p/scalafx/issues/detail?id=100): `ScrollEvent.SCROLL` has incorrect type
  * Fixed [Issue 108](https://code.google.com/p/scalafx/issues/detail?id=108): Compilation error when creating TreeView cellFactory.
  * Fixed [Issue 109](https://code.google.com/p/scalafx/issues/detail?id=109): Compilation error when creating TableView cellFactory.
  * Fixed [Issue 110](https://code.google.com/p/scalafx/issues/detail?id=110): IndexedCell should extend Cell.
  * Fixed [Issue 102](https://code.google.com/p/scalafx/issues/detail?id=102): Code blocks cannot be used for event handlers (that frequently lead to buggy code). Instead of
```
   button.onAction = {
     println("Handling button action")
     doSomething()
   }
```
> that will not execute `println`, you need to add `handle`:

```
   button.onAction = handle {
     println("Handling button action")
     doSomething()
   }
```



#### Contributor visible ####

  * Correct tests for event handlers ([Issue 102](https://code.google.com/p/scalafx/issues/detail?id=102))
  * Simplify event handler code - remove duplicates.
  * Add note that SBT is the "official" build system for ScalaFX.
  * Update to ScalaTest 2.0 in order to take advantage of the new junitxml output for the CI server.  As a result, tests can only be run against Scala 2.10 (changed the default build to use this).  However, packaging will still work against 2.9 and 2.10.  Also updated tests for the new version of ScalaTest.
  * Jenkins CI builds fixed.
  * Upgrade SBT to v.0.13.1.


### v.8.0.0 - Milestone 3 ###

Tested with Java 1.8.0 b121 (early access). Contains all changes listed for v.1.0.0 - Milestone 7 plus:

  * Fixed [issue 103](https://code.google.com/p/scalafx/issues/detail?id=103): SFX-8 Scene anti-aliasing no longer `boolean`.