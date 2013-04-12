(defproject someapp "0.1.0-SNAPSHOT"
  :warn-on-reflection  true
  :source-paths       ["src"]
  :resource-paths     ["resources"]
  :main           someapp.server
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [http-kit "2.0.0"]]
  :jvm-opts     ["-Dfile.encoding=UTF-8"])