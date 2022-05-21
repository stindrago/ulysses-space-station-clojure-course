(ns application-form-error-test
  (:require [clojure.test :refer [deftest testing is]]
            application-form-error))

(deftest nick-test
  (is (= "Adam70" application-form-error/nick)))
(deftest genetic-signature-test
  (is (= "HARABOK22" application-form-error/genetic-signature)))
(deftest birth-year-test
  (is (= 2055 application-form-error/birth-year)))
(deftest T&Cs-test
  (is (true? application-form-error/T&Cs)))
