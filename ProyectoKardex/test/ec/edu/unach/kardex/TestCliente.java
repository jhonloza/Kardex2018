package ec.edu.unach.kardex;

import org.junit.Test;
import static org.junit.Assert.*;
import ec.edu.unach.kardex.rnegocio.dao.*;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import ec.edu.unach.kardex.rnegocio.impl.*;
import ec.edu.unach.kardex.accesodatos.*;
import java.util.*;
import java.sql.*;

public class TestCliente {

    public TestCliente() {

    }

    @Test
    public void testGeneral() {
        ICliente clDao = new ImplCliente();

        ///////TEST INSERTAR
//        int filas = 0;
//
//        Cliente cln = new Cliente("0603437047", "Daniel", "Bastian", "10 de agosto", "0973140672", "ao@gmail.com", new java.util.Date());
//        try {
//            filas = clDao.insertar(cln);
//            System.out.println("filas Inseertadas: " + filas + "\n");
//        } catch (Exception e) {
//        }
//        assertEquals(filas > 0, true);
        ////TEST OBTENER CODIGO
//        Cliente cli = new Cliente();
//
//        try {
//            cli = clDao.obtener("0603437047");
//            System.out.println(cli.getCedula()+" "+cli.getNombre() +" "+ cli.getApellido()+" "+cli.getDireccion()+" "+cli.getTelefono()+" "+cli.geteMail()+" "+cli.getFechaNac());
//        } catch (Exception e) {
//        }

        //////// TEST LISTADO 
        ArrayList<Cliente> clientess = new ArrayList<>();
        try {
            clientess = clDao.obtener();
            for (Cliente clientes : clientess) {
                System.out.println("CEDULA      " + "  NOMBRE "+ "   APELLIDO"+"DIRECCION"+"TELEFONO"+"EMAIL"+"FECHA NACIEMIENTO");
                System.out.println(clientes.getCedula() + "    " + clientes.getNombre() + "    " + clientes.getApellido() + "      " + clientes.getDireccion() + " " + clientes.getTelefono() + "" + clientes.geteMail() + " "+ clientes.getFechaNac());
            }

        } catch (Exception e) {
        }
        assertTrue(clientess.size() > 0);

    }

}
