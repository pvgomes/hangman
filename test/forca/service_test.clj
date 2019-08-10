(ns forca.service-test
  (:require [clojure.test :refer :all]
            [forca.service :refer :all]
            [forca.service :as service]))

(deftest got-it-test
  (testing "on got-it check if can got right letters"
    (is (true? (service/got-it? "a" "paralelepipedo")))
    (is (false? (service/got-it? "j" "paralelepipedo")))
    (is (false? (service/got-it? "A" "paralelepipedo")))
    (is (false? (service/got-it? "D" "paralelepipedo")))
    (is (true? (service/got-it? "e" "paralelepipedo")))))

(deftest got-it-every-word-test
  (testing "check if we can validate all word"
    (is (true? (got-it-every-word? "verde" #{"v" "r" "e" "d"})))
    (is (true? (got-it-every-word? "lar" #{"a" "r" "l"})))
    (is (false? (got-it-every-word? "lar" #{"A" "r" "l"})))
    (is (false? (got-it-every-word? "pulou" #{})))))
