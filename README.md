# hangman game
hangman clojure game

[![Build Status](https://travis-ci.org/pvgomes/hangman.svg?branch=master)](https://travis-ci.org/pvgomes/hangman)

### usage
`lein run`

### tests
`lein test`

### compile
`lein uberjar`

### run jar
`java -jar forca-0.1.0-SNAPSHOT-standalone.jar`

### update while programming

`(require '[forca.core :as forca] :reload)`


### Rules
- Avoid stack overflow using tail recursion `recur` 