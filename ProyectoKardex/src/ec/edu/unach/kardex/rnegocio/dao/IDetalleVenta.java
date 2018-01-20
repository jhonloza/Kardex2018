
package ec.edu.unach.kardex.rnegocio.dao;
import java.util.*;

import ec.edu.unach.kardex.rnegocio.entidades.DetalleVenta;

public interface IDetalleVenta {
    public int ingresar(DetalleVenta detalleVenta) throws Exception;
    public int modificar(DetalleVenta detalleVenta) throws Exception;
    public int eliminar(DetalleVenta detalleVenta) throws Exception;
    public DetalleVenta obtener(int codDetalleVenta) throws Exception;
    public ArrayList<DetalleVenta> obtener() throws Exception;
}
