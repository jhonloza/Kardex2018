
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;

import java.util.*;

public interface IFacturaVenta {
    
     public int insertar (FacturaVenta facturaventa) throws Exception;
    public int modificar (FacturaVenta facturaventa) throws Exception; 
    public int eliminar (FacturaVenta facturaventa) throws Exception;
    public FacturaVenta obtener (int codFacturaVenta ) throws Exception;
    public ArrayList<FacturaVenta> obtener() throws Exception;
    
    
}
