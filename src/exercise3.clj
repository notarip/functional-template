(ns exercise3)

(defn fibonacci
  "Given a fibonacci number return the  result"
  [n]
   (if (< n 2) n  (+ (fibonacci (- n 1)) (fibonacci (- n 2))))
  )
