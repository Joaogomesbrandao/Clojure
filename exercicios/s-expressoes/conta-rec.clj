;;O algoritmo irá quebrar por acumular várias execuções na pilha.

(defn conta
  ([] (conta 0))
  ([num]
   (println num)
   (conta (inc num))))

((defn -main []
   (conta)))
