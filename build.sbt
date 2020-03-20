scalaVersion := "2.13.1"

crossScalaVersions := Seq("2.12.11", "2.13.1")

fork in run := true

libraryDependencies +=
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
