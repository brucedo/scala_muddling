val ScalatraVersion = "3.0.0-M3"

ThisBuild / scalaVersion := "3.2.1"
ThisBuild / organization := "ca.gc.agr"

lazy val hello = (project in file("."))
  .settings(
    name := "scala_fige",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.3.5" % "runtime",
      // https://mvnrepository.com/artifact/org.slf4j/slf4j-reload4j
      "org.slf4j" % "slf4j-reload4j" % "2.0.6" % Test,
      "org.eclipse.jetty" % "jetty-webapp" % "9.4.43.v20210629" % "container",
      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)
