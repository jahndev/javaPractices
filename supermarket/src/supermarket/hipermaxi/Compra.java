package supermarket.hipermaxi;

import java.util.*;

public class Compra {

    private Cliente cliente;

    private Cajero cajero;

    private List<Producto> productoList;

    private int codigo;

    private double total = 0.0;

    public Compra(Cliente cliente, List<Producto> productoList, Cajero cajero) {
        this.cliente = cliente;
        this.productoList = productoList;
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String generarFactura() {
        String factura = "";
        float precioTotal = 0;
        factura = "Nombre del ciente: " + getCliente().getNombre() + "\n";
        factura += "Carnet de identidad :" + getCliente().getCarnetIdentidad() + "\n";
        factura += "Cajero cod: " + cajero.getNroCajero() + "\n";
        factura += "Items:" + String.format("%30s", "Precio") +"\n";

        for (Producto producto : getProductoList()) {
            factura += String.format("%-30s", producto.getNombre())+ " " + producto.getPrecio() + "\n";

            precioTotal += producto.getPrecio();
        }

        factura += String.format("%-30s", "Total:") + " "+ Math.round(precioTotal) + "\n";

        return factura;
    }
}
