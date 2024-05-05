package supermarket.hipermaxi;

public abstract class Persona {

    private String nombre;
    protected int carnetIdentidad;
    private int edad;

    public Persona(String nombre, int carnetIdentidad, int edad) {
        this.nombre = nombre;
        this.carnetIdentidad = carnetIdentidad;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public int getEdad(){
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Carnet de Identidad: " + carnetIdentidad;
    }
}
