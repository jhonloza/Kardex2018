/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;

/**
 *
 * @author stian
 */
public interface ICliente {
     public int insertar (Cliente cliente) throws Exception;
    public int modificar (Cliente cliente) throws Exception; 
    public int eliminar (Cliente cliente ) throws Exception;
    public Cliente obtener (int cedula) throws Exception;
    public ArrayList<Cliente> obtener() throws Exception;
}
