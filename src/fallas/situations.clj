(ns fallas.situations
  (:require [clj-time.core :as t])
  (:gen-class))

(def situation1_success {:id_pedido 1
                         :elemento "separador"
                         :cantidad 3
                         :precio 10000
                         :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                         :fecha_de_entrega_real (t/date-time 2015 05 07)
                         :especificacion_correcta true
                         :evaluacion_aprobada true
                         :id_proveedor 10
                         :tipo_proveedor "PS"
                         :disponibilidad 15})

(def situation1_error1 {:id_pedido 1
                        :elemento "separador"
                        :cantidad 3
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 07)
                        :especificacion_correcta false
                        :evaluacion_aprobada true
                        :id_proveedor 10
                        :tipo_proveedor "PS"
                        :disponibilidad 15})

(def situation1_error2 {:id_pedido 1
                        :elemento "separador"
                        :cantidad 3
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 07)
                        :especificacion_correcta true
                        :evaluacion_aprobada true
                        :id_proveedor 10
                        :tipo_proveedor "PC"
                        :disponibilidad 15})

(def SituacionesMarco1 {:exito situation1_success :error1 situation1_error1 :error2 situation1_error2})


(def situation2_success {:id_pedido 1
                         :elemento "compresor"
                         :cantidad 3
                         :precio 10000
                         :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                         :fecha_de_entrega_real (t/date-time 2015 05 07)
                         :especificacion_correcta true
                         :evaluacion_aprobada true
                         :id_proveedor 10
                         :tipo_proveedor "PC"
                         :disponibilidad 15})

(def situation2_error1 {:id_pedido 1
                        :elemento "compresor"
                        :cantidad 3
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 07)
                        :especificacion_correcta true
                        :evaluacion_aprobada true
                        :id_proveedor 10
                        :tipo_proveedor "PS"
                        :disponibilidad 15})

(def situation2_error2 {:id_pedido 1
                        :elemento "compresor"
                        :cantidad 3
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 07)
                        :especificacion_correcta true
                        :evaluacion_aprobada false
                        :id_proveedor 10
                        :tipo_proveedor "PC"
                        :disponibilidad 15})

(def SituacionesMarco2 {:exito situation2_success :error1 situation2_error1 :error2 situation2_error2})


(def situation3_success {:id_pedido 1
                         :elemento "tratador de gases"
                         :cantidad 5
                         :precio 10000
                         :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                         :fecha_de_entrega_real (t/date-time 2015 05 07)
                         :especificacion_correcta true
                         :evaluacion_aprobada true
                         :id_proveedor 10
                         :tipo_proveedor "PT"
                         :disponibilidad 15})

(def situation3_error1 {:id_pedido 1
                        :elemento "tratador de gases"
                        :cantidad 5
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 07)
                        :especificacion_correcta true
                        :evaluacion_aprobada true
                        :id_proveedor 10
                        :tipo_proveedor "PC"
                        :disponibilidad 15})

(def situation3_error2 {:id_pedido 1
                        :elemento "tratador de gases"
                        :cantidad 20
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 07)
                        :especificacion_correcta true
                        :evaluacion_aprobada false
                        :id_proveedor 10
                        :tipo_proveedor "PT"
                        :disponibilidad 15})

(def SituacionesMarco3 {:exito situation3_success :error1 situation3_error1 :error2 situation3_error2})


(def situation4_success {:id_pedido 1
                         :elemento "compresor"
                         :cantidad 5
                         :precio 10000
                         :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                         :fecha_de_entrega_real (t/date-time 2015 05 07)
                         :especificacion_correcta true
                         :evaluacion_aprobada true
                         :id_proveedor 10
                         :tipo_proveedor "PC"
                         :disponibilidad 15})

(def situation4_error1 {:id_pedido 1
                        :elemento "compresor"
                        :cantidad 5
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 07)
                        :especificacion_correcta true
                        :evaluacion_aprobada true
                        :id_proveedor 10
                        :tipo_proveedor "PT"
                        :disponibilidad 15})

(def situation4_error2 {:id_pedido 1
                        :elemento "compresor"
                        :cantidad 20
                        :precio 10000
                        :fecha_de_entrega_pautada (t/date-time 2015 05 10)
                        :fecha_de_entrega_real (t/date-time 2015 05 15)
                        :especificacion_correcta true
                        :evaluacion_aprobada false
                        :id_proveedor 10
                        :tipo_proveedor "PC"
                        :disponibilidad 15})

(def SituacionesMarco4 {:exito situation4_success :error1 situation4_error1 :error2 situation4_error2})