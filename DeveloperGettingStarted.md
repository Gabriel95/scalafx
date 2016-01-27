

# Introduction #

Getting started on the ScalaFX project is fairly straightforward, and just requires a little setup of your local environment.

Please remember that this guide is updated on-demand, so if you notice any discrepancies, please let us know on the [mailing list](https://groups.google.com/group/scalafx-users/).

# Version Control #
ScalaFX is using [Mercurial](http://mercurial.selenic.com/) for version control. Please get familiar with the Mercurial if you plan to commit to ScalaFX repository. You can find more information and learning resources in [Version Control with Mercurial](VersionControlWithHg.md).

# Source Code Organization #
ScalaFX code is divided into two modules: the main ScalaFX library contained in module “scalafx-core” and various demonstrations in module “scalafx-demos”. Both modules have similar structure following default SBT/Maven directory structure:

  * `src/main/scala` – contains source code
  * `src/test/scala` – contains tests

# Dependencies #
ScalaFX and the demos depends only on JavaFX and the Scala Library (scala-library). The tests also depend on [ScalaTest](http://www.scalatest.org/) and [JUnit](http://www.junit.org/).

# Getting the ScalaFX Source Code #
You can find the ScalaFX source code following the source link on [the home page](http://scalafx.org). To get the source code:

  1. Install [Mercurial](http://mercurial.selenic.com/)
  1. Checkout ScalaFX, for details see: http://code.google.com/p/scalafx/source/checkout

# Build System Setup #
The “default” build system for Scala projects is [SBT](http://www.scala-sbt.org/). It is recommended that you install it, even if you prefer other setups (Gradle, Maven, or other), and use it at least to run tests before you commit to ScalaFX repository. Details are in [README-SBT.txt](http://code.google.com/p/scalafx/source/browse/README-SBT.txt).

ScalaFX also comes with Gradle configuration for those who prefer it. Details are in [README-GRADLE.txt](http://code.google.com/p/scalafx/source/browse/README-GRADLE.txt).

Maven configuration can be generated using SBT. The process in described in [README-MAVEN.txt](http://code.google.com/p/scalafx/source/browse/README-MAVEN.txt).

# IDE Setup #
There are no restriction how you setup your IDE. Just remember **NOT** to commit IDE specific files to the ScalaFX repository.

For quick setup, SBT can generate configurations for IntelliJ IDEA and for Eclipse Scala IDE.

## Generation of IntelliJ IDEA setup ##
  1. Download [IntelliJ IDEA](https://www.jetbrains.com/idea/) – you can use the free Community edition or buy the Ultimate edition. Scala and ScalaFX works fine with both.
  1. Install Scala plugin.
  1. Generate IntelliJ configuration automatically using SBT
    * Change to directory into which you checked out ScalaFX and start SBT
    * To create IDEA configuration, on SBT command prompt type: “gen-idea”. This will start download of necessary libraries, including Scala, and generate IDEA configuration. It may take a while.
    * There is a glitch in the gen-idea task (sbt-idea plugin v.1.2.0), you will need to do small manual correction of the configuration. It is described in the next step
  1. Open the new configuration in IntelliJ – select “Open Project” and navigate to ScalaFX directory
  1. You may need to correct a generated configuration glitch:
    * Select “File > Project Structure “
    * In the middle pane highlight “scalafx-build”
    * In the right pane select tab “Paths”
    * If the “Output path” and the “Test output path” are the same you may have a problem. It can be easily fixed. Add “-test” at the end of the “Test output path”, you will have something like `…\project\target\scala_2.9.2-test`. Click “OK”
At this point you should be able to build, test and develop ScalaFX!

## Generation of Eclipse Scala IDE setup ##
  1. Install the [e(fx)clipse for the lazy](http://efxclipse.org/install.html#for-the-lazy) in order to get some support for JavaFX 2.x and various version control systems.
    * <sub>When on Linux, check you have Mercurial binaries already installed.</sub>
  1. Edit the `eclipse.ini` to set the maximum heap size to 2GB and to point to your JDK7 as JVM.
  1. Add the plugin for [Scala IDE](http://scala-ide.org/download/milestone.html#update_site_for_eclipse_3842_juno) by adding a new software source for http://download.scala-ide.org/sdk/e38/scala29/dev/site/ if using Scala 2.9 or http://download.scala-ide.org/sdk/e38/scala210/dev/site/ if using Scala 2.10 for your development.
  1. On Windows e(fx)clipse already comes with Mercurial, when on Linux add the plugin for [Mercurial](http://javaforge.com/project/HGE) by adding a new software source for http://cbes.javaforge.com/update
  1. Generate the projects's configuration with SBT
    * Change to directory into which you checked out ScalaFX and start SBT
    * To create Eclipse configuration, on SBT command prompt type: “eclipse”. This will start download of necessary libraries, including Scala, and generate Eclipse configuration. It may take a while.
  1. Restart your Eclipse to let it activate the new plugin<sub>(s)</sub>


At this point you should be able to build, test and develop ScalaFX!