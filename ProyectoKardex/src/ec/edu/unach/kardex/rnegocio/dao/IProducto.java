/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;
import ec.edu.unach.kardex.rnegocio.entidades.Producto;
import java.util.ArrayList;

public interface IProducto {
     public int insertar (Producto producto) throws Exception;
    public int modificar (Producto producto) throws Exception; 
    public int eliminar (Producto producto) throws Exception;
    public Producto obtener (String cedula) throws Exception;
    public ArrayList<Producto> obtener() throws Exception;
}

