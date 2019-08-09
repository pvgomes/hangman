(ns forca.core)

(def total-of-lifes 6)
(def secret-word "paralelepipedo")

(defn lose [] (println "You lose :("))
(defn win [] (println "You win :)"))

(defn missing-letters [words hits]
  (remove (fn [letter] (contains? hits (str letter))) words)
  )

(defn got-it-every-word? [words hits]
    (empty? (missing-letters words hits))
  )

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
          (recur lifes word (conj hits attempt))
          )
        (do
          (println "Wrong leeter, lost one heart!")
          (recur (dec lifes) word hits)
          )
        )
      )))

(defn start-game []
  (game total-of-lifes secret-word #{})
)
(defn -main [& args]
  (start-game))
