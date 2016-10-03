package pe.edu.upeu;
public  class Alumno extends Persona {
private String curso;
private int nivelAcademico;
public double monto;
public Alumno() {
}
public Alumno(String curso, int nivelAcademico, String nombre, int edad) {
    super(nombre, edad);
    this.curso = curso;
    this.nivelAcademico = nivelAcademico;
}                
public String cambiarCursos() {		
       return "Yo "+nombre+
              " voy a cambiar por el curso de :"+curso;
}
//public String toStringUno() {            
//        throw new UnsupportedOperationException();
//}
public String pagoMensual() {
   return "Yo "+super.nombre +
          " pago un monto de :"+monto;
}

public static void main(String [] a){
    Alumno alumno=new Alumno("Matematica", 2, "Juan", 20);
    System.out.println(alumno.toStringUno()+" y tengo "+alumno.cambiarEdad()+" años"); //Esta llamando al metodo toStringUno de la clase Persona    
    alumno.nombre="Ruben";
    alumno.edad=30;
    System.out.println(alumno.toStringUno()+" y tengo "+alumno.cambiarEdad()+" años"); //Esta llamando al metodo toStringUno de la clase Persona    
}
}