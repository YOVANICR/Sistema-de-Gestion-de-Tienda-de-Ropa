package sistema.de.gestión.de.tienda.de.ropa;

public class Vendedor {
    private int id;
    private String nombre;
    private Tienda tienda;

    public Vendedor(int id, String nombre, Tienda tienda) {
        this.id = id;
        this.nombre = nombre;
        this.tienda = tienda;
    }

    // Getters y Setters
}