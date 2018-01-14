/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.*;
public interface Ikardex {
     public int insertar (Kardex kardex) throws Exception;
    public int modificar (Kardex kardex) throws Exception; 
    public int eliminar (Kardex kardex ) throws Exception;
    public Kardex obtener (String id) throws Exception;
    public ArrayList<Kardex> obtener() throws Exception;
       
}
