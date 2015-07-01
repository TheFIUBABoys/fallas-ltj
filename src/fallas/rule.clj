(ns fallas.core (:gen-class))

(defprotocol RuleProtocol
  (evaluate [this situation] "Method to evaluate a Rule")
  )

(defrecord Rule [name slots procedure]
  RuleProtocol
  (evaluate [this situation] ((.procedure this) situation))

  )