(defproject parseapp-cljs "0.9.0"
  :description "clojurescript to parse cloud code"
  :url "https://github.com/utahstreetlabs/parseapp-cljs"
  :repositories {
    "sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"
  }
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.cemerick/url "0.1.0"]
                 [com.tvachon/core.async "0.2.0"]
                 [org.clojure/tools.reader "0.8.1"]]
  :plugins [[lein-cljsbuild "1.0.0"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj" "test/clj"
                 ;; use a custom version of ClojureScript
                 "comp/clojurescript/src/clj"
                 "comp/clojurescript/src/cljs"]
  :cljsbuild {
    :builds {
      :main {
        :source-paths ["src/cljs"]
        :jar true}

      :test {:source-paths ["src/cljs" "test/cljs"]
             :compiler {:output-dir "test_app/cloud/cljs"
                        :output-to "test_app/cloud/cljs/cljs.js"
                        :source-map "test_app/cloud/cljs/cljs.js.map"
                        :optimizations :whitespace
                        :pretty-print true
                        :target :nodejs
                        :preamble ["parse_preamble.js"]}}}})
