package supermarket.hipermaxi;

public class Cajero {

    private String nombre;

    private int nroCajero;

    public Cajero(String nombre, int nroCajero) {
        this.nombre = nombre;
        this.nroCajero = nroCajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCajero() {
        return nroCajero;
    }

    public void setNroCajero(int nroCajero) {
        this.nroCajero = nroCajero;
    }

}
