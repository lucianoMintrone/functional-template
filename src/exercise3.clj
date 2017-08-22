(ns exercise3)

(def fib-seq-iterate
	(map first (iterate 
		(fn [[a b]] [b (+ a b)]) [0 1])))

(defn fibonacci
	[x]
	(nth fib-seq-iterate x))