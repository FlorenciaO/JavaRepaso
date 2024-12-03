public class Alumno extends Persona {
    Curso cursoActual;

    public Alumno() {}

    // Constructor
    public Alumno(String nombre, String apellido, int edad, Curso curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursoActual = curso;
        this.apellido = apellido; //Esta linea no funciona
    }

    @Override
    protected void saltar() {
        super.saltar();
        // Comportamiento adicional
        System.out.println("Saltando...");
    }

    @Override
    public String estudiar() {
        String mensaje = "Estudiar";
        return mensaje;
    }

    @Override
    public String toString() {
        String toString = nombre + " " + apellido + ", " + edad + " anios, " + cursoActual.toString();
        return toString;
    }
}
