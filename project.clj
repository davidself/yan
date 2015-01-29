(defproject yan "0.1.0"
            :url "https://github.com/davidself/yan"
            :license {:name "Apache License, Version 2.0"
                      :url "http://www.apache.org/licenses/LICENSE-2.0"}
            :eval-in-leiningen true
            :dependencies[[org.clojure/clojure "1.6.0"]
                          [org.clojure/clojurescript "0.0-2740"]
                          [org.omcljs/om "0.8.7"]
                          [racehub/om-bootstrap "0.3.4"]
                          [com.datomic/datomic-free "0.9.5130" :exclusions [joda-time]]])