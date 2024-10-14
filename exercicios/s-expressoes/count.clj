;; O algoritmo utiliza do Tail Call Optimization, isso significa que o loop não consome espaço adicional na pilha, pois o compilador trata o "recur" de forma semelhante a um loop iterativo.

(defn count []
  (loop [n 0]
    (println n)
    (recur (inc n))))

((defn -main []
   (count)))
