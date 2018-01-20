
package ec.edu.unach.kardex.rnegocio.dao;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.*;
public interface IProveedor {
    public int ingresar(Proveedor proveedor) throws Exception;
    public int modificar(Proveedor proveedor) throws Exception;
    public int eliminar(Proveedor proveedor) throws Exception;
    public Proveedor obtener(String ruc) throws Exception;
    public ArrayList<Proveedor> obtener() throws Exception;
}
