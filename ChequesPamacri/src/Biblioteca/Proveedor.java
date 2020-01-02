/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author franc
 */
public class Proveedor {
    
    private int id;
    private String rut;
    private String nombre;
    private int plazo;
    private String tipo;

    public Proveedor(int id, String rut, String nombre, int plazo, String tipo) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.plazo = plazo;
        this.tipo = tipo;
    }

    public Proveedor() {
        this.id = 0;
        this.rut = "";
        this.nombre ="";
        this.plazo = 0;
        this.tipo = "";
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
        if(rut.isEmpty()){
            throw new IllegalArgumentException("El rut no puede quedar vacio");
        }
        else{
            this.rut = rut;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede quedar vacio");
        }
        else{
            this.nombre = nombre;
        }
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        if(plazo<0){
            throw new IllegalArgumentException("El plazo no puede ser menor que 0 dias");
        }
        else{
            this.plazo = plazo;
        }
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede quedar vacio");
        }
        else{
            this.tipo = tipo;
        }
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", plazo=" + plazo + ", tipo=" + tipo + '}';
    }
    
    
    
}
