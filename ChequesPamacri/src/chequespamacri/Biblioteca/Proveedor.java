/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri.Biblioteca;

/**
 *
 * @author franc
 */
public class Proveedor {
    
    private int id;
    private String rut;
    private String nombre;
    private int plazo;

    public Proveedor(int id, String rut, String nombre, int plazo) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.plazo = plazo;
    }

    public Proveedor() {
        this.id = 0;
        this.rut = "";
        this.nombre ="";
        this.plazo = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    
    
    
}
