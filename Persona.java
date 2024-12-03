public class Persona {
    // Atributos de una clase
    String nombre;
    protected String apellido;
    protected Integer edad;

    // Metodos de una clase
    private String respirar() {
        String mensaje = "Respirar";
        return mensaje;
    }

    protected void saltar() {
        String respirarMensaje = respirar();
        System.out.println("Primero: " + respirarMensaje);
        System.out.println("Segundo: Saltar");
    }

    public String estudiar() {
        String mensaje = "No disponible";
        return mensaje;
    }

    // Getters y setters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
