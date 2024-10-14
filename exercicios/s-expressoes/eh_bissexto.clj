(defn read-int []
    (Integer/parseInt (read-line)))

(defn eh_bissexto [n]
  (cond
    (or (= (mod n 400) 0) (= (mod n 4) 0)) "É bissexto!"
    :else "Não é bissexto!"
    )
  )

((defn -main []
   (let [n (read-int)]
     (println (eh_bissexto n)))))
