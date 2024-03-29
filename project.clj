(defproject forca "0.1.0-SNAPSHOT"
  :description "hangman clojure game"
  :url "http://pvgomes.com/hangman"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :plugins [[lein-cloverage "1.0.13"]
            [lein-cljfmt "0.5.7"]
            [lein-nsorg "0.2.0"]]

  :repositories [["clojars" {:url "https://clojars.org/repo/"}]]

  :dependencies [[org.clojure/clojure "1.10.0"]]

  :aliases {"lint"            ["do" ["cljfmt" "check"] ["nsorg"]]
            "lint-fix"        ["do" ["cljfmt" "fix"] ["nsorg" "--replace"]]}

  :main forca.server

  :test-paths ["test/"]

  :repl-options {:init-ns forca.server})
