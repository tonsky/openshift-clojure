(ns someapp.server
  (:require [org.httpkit.server :as server]))

(def env (into {} (System/getenv)))

; (defn async-handler [ring-request]
;   ;; unified API for WebSocket and HTTP long polling/streaming
;   (server/with-channel ring-request channel    ; get the channel
;     (if (server/websocket? channel)            ; if you want to distinguish them
;       (server/on-receive channel (fn [data]     ; two way communication
;                                   (server/send! channel data)))
;       (server/send! channel {:status 200
;                       :headers {"Content-Type" "text/plain"}
;                       :body    "Long polling?"}))))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello from http-kit v2!"})

(defn -main [& args]
  (server/run-server app { :ip (env "HOST") :port (Integer/parseInt (env "PORT")) }))