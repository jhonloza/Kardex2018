
package ec.edu.unach.kardex;

import ec.edu.unach.kardex.accesodatos.*;
import ec.edu.unach.kardex.rnegocio.dao.*;
import ec.edu.unach.kardex.rnegocio.impl.*;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestProveedor {
    
    public TestProveedor() {
    }
    @Test
    public void testGeneral() {
        IProveedor proveedorDao=new ImplProveedor();
       
//TEST INSERTAR

        int filas=0;
       
        Proveedor nuevoProveedor=new Proveedor("1234567890", "David", "La condamine", "0991575474","david@gmail.com");
        try {
            filas=proveedorDao.ingresar(nuevoProveedor);
            System.out.println("Filas Insertadas:"+filas+"\n\n");
        } catch (Exception e) {
        }
        assertEquals(filas>0, true);
        
//TEST OBTENER POR CODIGO

        Proveedor prove=new Proveedor();
        try {
            prove=proveedorDao.obtener("1");
            System.out.println(prove.getRuc()+"    "+prove.getNombre()+"    "+prove.getDireccion()+"    "+prove.getTelefono()+"     "+prove.geteMail()+"\n");
        } catch (Exception e) {
        }
        
//TEST LISTADO

        ArrayList<Proveedor> proveedor=new ArrayList<>();
        try {
            proveedor=proveedorDao.obtener();
            for(Proveedor pro:proveedor){
                System.out.println(pro.getRuc()+"\t\t\t"+pro.getNombre()+"\t\t\t"+pro.getDireccion()+"\t\t\t"+pro.getTelefono()+"\t\t\t"+pro.geteMail());
            }
        } catch (Exception e) {
        }
        assertTrue(proveedor.size()>0);
    }
} 