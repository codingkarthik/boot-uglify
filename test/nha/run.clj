(ns nha.run
  (:require  [clojure.test :as t]
             [boot.core :as boot]
             [adzerk.boot-test :as boot-test]
             [clojure.java.io :as io])
  (:import [java.nio.file Files Path Paths]
           [java.nio.file.attribute BasicFileAttributes]))

;; configuration for the tests

(def js-input-path  "test/resources/samples/js/source/")
(def js-expected-path "test/resources/samples/js/expected/")
;;(def js-output-path "test/resources/samples/js/minified/")
;;(def js-output-path (Files/createTempDirectory "boot_uglify" (into-array java.nio.file.attribute.FileAttribute []))) ;; problem: appends timestamp to file names inside this folder

;; this is inconsistent depending on the platform, so always make sure it ends with a trailing slash
(def js-output-path (str (.getPath (io/file (System/getProperty "java.io.tmpdir"))) "/"))
;; (def js-output-path (.getPath (boot/tmp-dir!)))

(defn setup-tests [test-out-dir]
  ;; (def js-output-path test-out-dir)
  ;;(t/run-all-tests  #"nha.*")
  ;;(t/run-tests)
  )
