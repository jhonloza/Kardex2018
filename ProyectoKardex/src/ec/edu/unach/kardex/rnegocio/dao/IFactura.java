/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;
public interface IFactura {
     public int insertar (Factura factura) throws Exception;
    public int modificar (Factura factura) throws Exception; 
    public int eliminar (Factura factura ) throws Exception;
    public Factura obtener (String id) throws Exception;
    public ArrayList<Factura> obtener() throws Exception;
}
