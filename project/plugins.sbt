resolvers += 
    Resolver.url("bintray-sbt-plugin-releases-masseguillaume",
        url("http://dl.bintray.com/rafael-brandao/sbt-plugins")
    )(Resolver.ivyStylePatterns)

addSbtPlugin("com.github.rafael-brandao" % "sbt-scalabuff" % "1.4.0")
