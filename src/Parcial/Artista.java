/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario {
    protected String curriculum;
    protected String distinciones;
    private ArrayList<Obra> obras = new ArrayList<>();

    public Artista(String nombre, String apellido) {
        super(nombre, apellido);
        
        
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }
    public void agregarObra(Obra o ){
        this.obras.add(o);
    }
    
    public void InfoObras(){
        for (int i = 0; i < obras.size(); i++) {
            Obra o = this.obras.get(i);
            System.out.println("Estilo: " + o.getEstilo() + "Desripcion " + o.getDescripcion() + "Valor " + o.getValor());    
        }
    }

    
    @Override
    public String listarInformacion() {
        return "Nombre: " + this.getNombre() + "Apellido: " + this.getApellido() + "Curriculum: " + this.getCurriculum() + "Distinciones: " +this.getDistinciones()  + "/n"+
                "Numero de obras: " + this.obras.size() + "/n" ;
    }

    
    
    
    
}
