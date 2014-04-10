(defproject fourclojure "0.1.0-SNAPSHOT"
   :description "My set of solutions to the 4Clojure problems."
  :url "http://www.4clojure.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot fourclojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
