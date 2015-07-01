(ns fallas.core
  (:require [clojure.tools.cli :refer [cli]]
            [clojure.data.csv :as csv]
            [clojure.java.io  :as io]
            [clojure.string :as string])
  (:gen-class))

(load "rule")

(def cli-options  [["-h" "--help" "Muestar la pantalla de ayuda"
                    :default false
                    :flag true]
                  ["-i" "--input" "Archivo que contiene los datos de entrada"
                    :default "./input.csv"]])

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


(defn print-all [registers]
  (map println registers)
  )


(defn read-csv [csv-file]
  (with-open [reader (io/reader csv-file)]
    (->> (rest (csv/read-csv reader))
      (apply println)
      )
    ))

(defn -main [& args]
;  (let [[options arguments summary] (apply cli args cli-options)]
;    (when (:help options) (exit 0 (usage summary)))
;
;    (read-csv (:input options))
;
;  )

  (def rule (Rule. "Name" ["slot1" "slot2"] (fn [x] (compare (:x x) 1))))
  (println (evaluate rule [:x 2]))
  (println (evaluate rule [:x 1]))

  (println rule)
  (println "Hello, World!")
)
