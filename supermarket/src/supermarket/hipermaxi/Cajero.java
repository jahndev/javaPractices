package supermarket.hipermaxi;

public class Cajero extends Persona {

    private int nroCajero;

    public Cajero(String nombre,int carnet, int nroCajero) {
        super(nombre, carnet, 0);
        this.nroCajero = nroCajero;
    }

    public int getNroCajero() {
        return nroCajero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Cajero: " + nroCajero;
    }
}