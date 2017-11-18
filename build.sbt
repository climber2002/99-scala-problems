name := "FP in Scala"
version := "1.0"
scalaVersion := "2.12.3"

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.0-MF"
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.0.0" % "test")

