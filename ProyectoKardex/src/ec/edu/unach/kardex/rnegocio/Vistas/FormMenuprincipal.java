
package ec.edu.unach.kardex.rnegocio.Vistas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import ec.edu.unach.kardex.rnegocio.dao.*;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import ec.edu.unach.kardex.rnegocio.impl.*;
public class FormMenuprincipal  extends JFrame{
    JMenuBar menuBarraPrincipal;
    JMenu menuInicio;
    JMenuItem menuItemLogin;
    JMenuItem menuItemSalir;
    JMenu menuCliente;
    JMenuItem nuevoCliente;
    JMenuItem modificarCliente;
    JMenuItem eliminarCliente;
    JMenuItem buscarCliente;
    JMenuItem listCliente;
    
    JMenu mniProducto;
    JMenuItem mninuevoProducto;
    JMenuItem mniModificarProducto;
    JMenuItem mniEliminarProducto;
    JMenuItem mniBuscarProducto;
    JMenuItem mniListaProducto;
    JDesktopPane escritorio;
    
    JMenu mniProveedor;
    JMenuItem mniNuevoProveedor;
    JMenuItem mniModificarProveedor ;
    JMenuItem mniEliminarProveedor;
    JMenuItem mniBuscarProveeedor;
    JMenuItem mniListaProveedor;
   

  
    
    public FormMenuprincipal() {
        escritorio = new JDesktopPane();
        escritorio.setBackground(new Color(0, 0, 0));

        menuBarraPrincipal = new JMenuBar();
        //menu Inicio
        menuInicio = new JMenu("Inicio");
        menuItemLogin = new JMenuItem("Iniciar Sesion");
        menuItemSalir = new JMenuItem("Salir");
        menuItemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    menuSalirActionPerformed(e);
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            }
        });
        menuBarraPrincipal.add(menuInicio);
        menuInicio.add(menuItemLogin);
        menuInicio.add(menuItemSalir);
        //Menu Estudiante
        menuCliente = new JMenu("Cliente");
        nuevoCliente = new JMenuItem("Nuevo Cliente");
        modificarCliente = new JMenuItem("Modificar Cliente");
        eliminarCliente = new JMenuItem("Eliminar Cliente");
        buscarCliente = new JMenuItem("Buscar Cliente");
        listCliente = new JMenuItem("Listar Cliente");
        menuCliente.add(nuevoCliente);
        menuCliente.add(modificarCliente);
        menuCliente.add(eliminarCliente);
        menuCliente.addSeparator();
        menuCliente.add(buscarCliente);
        menuCliente.add(listCliente);
        menuBarraPrincipal.add(menuCliente);

        nuevoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevoClienteActionPerformed(e);
            }
        });
    mniProducto = new JMenu("Producto");
        mninuevoProducto = new JMenuItem("NUEVO");
        mninuevoProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mninuevoProductoActionPerformed(e);
            }
        });
        mniModificarProducto = new JMenuItem("MODICIFCAR");
        mniEliminarProducto = new JMenuItem("ELIMINAR");
        mniBuscarProducto= new JMenuItem("BUSCAR");
        mniListaProducto = new JMenuItem("LISTA");

        mniProducto.add(mninuevoProducto);
        mniProducto.add(mniModificarProducto);
        mniProducto.add(mniEliminarProducto);
        mniProducto.addSeparator();
        mniProducto.add(mniBuscarProducto);
        mniProducto.add(mniListaProducto);
        menuBarraPrincipal.add(mniProducto);
        
        
        mniProveedor = new JMenu("Proveedor");
        mniNuevoProveedor = new JMenuItem("NUEVO");
        mniNuevoProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoProveedorActionPerformed(e);
            }
        });
        mniModificarProveedor = new JMenuItem("MODICIFCAR");
        mniEliminarProveedor = new JMenuItem("ELIMINAR");
        mniBuscarProveeedor = new JMenuItem("BUSCAR");
        mniListaProveedor= new JMenuItem("LISTA");

        mniProveedor.add(mniNuevoProveedor);
        mniProveedor.add(mniModificarProveedor);
}
    public void menuSalirActionPerformed(ActionEvent e){
        
    }
    public void nuevoClienteActionPerformed (ActionEvent e){
        
    }
    public void mninuevoProductoActionPerformed (ActionEvent e){
        
    }
    public void mniNuevoProveedorActionPerformed(ActionEvent e){
        
    }
}