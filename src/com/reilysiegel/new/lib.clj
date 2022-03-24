(ns com.reilysiegel.new.lib)

(defn data-fn
  "Example data-fn handler.

  Result is merged onto existing options data."
  [data]
  nil)

(defn template-fn
  "Example template-fn handler.

  Result is used as the EDN for the template."
  [edn data]
  edn)
