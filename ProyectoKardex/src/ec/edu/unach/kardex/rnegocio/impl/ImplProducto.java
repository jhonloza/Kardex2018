package ec.edu.unach.kardex.rnegocio.impl;

import ec.edu.unach.kardex.accesodatos.Conexion;
import ec.edu.unach.kardex.accesodatos.Parametro;
import ec.edu.unach.kardex.rnegocio.dao.IProducto;
import ec.edu.unach.kardex.rnegocio.entidades.Producto;
import java.util.ArrayList;

public class ImplProducto {

     @Override
    public int ingresar(Producto producto) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Producto (codProducto, codCategoria, nombre , precio) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, producto.getCodProducto()));
        lisParametros.add(new Parametro(2, producto.getCategoria().getCodCategoria()));
        lisParametros.add(new Parametro(4, producto.getNombre()));
        lisParametros.add(new Parametro(5, producto.getPrecio()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;

    }
    @Override
    public int modificar(Producto producto) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE Producto SET codProducto=?, codCategoria=?, nombre=?, precio=? WHERE codProducto=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, producto.getCodProducto()));
        lisParametros.add(new Parametro(2, producto.getCategoria().getCodCategoria()));
        lisParametros.add(new Parametro(3, producto.getNombre()));
        lisParametros.add(new Parametro(4, producto.getPrecio()));
    
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }
    @Override
    public int eliminar(Producto producto) throws Exception {
        int numFilas = 0;
        String sqlC = "DELETE FROM DetalleCompra WHERE codDetalleCompra=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, producto.getCodProducto()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }
        @Override
    public Producto Obtener(int codProducto) throws Exception {
       Producto producto = null;
        String sqlC = "SELECT codDetalleCompra, codProducto, codFacturaCompra, cantidad, precioTotal FROM DetalleCompra Where id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, codProducto));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                detalle = new DetalleCompra();
                producto = new Producto();
                factCompra = new FacturaCompra();
                detalle.setCodDetalleCompra(rst.getInt(1));
                detalle.getProducto();
                factCompra = factCompraDao.obtener(rst.getInt(3));
                detalle.setCantidad(rst.getInt(4));
                detalle.setPrecioTotal(rst.getDouble(5));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return detalle;
    }
     @Override
    public ArrayList<DetalleCompra> obtener() throws Exception {
        ArrayList<DetalleCompra> lstDetalle=new ArrayList<>();
        DetalleCompra detalle = null;
        String sqlC = "SELECT codDetalleCompra, codProducto, codFacturaCompra, cantidad, precioTotal FROM DetalleCompra";
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
//            IProducto productoDao = new ImplProducto();
            Producto produc = null;
            IFacturaCompra factCompraDao = new ImplFacturaCompra();
            FacturaCompra factCompra = new FacturaCompra();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            while (rst.next()) {
                detalle = new DetalleCompra();
                produc = new Producto();
                factCompra = new FacturaCompra();
                detalle.setCodDetalleCompra(rst.getInt(1));
//                produc = productoDao.obtener(rst.getInt(2));
                detalle.getProducto();
                factCompra = factCompraDao.obtener(rst.getInt(3));
                detalle.setCantidad(rst.getInt(4));
                detalle.setPrecioTotal(rst.getDouble(5));
                lstDetalle.add(detalle);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return lstDetalle;
    }
}