
package ta6_geovanni_leon;

public class Ventana {
    private int largo;
    private int alto;
    private int pixelesAltura;
    private int pixelesAncho;
    private int cantidadPixeles;
    
    //Contructor
    public Ventana(int largo, int alto, int pixelesAl, int pixelesAnch){
        this.largo=largo;
        this.alto=alto;
        this.pixelesAltura=pixelesAl;
        this.pixelesAncho=pixelesAnch;
        this.cantidadPixeles=pixelesAl*pixelesAnch;
    }

    // Funciones de cada variable para cambios o correcciones
    //-------------------------------------------------------------------------------------------------------------------------------------------
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getPixelesAltura() {
        return pixelesAltura;
    }

    public void setPixelesAltura(int pixelesAltura) {
        this.pixelesAltura = pixelesAltura;
    }

    public int getPixelesAncho() {
        return pixelesAncho;
    }

    public void setPixelesAncho(int pixelesAncho) {
        this.pixelesAncho = pixelesAncho;
    }

    public int getCantidadPixeles() {
        return cantidadPixeles;
    }

    public void setCantidadPixeles(int cantidadPixeles) {
        this.cantidadPixeles = cantidadPixeles;
    }
    
    //-------------------------------------------------------------------------------------------------------------------------------------------
    
}
