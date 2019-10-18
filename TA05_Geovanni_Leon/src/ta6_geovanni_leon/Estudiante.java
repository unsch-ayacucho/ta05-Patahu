
package ta6_geovanni_leon;

public class Estudiante {
    private String codigo;
    private String apellidos;
    private String especialidad;
    private byte nota1;
    private byte nota2;
    private byte nota3;
    private byte nota4;
    
    // contructor
    public Estudiante(String codigo, String apellidos, String espe, byte nota1, byte nota2, byte nota3, byte nota4){
        this.codigo=codigo;
        this.apellidos=apellidos;
        this.especialidad=espe;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
    }
    // funcion que calcula el promedio
    public double calcularPromedio(){
        byte notaMenor=this.nota1;
        
        // estos if funcionan para atrapar la nota minima
        if(notaMenor>this.nota2)
            notaMenor=this.nota2;
        if(notaMenor>this.nota3)
            notaMenor=this.nota3;
        if(notaMenor>this.nota4)
            notaMenor=this.nota4;
        
        // estos if, else if, else funcionan para restringir la entrada al menor numero
        if(this.nota1==notaMenor){
            System.out.println("La nota 1 es la menor ");
            return (nota2+nota3+nota4)/3;
        }
        else if(this.nota2==notaMenor){
            System.out.println("La nota 2 es la menor ");
            return (nota1+nota3+nota4)/3;
        }
        else if(this.nota3==notaMenor){
            System.out.println("La nota 3 es la menor ");
            return (nota2+nota1+nota4)/3;
        }
        else
            System.out.println("La nota 4 es la menor ");
            return (nota1+nota3+nota2)/3;
    }
    
    
    //devuelve los dato del estudiante
    public void darDatos(){
        System.out.println("El codigo del estudiante es :"+ this.codigo+" apellidos: "+this.apellidos+" especialidad: "+this.especialidad);
    }
    //privados: código, apellidos, especialidad, nota1, nota2, nota3, nota4. Considere un método para calcular el promedio, sin considerar la nota menor
}
