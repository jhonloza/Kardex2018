/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;

public interface IProveedor {
     public int insertar (IProveedor proveedor) throws Exception;
    public int modificar (IProveedor proveedor) throws Exception; 
    public int eliminar (IProveedor proveedor ) throws Exception;
    public IProveedor obtener (String id) throws Exception;
    public ArrayList<IProveedor> obtener() throws Exception;
    
}
