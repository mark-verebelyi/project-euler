(ns project-euler.problem001)

(defn- multiply-of [x]
  #(= 0 (mod % x)))

(defn- multiply-of-3-or-5? [x]
  ((some-fn (multiply-of 3) (multiply-of 5)) x))

(defn solve [x]
  (let [nums-to-x (range 1 x)
        filtered-nums-to-x (filter multiply-of-3-or-5? nums-to-x)]
    (reduce + filtered-nums-to-x)))