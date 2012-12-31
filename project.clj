(defproject clj-unidecode "1.0.0"
  :description "Clojure implementation of Junidecode"
  :url "http://github.com/mgrubb/clj-unidecode"
  :license {:name "BSD"
            :url "http://www.debian.org/misc/bsd.license"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]]}}
  :min-lein-version "2.0.0"
  :pom-addition [:developers [:developer
                              [:name "Michael Grubb"]
                              [:id "mgrubb"]
                              [:url "http://github.com/mgrubb"]]])
