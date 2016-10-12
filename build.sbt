name := "scala-spray"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "io.spray" %% "spray-can" % "1.3.4",
  "io.spray" %% "spray-http" % "1.3.4",
  "io.spray" %% "spray-routing" % "1.3.4",
  "net.liftweb" %% "lift-json" % "2.6.3",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "mysql" % "mysql-connector-java" % "6.0.4",
  "com.typesafe.akka" %% "akka-actor" % "2.4.11",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.11",
  "ch.qos.logback" % "logback-classic" % "1.1.7"
)

resolvers ++= Seq(
  "Spray repository" at "http://repo.spray.io",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)
