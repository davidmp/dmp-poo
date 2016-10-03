package pe.edu.upeu;
abstract class Persona {
    public String nombre;
    protected int edad;
    public Persona() {}
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toStringUno() {
       return "Hola, soy "+nombre;
    }
    public int cambiarEdad() {
        return edad;
    }
}