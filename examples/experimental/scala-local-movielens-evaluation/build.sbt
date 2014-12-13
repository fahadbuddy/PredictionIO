
import AssemblyKeys._

assemblySettings

name := "scala-local-movielens-evaluation"

organization := "myorg"

version := "0.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "io.prediction"    %% "core"          % "0.8.3" % "provided",
  "io.prediction"    %% "engines"          % "0.8.3" % "provided",
  "org.apache.spark" %% "spark-core"    % "1.1.0" % "provided")
