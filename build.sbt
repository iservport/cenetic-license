import _root_.sbt.Keys._

name := "cenetic-license"

organization := "com.iservport"

version := "1.0"

scalaVersion := "2.11.7"

mainClass in Compile := Some("com.ceneticlicense..Application")

libraryDependencies ++= Seq(
  "org.scala-lang"             % "scala-library"                % "2.11.7",
  "org.springframework.boot"   % "spring-boot-starter-web"      % "1.3.2.RELEASE",
  "org.springframework.boot"   % "spring-boot-starter-data-jpa" % "1.3.2.RELEASE",
  "org.springframework.boot"   % "spring-boot-starter-actuator" % "1.3.2.RELEASE",
  "org.springframework.social" % "spring-social-web"            % "1.1.4.RELEASE",
  "org.helianto" % "helianto-document"         % "0.6.0-SNAPSHOT",
  "commons-io"          % "commons-io"         % "2.4",
  "org.freemarker" % "freemarker" % "2.3.19",
  "mysql" % "mysql-connector-java" % "5.1.26",
  "com.zaxxer" % "HikariCP" % "2.4.3",
  "junit"  % "junit"    % "4.10" % Test,
  "org.scalactic"  % "scalactic_2.11" % "2.2.+" % Test,
  "org.scalatest"  % "scalatest_2.11" % "2.2.+" % Test
)

resolvers ++= Seq(
  "Typesafe Releases"   at "https://repo.typesafe.com/typesafe/releases/",
  "Spring Releases"     at "http://maven.springframework.org/release",
  "Helianto Releases"   at "http://s3-sa-east-1.amazonaws.com/maven.helianto.org/release",
  "Helianto Snapshots"  at "http://s3-sa-east-1.amazonaws.com/maven.helianto.org/snapshot",
  "Artima Releases"     at "http://repo.artima.com/releases"
)
