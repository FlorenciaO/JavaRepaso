public class App {
    public static void main(String[] args) {
        // Crear un Objeto en Java (instancia de una clase)
        Persona persona1 = new Persona();
        persona1.nombre = "Tito";
        persona1.apellido = "Gómez"; //Esta linea arroja error
        persona1.edad = 23;
        System.out.println("¡Hola, "+ persona1.nombre + " " + persona1.apellido + ", " + persona1.edad + " anios!");

        // Crear una alumna con nombre Camila, apellido Pérez, edad 23, Curso Android Basico
        Persona alumno = new Alumno("Camila", "Perez", 23, Curso.ANDROID_BASICO);

        System.out.println(alumno.toString());
    }
}