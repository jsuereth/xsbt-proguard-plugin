resolvers += Resolver.url("Typesafe Repo", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("Typesafe nightlies", url("https://typesafe.artifactoryonline.com/typesafe/ivy-snapshots/"))(Resolver.ivyStylePatterns)

libraryDependencies <+= sbtVersion {
  case "0.11.2" => "org.scala-tools.sbt" %% "scripted-plugin" % "0.11.2"
  case "0.11.3" => "org.scala-sbt" %% "scripted-plugin" % "0.11.3"
  case x        => "org.scala-sbt" %% "sbt-scripted" % x
}
