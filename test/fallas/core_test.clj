(ns fallas.core-test
  (:require [clojure.test :refer :all]
            [fallas.core :refer :all]
            [fallas.types])
  (:import [fallas.types Rule Frame]))



(deftest success_rule_test
  (testing "evaluate rule for success situation returns true"
    (def r (Rule. "Test Rule" ["x"] (fn [x] (= (:x x) 2))))
    (is (= (.evaluate r {:x 2}) true))))


(deftest error_rule_test
  (testing "evaluate rule for error situation returns false"
    (def r (Rule. "Test Rule" ["x"] (fn [x] (= (:x x) 2))))
    (is (= (.evaluate r {:x 100}) false))))


(deftest success_frame_test
  (testing "evaluate frame for success situation returns true"
    (def rule (Rule. "Name" ["x"] (fn [x] (= (:x x) 1))))
    (def rule2 (Rule. "Name2" ["y"] (fn [x] (= (:y x) 3))))
    (def frame (Frame. "Frame"  [rule rule2]))
    (is (= (.evaluate frame {:x 1 :y 3}) true))))


(deftest error_frame_test
  (testing "evaluate frame for error situation returns false"
    (def rule (Rule. "Name" ["x"] (fn [x] (= (:x x) 1))))
    (def rule2 (Rule. "Name2" ["y"] (fn [x] (= (:y x) 3))))
    (def frame (Frame. "Frame"  [rule rule2]))
    (is (= (.evaluate frame {:x 1 :y 5}) false))))
