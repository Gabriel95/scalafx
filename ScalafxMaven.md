## ScalaFX and SBT ##

This is a shot version of the [complete description](http://code.google.com/p/scalafx/source/browse/README-SBT.txt) of working with SBT.

Whe using Java 7, following lines need to be in your `build.sbt` file for any project depending upon ScalaFX (not needed for Java 8):

```
unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))
```
or
```
unmanagedJars in Compile += Attributed.blank(
    file(scala.util.Properties.javaHome) / "lib" / "jfxrt.jar")
```

in addition to the obvious:
```
libraryDependencies += "org.scalafx" %% "scalafx" % "1.0.0-R8"
```

If you run program from SBT command prompt, you need to make sure that each is using separate JVM, so add foloowing to `build.sbt`:

```
fork := true
```

A sample project [scalafx-hello-world](https://code.google.com/p/scalafx/source/browse/#hg%2Fscalafx-hello-world) provides a complete example of using SBT.

## ScalaFX and Maven ##

For Scala 2.10
```
<dependency>
    <groupId>org.scalafx</groupId>
    <artifactId>scalafx_2.10</artifactId>
    <version>1.0.0-R8</version>
</dependency>
```

you will also need to add dependency on `$JAVA_HOME/jre/lib/jfxrt.jar` if you are using Java 7.

For other variants and latest released versions see [ScalaFX on Sonatype](http://search.maven.org/#search|ga|1|scalafx).