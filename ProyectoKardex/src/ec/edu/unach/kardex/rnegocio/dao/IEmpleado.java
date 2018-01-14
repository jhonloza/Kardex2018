/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.dao;

import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;

public interface IEmpleado {
 
     public int insertar (IEmpleado empleado) throws Exception;
    public int modificar (IEmpleado empleado) throws Exception; 
    public int eliminar (IEmpleado empleado ) throws Exception;
    public IEmpleado obtener (String id) throws Exception;
    public ArrayList<IEmpleado> obtener() throws Exception;
}
