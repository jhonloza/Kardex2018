/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;

public interface ICategoria {
     public int insertar (Categoria categoria) throws Exception;
    public int modificar (Categoria categoria) throws Exception; 
    public int eliminar (Categoria categoria ) throws Exception;
    public Categoria obtener (String id) throws Exception;
    public ArrayList<Categoria> obtener() throws Exception;
}
