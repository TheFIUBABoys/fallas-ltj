(ns fallas.types (:gen-class))

(defprotocol RuleProtocol
  (evaluate [this situation] "Method to evaluate a Rule")
  )

(defrecord Rule [name slots procedure]
  RuleProtocol
  (evaluate [this situation] (procedure situation)
    )
  )

(defrecord Frame [name rules]
  RuleProtocol
  (evaluate [this situation]
    (def success true)
    (doseq [rule rules]
      (if (= (evaluate rule situation)) false) (def success false)
      )
    success
    )
  )