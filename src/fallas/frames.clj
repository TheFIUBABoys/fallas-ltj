(ns fallas.frames
  (:require [fallas.types]
            [clj-time.core :as t])
  (:import [fallas.types Rule Frame]))

(def regla_ps (Rule. "Proveedor de Separadores" ["tipo_proveedor"] (fn [x] (= (:tipo_proveedor x) "PS"))))
(def regla_esp_cor (Rule. "Especificación Técnica Correcta" ["especificacion_correcta"]
                     (fn [x] (= (:especificacion_correcta x) true))))
(def marco1 (Frame. "Proveedor de separadores con entrega incorrecta" "Media" [regla_ps regla_esp_cor]))


(def regla_pc (Rule. "Proveedor de Compresores" ["tipo_proveedor"] (fn [x] (= (:tipo_proveedor x) "PC"))))
(def regla_eval_apr (Rule. "Evaluación Técnica Aprobada" ["evaluacion_aprobada"] (fn [x] (= (:evaluacion_aprobada x) true))))
(def marco2 (Frame. "Proveedor de compresores con calidad defectuosa" "Grave" [regla_pc regla_eval_apr]))


(def regla_pt (Rule. "Proveedor de Tratadores de Gas" ["tipo_proveedor"] (fn [x] (= (:tipo_proveedor x) "PT"))))
(def regla_satif_dem (Rule. "Satisface Demanda" ["cantidad" "disponibilidad"] (fn [x] (>= (:disponibilidad x) (:cantidad x)))))
(def marco3 (Frame. "Proveedor de tratamiento de gases sin disponibilidad" "Media" [regla_pt regla_satif_dem]))


; Regla Proveedor de Compresores ya esta definida
(def regla_ent_plazo (Rule. "Entrega en plazo" ["fecha_de_entrega_pautada" "fecha_de_entrega_real"]
                       (fn [x] (t/before? (:fecha_de_entrega_real x) (:fecha_de_entrega_pautada x)))))
(def marco4 (Frame. "Proveedor de cañerías con entrega atrasada" "Grave" [regla_pc regla_ent_plazo]))