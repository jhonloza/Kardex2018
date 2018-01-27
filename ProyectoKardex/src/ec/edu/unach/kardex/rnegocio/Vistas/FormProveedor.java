package ec.edu.unach.kardex.rnegocio.Vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ec.edu.unach.kardex.rnegocio.dao.*;
import ec.edu.unach.kardex.rnegocio.impl.*;
import ec.edu.unach.kardex.rnegocio.entidades.*;
import java.awt.Color;

public class FormProveedor extends JFrame{
     
    
    JLabel ruc;
    JLabel nombre;
    JLabel direccion;
    JLabel telefono;
    JLabel eMail;
   
    JTextField txtruc;
    JTextField txtnombre;
    JTextField txtdireccion;
    JTextField txttelefono;
    JTextField txteMail;
    

    JButton btnLimpiar;
    JButton btnAceptar;
    JButton btnCancelar;
    
    JPanel pnlcentral;
    JPanel pnlpie;

    public FormProveedor() {
        this.setSize(300, 300);
        
        setTitle("  PROVEEDOR....");
      //  this.setClosable(true);
        
        this.setLayout(new BorderLayout());
        pnlcentral = new JPanel();
        pnlpie = new JPanel();

        pnlcentral.setLayout(new GridLayout(5, 2, 5, 5));
        pnlpie.setLayout(new GridLayout(1, 2, 5, 5));
        
        ruc = new JLabel("    RUC:  ");  
        nombre= new JLabel("    NOMBRE:");
        direccion= new JLabel("    DIRECCION:");
        telefono= new JLabel("    TELEFONO:");
        eMail= new JLabel("    EMAIL:");
        
        
         txtruc= new JTextField(2);
         txtnombre= new JTextField(2);
         txtdireccion= new JTextField(2);
         txttelefono= new JTextField(2);
         txteMail= new JTextField(2);
         
        btnLimpiar = new JButton("LIMPIAR");
        btnAceptar = new JButton("ACEPTAR");
        btnCancelar = new JButton("CANCELAR");
        
        
        pnlcentral.setBackground(Color.CYAN);
        
  
        pnlcentral.add(ruc);
        pnlcentral.add(txtruc);
        pnlcentral.add(nombre);
        pnlcentral.add(txtnombre);
        pnlcentral.add(direccion);
        pnlcentral.add(txtdireccion);
        pnlcentral.add(telefono);
        pnlcentral.add(txttelefono);
        pnlcentral.add(eMail);
        pnlcentral.add(txteMail);
        
        
        pnlpie.add(btnLimpiar);
        pnlpie.add(btnAceptar);
        pnlpie.add(btnCancelar);
        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnAceptarActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:"+ex.getMessage());
                }
            }
        });
        
       
 
        this.add(pnlcentral, BorderLayout.CENTER);
        this.add(pnlpie, BorderLayout.SOUTH);

        
    }
    
      public static void main(String[] args) {
        FormProveedor formP = new FormProveedor();
        formP.setVisible(true);   
    }
    public void btnAceptarActionListener(ActionEvent e){
        
            IProveedor proveedorDao=new ImplProveedor();
            Proveedor proveedor = new Proveedor();
            
            proveedor.setRuc(txtruc.getText());
            proveedor.setNombre(txtnombre.getText());
            proveedor.setDireccion(txtdireccion.getText());
            proveedor.setTelefono(txttelefono.getText());
            proveedor.seteMail(txteMail.getText());
        
          try{
            if(proveedorDao.ingresar(proveedor)>0){
                JOptionPane.showMessageDialog(this,"Guardado correctamente",
                "transaccion", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Error desconocido",
                "error", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
             JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

