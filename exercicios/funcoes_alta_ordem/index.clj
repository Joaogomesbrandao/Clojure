(defn index
  ([array k]
   (index array 0 k))
  ([array i k]
   (if (= array '())
     -1
     (if (= (first array) k)
       i
       (index (rest array) (inc i) k)))))

(assert (= -1 (index [3 2 1] 4)))
(assert (= 2 (index [3 2 1] 1)))
