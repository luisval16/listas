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
public class Proceso {
    
    public static void main(String[] args){
      llenarLista();
    }
    
    public static void llenarLista(){
        List<Estudiante> temp = new ArrayList<Estudiante>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombres: ");
        Estudiante e = new Estudiante();
        e.setNombre(sc.nextLine());
        System.out.println("Ingrese apellidos: ");
        e.setApellido(sc.nextLine());
        System.out.println("Ingrese edad: ");
        try {
            e.setEdad(sc.nextInt());
        } catch (Exception er) {
            System.out.println("La edad solo acepta digitos");
        }
        temp.add(e);
        for(Estudiante est: temp){
            System.out.println(est.getNombre() + " " + est.getApellido());
        }
    }
}
