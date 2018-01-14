/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;


public interface IProveedor_Producto {
     public int insertar (Proveedor_Producto proveedor_producto) throws Exception;
    public int modificar (Proveedor_Producto proveedor_producto) throws Exception; 
    public int eliminar (Proveedor_Producto proveedor_producto ) throws Exception;
    public Proveedor_Producto obtener (String id) throws Exception;
    public ArrayList<Proveedor_Producto> obtener() throws Exception;
}
