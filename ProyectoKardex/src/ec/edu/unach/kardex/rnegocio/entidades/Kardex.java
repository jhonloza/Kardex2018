/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.entidades;

import java.util.*;

public class Kardex {
  private String id;
private Proveedor_Producto proveedor_producto;
private Detalle_Factura detalle_factura;
private Date fecha_emision;
private int existencias;

    public Kardex() {
    }

    public Kardex(String id, Proveedor_Producto proveedor_producto, Detalle_Factura detalle_factura, Date fecha_emision, int existencias) {
        this.id = id;
        this.proveedor_producto = proveedor_producto;
        this.detalle_factura = detalle_factura;
        this.fecha_emision = fecha_emision;
        this.existencias = existencias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Proveedor_Producto getProveedor_producto() {
        return proveedor_producto;
    }

    public void setProveedor_producto(Proveedor_Producto proveedor_producto) {
        this.proveedor_producto = proveedor_producto;
    }

    public Detalle_Factura getDetalle_factura() {
        return detalle_factura;
    }

    public void setDetalle_factura(Detalle_Factura detalle_factura) {
        this.detalle_factura = detalle_factura;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

}
