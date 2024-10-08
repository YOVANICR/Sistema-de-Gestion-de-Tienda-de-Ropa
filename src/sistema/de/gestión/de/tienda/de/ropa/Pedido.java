package sistema.de.gestión.de.tienda.de.ropa;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cliente cliente;
    private ArrayList<Prenda> listaPrendas;
    private double total;
    private Descuento descuento;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.listaPrendas = new ArrayList<>();
        this.total = 0.0;
        this.descuento = null;
    }

    // Método corregido para agregar prenda
    public void agregarPrenda(Prenda prenda) {
        listaPrendas.add(prenda);
        total += prenda.getPrecio();  // Sumar el precio de la prenda al total
    }

    public double getTotal() {
        return total;
    }
    
    
}
