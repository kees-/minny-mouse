(ns app.core
  (:require [reagent.dom :as rdom]))

(defn root-view []
  [:div.container
   [:h3 "Close this program before he gets you"]
   [:div.row
    [:video {:autoplay "" :muted "" :controls ""}
     [:source {:src "00205a.mp4" :type "video/mp4"}]]]
   [:h3#got.invisible "He got you"]])

(defn ^:dev/after-load mount-ui []
  (rdom/render [root-view] (js/document.getElementById "root"))
  (.add (.-classList js/document.body) "fade-in")
  (js/setTimeout
   (fn []
     (let [got (js/document.getElementById "got")]
       (-> got .-classList (.remove "invisible"))))
   50000))

(defn ^:export main [& _]
  (mount-ui))
