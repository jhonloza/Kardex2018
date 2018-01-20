
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;

import java.util.*;

public interface IFacturaVenta {
    
     public int insertar (FacturaVenta etiqueta) throws Exception;
    public int modificar (FacturaVenta etiqueta) throws Exception; 
    public int eliminar (FacturaVenta etiqueta) throws Exception;
    public FacturaVenta obtener (int codFacturaVenta ) throws Exception;
    public ArrayList<FacturaVenta> obtener() throws Exception;
    
    
}
