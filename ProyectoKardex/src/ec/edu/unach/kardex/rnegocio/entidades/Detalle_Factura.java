/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.entidades;

import java.util.*;

public class Detalle_Factura {
    private String id;
    private Producto producto;
    private Factura factura;
    private int cantidad;
    private double total_vendido;

    public Detalle_Factura() {
    }

    public Detalle_Factura(String id, Producto producto, Factura factura, int cantidad, double total_vendido) {
        this.id = id;
        this.producto = producto;
        this.factura = factura;
        this.cantidad = cantidad;
        this.total_vendido = total_vendido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal_vendido() {
        return total_vendido;
    }

    public void setTotal_vendido(double total_vendido) {
        this.total_vendido = total_vendido;
    }
    
}
