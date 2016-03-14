{:user {:dependencies [[org.clojure/tools.namespace "0.2.10"]
                       [org.clojure/tools.nrepl "0.2.12"]
                       [potemkin "0.4.3"]
                       [alembic "0.3.2"]
                       [criterium "0.4.3"]]
        :plugins [[cider/cider-nrepl "0.10.0"]
                  [refactor-nrepl "1.2.0"]
                  [lein-cljfmt "0.3.0"]
                  [jonase/eastwood "0.2.3"]
                  [lein-try "0.4.3"]]}}
                  [jonase/eastwood "0.2.3"]
                  [lein-try "0.4.3"]
                  [venantius/ultra "0.4.1"]
                  [com.jakemccrary/lein-test-refresh "0.14.0"]
                  [lein-kibit "0.1.2"]]
        :test-refresh {:changes-only true
                       :growl false
                       :notify-command ["notify"]
                       :quiet true}
        :ultra {:color-scheme :solarized_dark
                :repl false}}}
