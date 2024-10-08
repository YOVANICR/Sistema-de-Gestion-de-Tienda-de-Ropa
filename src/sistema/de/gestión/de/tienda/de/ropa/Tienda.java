package sistema.de.gestión.de.tienda.de.ropa;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String direccion;
    private Inventario inventario;
    private ArrayList<Vendedor> vendedores;

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new Inventario();
        this.vendedores = new ArrayList<>();
    }

    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public Inventario getInventario() {
        return inventario;
    }

    // Getters y Setters
}