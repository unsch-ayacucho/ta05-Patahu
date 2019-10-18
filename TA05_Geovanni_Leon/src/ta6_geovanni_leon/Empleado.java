
package ta6_geovanni_leon;


public class Empleado {
    private String codigo;
    private String nombre;
    private String areaLaboral;
    private double sueldo;
    private int horasExtras;
    private String AfiliacionAFP;
    private double porcentajeAfiliacionAFP=0.11;
    private double porcentajeAfiliacionSNP=0.13;
    private double salud=0.3;
    
    //Constructor, asignamos la variables
    public Empleado(String codigo, String nombre, String areaLaboral, double sueldo,int horasEx, String afiliado){
        this.codigo=codigo;
        this.nombre=nombre;
        this.areaLaboral=areaLaboral;
        this.sueldo=sueldo;
        this.horasExtras=horasEx;
        this.AfiliacionAFP=afiliado;
    }
    
    // Funciones de cada variable para cambios o correcciones
    //-------------------------------------------------------------------------------------------------------------------------------------------
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaLaboral() {
        return areaLaboral;
    }

    public void setAreaLaboral(String areaLaboral) {
        this.areaLaboral = areaLaboral;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getAfiliacionAFP() {
        return AfiliacionAFP;
    }

    public void setAfiliacionAFP(String AfiliacionAFP) {
        this.AfiliacionAFP = AfiliacionAFP;
    }

    public double getPorcentajeAfiliacionAFP() {
        return porcentajeAfiliacionAFP;
    }

    public void setPorcentajeAfiliacionAFP(double porcentajeAfiliacionAFP) {
        this.porcentajeAfiliacionAFP = porcentajeAfiliacionAFP;
    }

    public double getPorcentajeAfiliacionSNP() {
        return porcentajeAfiliacionSNP;
    }

    public void setPorcentajeAfiliacionSNP(double porcentajeAfiliacionSNP) {
        this.porcentajeAfiliacionSNP = porcentajeAfiliacionSNP;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    
    
    //funcion que calcula el descuento por afiliacion a AFP
    public double descuentoPorAfiliacionAFP(){
        return this.sueldo*this.porcentajeAfiliacionAFP;
    }
        //funcion que calcula el descuento por afiliacion a seguro nacional de seguro

    public double descuentoPorAfiliacionSNP(){
        return this.sueldo*this.porcentajeAfiliacionSNP;
    }
    
    //funcion que calcula el descuento por salud
    public double descuentoSalud(){
        return this.sueldo*this.salud;
    }
    
    //funcion que calcula el monto total del descuento
    public double montoDescuentoTotal(){
        double sueldoD;
        if(this.AfiliacionAFP.equals("si")){
             sueldoD=descuentoPorAfiliacionAFP()+descuentoPorAfiliacionSNP()+descuentoSalud();
        }
        else
            sueldoD=descuentoPorAfiliacionSNP()+descuentoSalud();
            
        return sueldoD;
    }
    
    // Funcion que calcula sueldo neto
    public double sueldoNeto(){
        return this.sueldo-montoDescuentoTotal();
    }
    //funcion que calcula sueldo total
    //el sueldo total se calcula el suelto neto mas las horas extras
    public double sueldoTotal(){
        
        return sueldoNeto()+this.sueldo/240*this.horasExtras;
   
    }
    
}
