(defn somador [OPER]
  (fn [array]
    (if (= array '())
      0
      (OPER (first array) ((somador OPER) (rest array))))))

(def soma (somador +))
(def soma-cubos (somador (fn [x y] (+ (* x x x) y))))
(def soma-dobros (somador (fn [x y] (+ (* 2 x) y))))
(def conta (somador (fn [x y] (+ (+ 1) y))))

(assert (= 6 (soma [1 2 3])))
(assert (= 0 (soma [])))
(assert (= 72 (soma-cubos [2 4])))
(assert (= 6 (soma-dobros [1 2])))
(assert (= 5 (conta [0 0 2 0 1])))
