/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

import java.util.*;

/**
 *
 * @author pc
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private Integer edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }
    
    public boolean buscar(List<Estudiante> temp, Estudiante e){
        boolean flag = false;
        
        for(Estudiante est: temp){
        if(est.equals(e)){
        flag = true;
        }
        }
        return flag;
    }
    
    public List<Estudiante> eliminar(List<Estudiante> temp, Estudiante e){
     List<Estudiante> list = new ArrayList<Estudiante>();
     for(Estudiante est: temp){
     if(!est.equals(e)){
     list.add(est);
     }
     }
     return list;
    }
}

