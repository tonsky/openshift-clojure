(ns someapp.server
  (:require [org.httpkit.server :as server]))

(def env (into {} (System/getenv)))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello from http-kit!"})

(defn -main [& args]
  (server/run-server app { :ip (env "HOST") :port (Integer/parseInt (env "PORT")) }))