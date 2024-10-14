(require '[clojure.string :as str])

(defn vowel-first? [word]
  (contains? #{"a" "e" "i" "o" "u"} (str (first word))))

(defn ini-vogais [array]
  (filter vowel-first? (map str/lower-case array)))

(assert (= [] (ini-vogais [])))
(assert (= '("a") (ini-vogais '("j" "b" "a"))))
