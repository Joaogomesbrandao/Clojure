(defn read-int []
  (Integer/parseInt (read-line)))

(defn out [a b]
  (if (pos? a)
    (do
      (println b)
      (out (dec a) b))
    nil))

((defn -main []
   (let [a (read-int)]
     (let [word (read-line)]
       (out a word)))))
