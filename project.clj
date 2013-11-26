(defproject parseapp-cljs "0.5.0-SNAPSHOT"
  :description "clojurescript to parse cloud code"
  :url "https://github.com/utahstreetlabs/parseapp-cljs"
  :repositories {
    "sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"
  }
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/core.async "0.1.242.0-44b1e3-alpha"]
                 [com.cemerick/url "0.1.0"]]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj"]
  :cljsbuild {
    :builds {
      :main {
        :source-paths ["src/cljs"]
        :compiler {:optimizations :whitespace
                   :pretty-print true}
        :jar true}}})
