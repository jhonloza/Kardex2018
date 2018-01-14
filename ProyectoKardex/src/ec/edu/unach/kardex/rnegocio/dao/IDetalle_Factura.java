/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;


public interface IDetalle_Factura {
     public int insertar (Detalle_Factura detalle_factura) throws Exception;
    public int modificar (Detalle_Factura detalle_factura) throws Exception; 
    public int eliminar (Detalle_Factura detalle_factura ) throws Exception;
    public Detalle_Factura obtener (String id) throws Exception;
    public ArrayList<Detalle_Factura> obtener() throws Exception;
}
