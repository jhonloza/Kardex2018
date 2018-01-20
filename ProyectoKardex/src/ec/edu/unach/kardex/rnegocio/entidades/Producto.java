
package ec.edu.unach.kardex.rnegocio.entidades;

public class Producto {

    
    private int codProducto;
    private Categoria categoria;
    private int nombre;
    private Double precio;

    public Producto() {
    }
      public Producto(int codProducto, Categoria categoria, int nombre, Double precio) {
        this.codProducto = codProducto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
      
}

