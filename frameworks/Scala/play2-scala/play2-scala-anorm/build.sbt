name := "play2-scala-anorm"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, PlayNettyServer)

scalaVersion := "2.12.4"


libraryDependencies ++= Seq(
  guice,
  jdbc,
  "com.typesafe.play" %% "anorm" % "2.5.3",
  "mysql" % "mysql-connector-java" % "5.1.44"
)
