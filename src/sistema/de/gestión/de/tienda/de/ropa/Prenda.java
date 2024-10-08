package sistema.de.gestión.de.tienda.de.ropa;


public class Prenda {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
    private Proveedor proveedor;

    // Constructor de la clase Prenda
    public Prenda(int id, String nombre, double precio, int cantidad, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    // Método getter para el precio
    public double getPrecio() {
        return precio;
    }

    // Otros getters y setters si son necesarios
}
