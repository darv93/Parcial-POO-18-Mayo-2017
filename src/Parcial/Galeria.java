/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Galeria {
    protected ArrayList<Usuario> usuarios;
    protected String nombre;

    public Galeria(String nombre) {
        this.nombre=nombre;
    }
    
    public void agregarUsuario(Usuario u){
        this.usuarios.add(u);
    }
    
    public void listarInfoUsuarios() throws IOException{
        File f = new File("InfoUsuarios.txt");
        FileWriter fw = new FileWriter(f);
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            fw.write(u.listarInformacion());
        }
    }
    
}
