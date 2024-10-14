(defn sum [OPER]
  (fn [array]
    (loop [n 0
           array array]
      (if (nil? (first array))
        n
        (recur (OPER n (first array)) (next array))))))

(def numbers (range 100000))
(def soma (sum +))
(def soma-cubos (sum (fn [x y] (+ x (* y y y)))))
(def soma-dobros (sum (fn [x y] (+ x (* 2 y)))))
(def conta (sum (fn [x y] (+ x (+ 1)))))


(assert (= 6 (soma [1 2 3])))
(assert (= 0 (soma [])))
(assert (= 100000 (conta numbers)))
