(ns fallas.core
  (:require [clojure.tools.cli :refer [cli]]
             [clojure.string :as string])
  (:gen-class))

(def cli-options
  ;; An option with a required argument
  ["-h" "--help" "Muestar la pantalla de ayuda"
   :default false :flag true])


(defn usage [options-summary]
  (->> ["Este el el TP de Sistemas Automaticos de Diagnostico y Detección de Fallas I (75.67)"
        ""
        "Usage: fallas [opciones]"
        ""
        "Opciones:\n"
        options-summary
        ""
        "Por favor referirse al informe para más información"]
    (string/join \newline)))


(defn exit [status msg]
  (println msg)
  (System/exit status))


(defn -main [& args]
  (let [[options arguments summary] (cli args cli-options)]
    (when (:help options) (exit 0 (usage summary)))
  )

  (println "Hello, World!")
)
