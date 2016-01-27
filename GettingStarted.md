# Getting started with application development in ScalaFX #

Currently you can look at the sample project [scalafx-hello-world](https://code.google.com/p/scalafx/source/browse/#hg%2Fscalafx-hello-world) that provides a complete example of using SBT. SBT setup can be loaded into IDEA and NetBeans. Eclipse project can be creatd from SBT project using [sbteclipse](https://github.com/typesafehub/sbteclipse) plugin.

<a href='Hidden comment: 

Don"t forget to change the password when updating the virtual machine
<g:plusone size="medium">

Unknown end tag for &lt;/plusone&gt;



<wiki:toc max_depth="2" />

----
*Caution: The screenshots are outdated in many points but I am lacking time to shot them again in the near future...*

----

== What do I need to develop with ScalaFX? ==

First of all, I need to prepare my tooling:
# install the [http://www.oracle.com/technetwork/java/javase/downloads/ JavaSE Development Kit] which now includes the JavaFX SDK<br />[http://cua.li/TI/SfxDev/sfxdev-ss01.png http://cua.li/TI/SfxDev/sfxdev-tn01.png]
# install the [http://www.eclipse.org/efxclipse/install.html e(fx)clipse for the lazy] in order to get some support for JavaFX 2.x and various version control systems<br />[http://cua.li/TI/SfxDev/sfxdev-ss02.png http://cua.li/TI/SfxDev/sfxdev-tn02.png] <br />(when on Linux, check you have Mercurial binaries already installed)
# make a symbolic link from jdk7 to your uncompressed jdk1.7.0_21 directory <br />[http://cua.li/TI/SfxDev/sfxdev-ss03.png http://cua.li/TI/SfxDev/sfxdev-tn03.png]
# edit the eclipse.ini to set the maximum heap size to 2GB and to point to the jdk7 as JVM <br />[http://cua.li/TI/SfxDev/sfxdev-ss04.png http://cua.li/TI/SfxDev/sfxdev-tn04.png] <br />the stack was still at 512m on this screenshot
# add the plugin for [http://scala-ide.org/download/milestone.html#update_site_for_eclipse_3842_juno Scala IDE] by adding a new software source for http://download.scala-ide.org/sdk/e38/scala210/stable/site <br />[http://cua.li/TI/SfxDev/sfxdev-ss05.png http://cua.li/TI/SfxDev/sfxdev-tn05.png] [http://cua.li/TI/SfxDev/sfxdev-ss06.png http://cua.li/TI/SfxDev/sfxdev-tn06.png]
# e(fx)clipse for Windows already comes with Mercurial, when on Linux add the plugin for [https://bitbucket.org/mercurialeclipse/main/ Mercurial] by adding a new software source for http://mercurialeclipse.eclipselabs.org.codespot.com/hg.wiki/update_site/stable/ <br />[http://cua.li/TI/SfxDev/sfxdev-ss07.png http://cua.li/TI/SfxDev/sfxdev-tn07.png] [http://cua.li/TI/SfxDev/sfxdev-ss08.png http://cua.li/TI/SfxDev/sfxdev-tn08.png]
# restart your Eclipse to let it activate the new plugin(s)


== How do I configure my Eclipse? ==

Since the project is still lacking a downloadable ScalaFX bundle, I will clone the ScalaFX repository and bundle it on my very own:
# clone the ScalaFX repository into your workspace from https://code.google.com/p/scalafx/ <br />[http://cua.li/TI/SfxDev/sfxdev-ss11.png http://cua.li/TI/SfxDev/sfxdev-tn11.png] [http://cua.li/TI/SfxDev/sfxdev-ss12.png http://cua.li/TI/SfxDev/sfxdev-tn12.png]
# create a new Scala project (I will call it SFX, as the airport code for San Felix in Venezuela) in your workspace <br />[http://cua.li/TI/SfxDev/sfxdev-ss13.png http://cua.li/TI/SfxDev/sfxdev-tn13.png] [http://cua.li/TI/SfxDev/sfxdev-ss14.png http://cua.li/TI/SfxDev/sfxdev-tn14.png]
# add the JavaFX runtime, through the JavaFX SDK library, as dependency to your SFX project. This will add the jre/lib/jfxrt.jar from the JRE system librairies. <br />[http://cua.li/TI/SfxDev/sfxdev-ss15.png http://cua.li/TI/SfxDev/sfxdev-tn15.png]
# mark the JavaFX library as exported by the SFX project <br />[http://cua.li/TI/SfxDev/sfxdev-ss16.png http://cua.li/TI/SfxDev/sfxdev-tn16.png]
# remove the src folder from the SFX project and then link the src folder from the ScalaFX project into the SFX one <br />[http://cua.li/TI/SfxDev/sfxdev-ss17.png http://cua.li/TI/SfxDev/sfxdev-tn17.png] [http://cua.li/TI/SfxDev/sfxdev-ss18.png http://cua.li/TI/SfxDev/sfxdev-tn18.png]
# close the ScalaFX project in order to avoid building it entirely on every workspace refresh <br />(the first builds of ScalaFX and SFX might be quite long since there are many implicits)


== Now experiment the joy of ScalaFX! ==

Once you got your workbench configured, the pure pleasure will begin:
# create your first Scala project depending on the ScalaFX [https://code.google.com/p/scalafx/downloads/detail?name=scalafx_2.10-1.0.0-M3.jar downloadable jar] or based on the
[http://search.maven.org/#search|ga|1|scalafx Maven Central Repository] artifacts. <br />[http://cua.li/TI/SfxDev/sfxdev-ss21.png http://cua.li/TI/SfxDev/sfxdev-tn21.png] <wiki:comment>[http://cua.li/TI/SfxDev/sfxdev-ss22.png http://cua.li/TI/SfxDev/sfxdev-tn22.png]
# add the JavaFX runtime, through the JavaFX SDK library, as dependency to your project. This will add the jre/lib/jfxrt.jar from the JRE system librairies. <br />[http://cua.li/TI/SfxDev/sfxdev-ss15.png http://cua.li/TI/SfxDev/sfxdev-tn15.png]
# create your first Scala *object* extending from scalafx.application.JFXApp <br />[http://cua.li/TI/SfxDev/sfxdev-ss23.png http://cua.li/TI/SfxDev/sfxdev-tn23.png] [http://cua.li/TI/SfxDev/sfxdev-ss24.png http://cua.li/TI/SfxDev/sfxdev-tn24.png]
# run the World object as Scala Application <br />[http://cua.li/TI/SfxDev/sfxdev-ss25.png http://cua.li/TI/SfxDev/sfxdev-tn25.png] [http://cua.li/TI/SfxDev/sfxdev-ss26.png http://cua.li/TI/SfxDev/sfxdev-tn26.png]

Listing of the `hello/World.scala` application object
```
package hello

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle
import scalafx.stage.Stage

object World extends JFXApp {
  stage = new JFXApp.PrimaryStage {
    title = "Hello World"
    width = 600
    height = 450
    scene = new Scene {
      fill = Color.LightGreen
      content = Set(new Rectangle {
        x = 25
        y = 40
        width = 100
        height = 100
        fill <== when(hover) then Color.Green otherwise Color.Red
      })
    }
  }
}
```


== How can I have a quicker start developing my next application with ScalaFX? ==

# Download and install [https://www.virtualbox.org/  VirtualBox]  
# Download, decompress and run the [http://cua.li/TI/SfxDev/ScalaFX2012W51.7z ready virtual machine]  
# The password for the scalafx developer is ~~sFX2012W51~~ which reflects the week in which the virtual machine has been released  
# Begin to play with the SimpleDemo project  
# Replicate the environment in your own Linux machine (you can download the content of the scalafx [http://cua.li/TI/SfxDev/scalafx.tgz user"s home directory] with all the tools and projects already configured)  


Then, depending on my target, I need either an Eclipse with Android Development Tools or a !NetBeans with JavaFX SDK:
|| Visage Android ||  [http://developer.android.com/sdk/index.html Android SDK] [http://developer.android.com/sdk/installing.html Installing the Android Development Tools] ||
|| || After installing the Android Development Tools, I simply create a first Android Virtual Device which I will then use for my tests. ||
|| VisageFX || [http://netbeans.org/downloads/index.html NetBeans for Java SE] [http://www.oracle.com/technetwork/java/javafx/downloads/devpreview-1429449.html JavaFX SDK] [http://netbeans.org/kb/docs/java/javafx-setup.html Setting up NetBeans with JavaFX 2.x] ||
|| || After installing the JavaFX SDK, I define a new Java platform with JavaFX activated since it is impossible to activate JavaFX on the default platform. ||
'></a>

## What if I feel some class is missing in ScalaFX? ##

You can either
  * (**hard way**) start contributing to the project by registering on the [JavaFXAPIContributing](https://code.google.com/p/scalafx/wiki/JavaFXAPIContributing) wiki page;
  * (**easy way**) ask for help from other users in the [ScalaFX Users](http://groups.google.com/group/scalafx-users) group or request for a feature from developers in the [ScalaFX Developers](http://groups.google.com/group/scalafx-dev) group.
