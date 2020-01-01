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
        
        if(nomUsuario == null || nomUsuario.isEmpty() || "".equals(nomUsuario)){
            throw new IllegalArgumentException("El nombre de usuario no puede quedar vacio"); 
        }
        else{
            this.nomUsuario=nomUsuario;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede quedar vacio");
            
        }
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
        // Se valida que el valor no esté vacio, de ser asi, se emite la excepción a ser controlada
        if(correo == null || correo.isEmpty() || "".equals(correo) ){
            throw new IllegalArgumentException("El correo esta vacio"); 
        }
        else if( !correo.contains("@") || !correo.contains(".")){
            throw new IllegalArgumentException("El correo no es valido");
        }
        else{
            this.correo=correo;
        }
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
}
