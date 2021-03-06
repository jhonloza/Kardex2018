package ec.edu.unach.kardex;
import ec.edu.unach.kardex.accesodatos.*;
import ec.edu.unach.kardex.rnegocio.dao.*;
import ec.edu.unach.kardex.rnegocio.impl.*;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestProducto {

    public TestProducto() {
    }
    
     @Test
    public void testGeneral() {
        IProducto productoDao = new ImplProducto();
        
//TEST INSERTAR

        int filas = 0;
        Categoria ncategoria = new Categoria(1, "ABC", "Cuadernoss");
        Producto produc = new Producto(2,ncategoria,  "Academico", 1.75);
        try {
            filas = productoDao.insertar(produc);
            System.out.println("filas Insertadas:" + filas);
        } catch (Exception e) {
        }
        assertTrue(filas > 0);
        
////TEST OBTENER POR CODIGO

        Producto producto = new Producto();
        try {
            producto = productoDao.obtener(1);
            System.out.println(producto.getCodProducto() + "\t\t" + producto.getCategoria().getCodCategoria() + "\t\t" + producto.getNombre() + "\t\t" + producto.getPrecio() + "\t\t" + "\n\n");
        } catch (Exception e) {
        }
        assertEquals(producto != null, true);
        
//TEST LISTADO

        ArrayList<Producto> productos = new ArrayList<>();
        try {
            productos = productoDao.obtener();
            for (Producto nProductos : productos) {
                System.out.println(nProductos.getCodProducto()+"\t\t\t"+ nProductos.getCategoria().getCodCategoria()+"\t\t\t"+nProductos.getNombre()+"\t\t\t"+nProductos.getPrecio());
            }
        } catch (Exception e) {
        }
        assertTrue(productos.size() > 0);
    }

}
