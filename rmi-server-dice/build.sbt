name := "rmi-server-dice"

organization := "de.vs.rmi.server.dice"

version := "1.0"

scalaVersion := "2.11.7"

assemblyJarName in assembly := name.value + ".jar"

test in assembly := {}

libraryDependencies += "de.vs.rmi.framework" %% "rmi-framework" % "1.0"

libraryDependencies += "de.vs.rmi.api.dice" %% "rmi-api-dice" % "1.0"

assemblyMergeStrategy in assembly := {
  case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".html" => MergeStrategy.first
  case "application.conf"                            => MergeStrategy.concat
  case "unwanted.txt"                                => MergeStrategy.discard
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
