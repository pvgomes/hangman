(ns forca.server
  (:require [forca.service :as service]))

  (def total-of-lifes 6)
  (def secret-word "paralelepipedo")

  (defn start-game []
    (service/game total-of-lifes secret-word #{})
    )

  (defn -main [& args]
    (start-game))