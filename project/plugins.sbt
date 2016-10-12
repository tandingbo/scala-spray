logLevel := Level.Warn

resolvers ++= Seq(
  "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype releases"  at "https://oss.sonatype.org/content/repositories/releases/"
)

addSbtPlugin("io.spray" %% "sbt-revolver" % "0.8.0")
addSbtPlugin("com.github.mpeltonen" %% "sbt-idea" % "1.6.0")
addSbtPlugin("com.eed3si9n" %% "sbt-assembly" % "0.14.3")