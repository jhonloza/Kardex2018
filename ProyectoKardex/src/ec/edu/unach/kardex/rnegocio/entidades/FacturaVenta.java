
package ec.edu.unach.kardex.rnegocio.entidades;

import java.util.*;

public class FacturaVenta {
    
    private int codFacturaVenta;
    private Date fecha;
    private String cliente;

    public FacturaVenta() {
    }

    public FacturaVenta(int codFacturaVenta, Date fecha, String cliente) {
        this.codFacturaVenta = codFacturaVenta;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getCodFacturaVenta() {
        return codFacturaVenta;
    }

    public void setCodFacturaVenta(int codFacturaVenta) {
        this.codFacturaVenta = codFacturaVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    
}
