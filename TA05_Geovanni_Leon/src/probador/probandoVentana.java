/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probador;

import ta6_geovanni_leon.Ventana;

/**
 *
 * @author patro
 */
public class probandoVentana {
    public static void main(String[] args) {
        Ventana venta1= new Ventana(700,800,600,700);
        
        System.out.println("La altura de la ventan es: "+venta1.getAlto());
        System.out.println("La altura de la ventan es: "+venta1.getLargo());
        System.out.println("La cantidad de pixeles es: "+venta1.getCantidadPixeles());

    }
  
    
}
