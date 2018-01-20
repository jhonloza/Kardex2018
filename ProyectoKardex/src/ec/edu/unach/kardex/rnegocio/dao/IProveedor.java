
package ec.edu.unach.kardex.rnegocio.dao;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.*;
public interface IProveedor {
    public int ingresar(Proveedor detalleVenta) throws Exception;
    public int modificar(Proveedor detalleVenta) throws Exception;
    public int eliminar(Proveedor detalleVenta) throws Exception;
    public Proveedor obtener(int codProveedor) throws Exception;
    public ArrayList<Proveedor> obtener() throws Exception;
}
