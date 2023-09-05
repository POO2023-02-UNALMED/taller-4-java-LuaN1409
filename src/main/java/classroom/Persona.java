package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    static long totalID;
    static {
        totalPersonas = 0;
        totalID = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
        totalID++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
        totalID++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
        totalID++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 0;
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
