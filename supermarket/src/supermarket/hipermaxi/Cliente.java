package supermarket.hipermaxi;

public class Cliente extends Persona{

    public Cliente(String nombre, int edad, int carnetIdentidad) {
        super(nombre, carnetIdentidad, edad);

    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Edad: " + getEdad();
    }
}
