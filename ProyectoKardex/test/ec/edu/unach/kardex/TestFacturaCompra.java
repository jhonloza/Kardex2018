package ec.edu.unach.kardex;

import ec.edu.unach.kardex.rnegocio.dao.*;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import ec.edu.unach.kardex.rnegocio.impl.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.sql.*;


public class TestFacturaCompra {

    public TestFacturaCompra() {

    }

    @Test

    public void testGeneral() {

        IFacturaCompra FacComDao = new ImplFacturaCompra();

        // TEST INSERETAR 
        int filas = 0;

        Proveedor pro = new Proveedor("", "", "", "", "");
        FacturaCompra fc = new FacturaCompra(1, new java.util.Date(), pro);

        try {
            filas = FacComDao.insertar(fc);
            System.out.println("Filas insertadas: " + filas);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        assertEquals(filas > 0,true);
        
        /// listar por codigo test
        
        FacturaCompra fa = new FacturaCompra();
        
        try {
            fa = FacComDao.obtener(1);
            System.out.println(fa.getCodFacturaCompra()+""+fa.getFecha()+""+fa.getProveedor().getRuc());
                    
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        
        assertEquals(fa != null, true );
        //////test listado
        
        ArrayList<FacturaCompra> fac = new ArrayList<>();
        try {
            fac = FacComDao.obtener();
            for (FacturaCompra far : fac ){
                 System.out.println(fa.getCodFacturaCompra()+""+fa.getFecha()+""+fa.getProveedor().getRuc());
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            
        }
        
        

    }
}
