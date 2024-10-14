(defn read-int []
  (Integer/parseInt (read-line)))

(defn triangles_type [a b c]
  (let [side (sort [a b c])]
    (if (<= (+ (first side) (second side)) (last side))
            nil
            (cond 
              (= a b c) "equilátero"
              (or (= a b) (= a c) (= b c)) "isósceles"
              :else "escaleno"
             ))))

((defn -main []
   (let [a (read-int)]
     (let [b (read-int)]
       (let [c (read-int)]
         (println (triangles_type a b c)))))))
