name := "spark-sftp"

organization := "com.springml"

scalaVersion := "2.11.8"

sparkVersion := "2.1.0"

spName := "springml/spark-sftp"

version := "1.1.2"

// Dependent libraries
libraryDependencies ++= Seq(
  "com.springml" % "sftp.client" % "1.0.3",
  "org.mockito" % "mockito-core" % "2.0.31-beta"
)

// used spark components
sparkComponents += "sql"

// Repositories
resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

// Spark packages
spDependencies += "com.databricks/spark-avro_2.11:3.2.0"

// Test dependencies
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
libraryDependencies += "org.apache.avro" % "avro-mapred" % "1.7.7" % "test" exclude("org.mortbay.jetty", "servlet-api")

// licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))
