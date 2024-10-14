(defn value_at
  ([array k]
   (value_at array 0 k))
  ([array i k]
   (if (= i k)
     (first array)
     (value_at (rest array) (inc i) k))))

(assert (= 4 (value_at [0 3 2 4 1] 3)))
