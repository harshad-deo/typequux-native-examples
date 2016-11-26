name := "typequux-native-examples"
organization := "com.simianquant"
version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

enablePlugins(ScalaNativePlugin)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "com.simianquant" %%% "typequux" % "0.3.2-SNAPSHOT"
)
