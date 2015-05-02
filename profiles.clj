{:user {:dependencies [[org.clojure/tools.namespace "0.2.10"]
                       [potemkin "0.3.13"]
                       [alembic "0.3.2"]
                       [criterium "0.4.3"]]
        :plugins [[cider/cider-nrepl "0.8.1"]
                  [lein-cljfmt "0.1.7"]
                  [jonase/eastwood "0.2.1"]
                  [lein-kibit "0.0.8"]]
        :repl-options { :init-ns user }
        :source-paths [#=(eval (str (System/getProperty "user.home") "/.lein/src"))]}}
