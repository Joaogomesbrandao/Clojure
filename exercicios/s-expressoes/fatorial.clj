(defn fatorial [n]
  (if (or (= n 0) (= n 1))
    1
    (* n (fatorial (dec n)))))

((defn -main []
  (let [num (Integer/parseInt (read-line))]
    (println (fatorial num)))))
