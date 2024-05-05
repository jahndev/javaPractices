package supermarket.hipermaxi;

public abstract class Persona {

    protected String nombre;
    protected int carnetIdentidad;

    public Persona(String nombre, int carnetIdentidad) {
        this.nombre = nombre;
        this.carnetIdentidad = carnetIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(int carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Carnet de Identidad: " + carnetIdentidad;
    }
}
