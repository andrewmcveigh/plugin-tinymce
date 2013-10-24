(ns plugin-tinymce.core)

(defn js [selector]
  (list [:script {:src "/plugins/tinymce/js/tinymce/tinymce.min.js"}]
        [:script (format "tinymce.init({selector: %s});" selector)]))
