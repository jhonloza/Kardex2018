package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.*;
public interface IFacturaCompra {
    public int insertar (FacturaCompra facturacompra) throws Exception;
    public int modificar (FacturaCompra facturacompra) throws Exception; 
    public int eliminar (FacturaCompra facturacompra) throws Exception;
    public FacturaCompra obtener (int codFacturaCompra) throws Exception;
    public ArrayList<FacturaCompra> obtener() throws Exception;
    
}
