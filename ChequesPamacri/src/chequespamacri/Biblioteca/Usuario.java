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
public class Usuario {
    
    private int id;
    private String nomUsuario;
    private String nombre;
    private String contrasena;
    private String correo;

    public Usuario(int id, String nomUsuario, String nombre, String contrasena, String correo) {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    public Usuario() {
        this.id = 0;
        this.nomUsuario = "";
        this.nombre = "";
        this.contrasena = "";
        this.correo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}
