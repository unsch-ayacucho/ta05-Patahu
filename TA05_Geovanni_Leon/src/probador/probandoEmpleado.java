
package probador;

import ta6_geovanni_leon.Empleado;

public class probandoEmpleado {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("00151","Geovanni","sistemas",6000,15,"si");
        
        System.out.println("Monto de descuento por AFP: "+empleado1.descuentoPorAfiliacionAFP());
        System.out.println("Monto de descuento por SNP: "+empleado1.descuentoPorAfiliacionSNP());
        System.out.println("Monto de descuento por SALUD: "+empleado1.descuentoSalud());
        System.out.println("Monto de descuento por TOTAL descuento: "+empleado1.montoDescuentoTotal());
        
        
        System.out.println("Sueldo total : "+empleado1.sueldoTotal());
        System.out.println("sueldo neto: "+empleado1.sueldoNeto());
        
        
    }
}
