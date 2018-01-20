
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.Categoria;
import java.util.ArrayList;


public interface ICategoria {
    public int insertar (Categoria categoria) throws Exception;
    public int modificar (Categoria categoria) throws Exception; 
    public int eliminar (Categoria categoria) throws Exception;
    public Categoria obtener (String cedula) throws Exception;
    public ArrayList<Categoria> obtener() throws Exception;
}