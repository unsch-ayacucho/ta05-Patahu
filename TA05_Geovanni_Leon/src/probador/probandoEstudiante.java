/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probador;

import ta6_geovanni_leon.Estudiante;

/**
 *
 * @author patro
 */
public class probandoEstudiante {
    public static void main(String[] args) {
        byte a=14;
        byte b=14;
        byte c=8;
        byte d=16;
        
        Estudiante es= new Estudiante("27160108","Leon","Ingenieria",a,b,c,d);
        es.darDatos();
        System.out.println("El promedio del estudiante es : "+es.calcularPromedio());
    }
    
}
