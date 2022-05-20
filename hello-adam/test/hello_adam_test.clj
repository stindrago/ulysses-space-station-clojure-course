(ns hello-adam-test
  (:require [clojure.test :refer [deftest testing is]]
            hello-adam))

(deftest send-eip-msg-test
  (is (= "Hello Dr. Korental, I'm glad about this opportunity, I'll be there. Adam."
         (hello-adam/send-eip-msg "I'm glad about this opportunity, I'll be there."))))
