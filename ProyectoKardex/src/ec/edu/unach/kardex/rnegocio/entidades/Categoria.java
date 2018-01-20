/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.unach.kardex.rnegocio.entidades;

/**
 *
 * @author DELL
 */
public class Categoria {
private int codCategoria;
private String nombre;
private String descripcion;

    public Categoria(int codCategoria, String nombre, String descripcion) {
        this.codCategoria = codCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Categoria() {
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
}
