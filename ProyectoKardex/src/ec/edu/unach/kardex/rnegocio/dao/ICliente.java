package ec.edu.unach.kardex.rnegocio.dao;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.*;

public interface ICliente {
    public int insertar (Cliente cliente) throws Exception;
    public int modificar (Cliente cliente) throws Exception; 
    public int eliminar (Cliente cliente) throws Exception;
    public Cliente obtener (String cedula) throws Exception;
    public ArrayList<Cliente> obtener() throws Exception;
}
