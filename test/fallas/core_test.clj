(ns fallas.core-test
  (:require [clojure.test :refer :all]
            [fallas.core :refer :all]
            [fallas.types]
            [fallas.frames :as m]
            [clj-time.core :as t]
            [fallas.situations :as s])
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
    (def frame (Frame. "Frame" "Critical" [rule rule2]))
    (is (= (.evaluate frame {:x 1 :y 3}) true))))


(deftest error_frame_test
  (testing "evaluate frame for error situation returns false"
    (def rule (Rule. "Name" ["x"] (fn [x] (= (:x x) 1))))
    (def rule2 (Rule. "Name2" ["y"] (fn [x] (= (:y x) 3))))
    (def frame (Frame. "Frame" "High" [rule rule2]))
    (is (= (.evaluate frame {:x 1 :y 5}) false))))


(deftest test_marco_1
  (testing "Marco 1"
    (is (= (.evaluate m/marco1 (:exito s/SituacionesMarco1)) true))
    (is (= (.evaluate m/marco1 (:error1 s/SituacionesMarco1)) false))
    (is (= (.evaluate m/marco1 (:error2 s/SituacionesMarco1)) false))))


(deftest test_marco_2
  (testing "Marco 2"
    (is (= (.evaluate m/marco2 (:exito s/SituacionesMarco2)) true))
    (is (= (.evaluate m/marco2 (:error1 s/SituacionesMarco2)) false))
    (is (= (.evaluate m/marco2 (:error2 s/SituacionesMarco2)) false))))


(deftest test_marco_3
  (testing "Marco 3"
    (is (= (.evaluate m/marco3 (:exito s/SituacionesMarco3)) true))
    (is (= (.evaluate m/marco3 (:error1 s/SituacionesMarco3)) false))
    (is (= (.evaluate m/marco3 (:error2 s/SituacionesMarco3)) false))))


(deftest test_marco_4
  (testing "Marco 4"
    (is (= (.evaluate m/marco4 (:exito s/SituacionesMarco4)) true))
    (is (= (.evaluate m/marco4 (:error1 s/SituacionesMarco4)) false))
    (is (= (.evaluate m/marco4 (:error2 s/SituacionesMarco4)) false))))