;; Ingrid Lima dos Santos
;; q1. Utilizando a linguagem Clojure, crie uma função chamada ultimo que receba uma lista e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.  
(defn ultimo  [x]
  (nth x (- (count x) 1)))
(println "\n ultimo lista [1,2,3,4]: " (ultimo [1,2,3,4]))
;; q2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e devolva o penúltimo elemento desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.  
(defn penultimo [x]
  (nth x (- (count x) 2)))
(println "\n penultimo lista [1,2,3,4,5]: " (penultimo [1,2,3,4,5]))

;; q3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o  elemento que  está na posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn elementoN [lista n]
  (if (= n 1)
    (first lista)
    (elementoN (rest lista) (- n 1))))
(println "\n elemento 3 [-1,3,5,7,9]: " (elementoN [-1,3,5,7,9] 3))

;; q4. Utilizando a linguagem Clojure, crie uma função chamada inverso que receba uma lista e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.  
(defn inverso [x]
  (loop [x x
         acc (empty x)]
    (if (empty? x)
      acc
      (recur (rest x) (cons (first x) acc)))))
(println "\n inverso [1,2,3]: " (inverso [1,2,3]))
;; q5. Utilizando a linguagem Clojure, crie uma função chamada mdc que receba dois inteiros e devolve o mínimo divisor comum entre eles. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 
(defn mdc [a b]
  (if (= b 0)
    a
    (mdc b (mod a b))))
(println "\n mdc 24 18: " (mdc 24 18))
