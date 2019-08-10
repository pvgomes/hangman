(ns forca.service)

(defn lose [] (println "You lose :("))
(defn win [] (println "You win :)"))

(defn missing-letters [word hits]
  (remove (fn [letter] (contains? hits (str letter))) word))

(defn got-it-every-word? [word hits]
  (empty? (missing-letters word hits)))

(defn read-letter! [] (read-line))

(defn got-it? [attempt word] (.contains word attempt))

(defn print-hangman [lifes word hits]
  (println "Remain lifes: " lifes)
  (doseq [letter (seq word)]
    (if (contains? hits (str letter))
      (print letter " ")
      (print "_" " ")))
  (println))

(defn game [lifes word hits]
  (print-hangman lifes word hits)
  (cond
    (= lifes 0) (lose)
    (got-it-every-word? word hits) (win)
    :else
    (let [attempt (read-letter!)]
      (if (got-it? attempt word)
        (do
          (println "Right letter, great!")
          (recur lifes word (conj hits attempt)))
        (do
          (println "Wrong leeter, lost one heart!")
          (recur (dec lifes) word hits))))))
