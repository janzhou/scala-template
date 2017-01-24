import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(List(
    organization := "org.janzhou",
    scalaVersion := "2.12.1",
    version      := "0.1.x"
  )),
  name := "scala-template",
  description := "Scala Template",
  crossScalaVersions := Seq("2.11.8", "2.12.1"),
  scalacOptions in Compile in doc ++= Seq(
    "-doc-title", description.value,
    "-sourcepath", (baseDirectory in ThisBuild).value.toString,
    "-doc-source-url", s"https://github.com/janzhou/${name.value}/tree/${(version in ThisBuild).value.toString}€{FILE_PATH}.scala"
  ),
  libraryDependencies += scalaTest % Test
)
