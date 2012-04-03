resolvers += Resolver.url("Typesafe Repo", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("Typesafe nightlies", url("https://typesafe.artifactoryonline.com/typesafe/ivy-snapshots/"))(Resolver.ivyStylePatterns)

libraryDependencies <+= sbtVersion {
  case x if x startsWith "0.11." => "org.scala-tools.sbt" %% "scripted-plugin" % x
  case x                         => "org.scala-sbt" %% "sbt-scripted" % x
}
