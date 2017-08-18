(ns exercise4)

(defn summary
  "Given an array return the sum of all its elements"
  [list]
  (reduce + list)
  )