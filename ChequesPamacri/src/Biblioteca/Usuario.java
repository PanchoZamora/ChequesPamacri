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
public class Usuario {
    
    private int id;
    private String nomUsuario;
    private String nombre;
    private String contrasena;
    private String correo;
    private String rol;

    public Usuario(int id, String nomUsuario, String nombre, String contrasena, String correo, String rol) {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        this.rol = rol;
    }

    public Usuario() {
        this.id = 0;
        this.nomUsuario = "";
        this.nombre = "";
        this.contrasena = "";
        this.correo = "";
        this.rol = "";
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
        
        // Se valida que el valor no esté vacio, de ser asi, se emite la excepción a ser controlada
        if(nomUsuario == null || nomUsuario.isEmpty() || "".equals(nomUsuario)){
            throw new IllegalArgumentException("EL NOMBRE ESTA VACIO"); 
        }
        else{
            this.nomUsuario=nomUsuario;
        }
        
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
        // Se valida que el valor no esté vacio, de ser asi, se emite la excepción a ser controlada
        if(contrasena == null || contrasena.isEmpty() || "".equals(contrasena)){
            throw new IllegalArgumentException("LA CONTRASEÑA ESTA VACIA"); 
        }
        else{
            this.contrasena=contrasena;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
}
