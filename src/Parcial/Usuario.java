/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author Estudiante
 */
public abstract class Usuario {
    
    protected String nombre;
    protected String apellido;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Usuario(){
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    

       
    public abstract String listarInformacion();
}


