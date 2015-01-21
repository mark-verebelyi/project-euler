(ns project-euler.problem001-test
  (:require [clojure.test :refer :all]
            [project-euler.problem001 :refer :all]))

(deftest sample
  (testing "Sample - https://projecteuler.net/problem=1"
    (is (= (solve 10) 23))))

(deftest task
  (testing "Task - https://projecteuler.net/problem=1"
    (is (= (solve 1000) 233168))))


