(defn length
  ([array] (length array 0))
  ([array size]
  (if (= array '())
    size
    (length (rest array) (inc size)))))

(assert (= 3 (length [1 2 3] 0)))
