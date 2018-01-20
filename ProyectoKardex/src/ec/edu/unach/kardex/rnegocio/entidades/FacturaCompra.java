/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.entidades;

import java.util.Date;

/**
 *
 * @author Davidssito Campos
 */
import java.util.*;
public class FacturaCompra {
    private int codFacturaCompra;
    private Date fecha;
    private Proveedor proveedor;

    public FacturaCompra() {
    }

    public FacturaCompra(int codFacturaCompra, Date fecha, Proveedor provedor) {
        this.codFacturaCompra = codFacturaCompra;
        this.fecha = fecha;
        this.proveedor = provedor;
    }

    public int getCodFacturaCompra() {
        return codFacturaCompra;
    }

    public void setCodFacturaCompra(int codFacturaCompra) {
        this.codFacturaCompra = codFacturaCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor provedor) {
        this.proveedor = provedor;
    }
 
    
}
