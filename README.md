Clojure OpenShift cartridge
===========================

This is a template of DIY Lein-based Clojure cartridge for RedHat [OpenShift](https://www.openshift.com) platform. It supports lein dependency management/commands and thus arbitrary Clojure apps execution.

To start, check out these files:

    .openshift/action_hooks/start
    .openshift/action_hooks/stop 
    project.clj

`start` script defines `HOST` and `PORT` env variables for your app to bind to.

To test your app locally run `bin/run_local` and point browser to [http://localhost:8080](http://localhost:8080).

I've used [http-kit](http://http-kit.org) to demonstrate how it's not locked to any tomcat/jetty/java container stuff.

`static/` is for externally exposed static content (not used in this example).

Deployed version of this app is [available here](http://someapp-tonsky.rhcloud.com).