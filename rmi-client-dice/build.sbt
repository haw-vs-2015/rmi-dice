name := "rmi-client-dice"

organization := "de.vs.rmi.client.dice"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "de.vs.rmi.api.dice" %% "rmi-api-dice" % "1.0"

libraryDependencies += "de.vs.rmi.framework" %% "rmi-framework" % "1.0"

libraryDependencies += "com.typesafe.play" % "play-json_2.11" % "2.4.3"
