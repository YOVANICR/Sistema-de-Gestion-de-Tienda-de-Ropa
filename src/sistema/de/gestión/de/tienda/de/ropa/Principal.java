package sistema.de.gestión.de.tienda.de.ropa;

public class Principal {
    public static void main(String[] args) {
        
        // Crear un cliente
        Cliente cliente1 = new Cliente(1, "Juan Pérez", "juan.perez@email.com");

        // Crear un proveedor
        Proveedor proveedor1 = new Proveedor(1, "Proveedor de Ropa", "contacto@proveedor.com");

        // Crear una prenda
        Prenda prenda1 = new Prenda(101, "Camiseta", 19.99, 50, proveedor1);

        // Crear un pedido y agregar la prenda
        Pedido pedido1 = new Pedido(1, cliente1);
        pedido1.agregarPrenda(prenda1);

        // Mostrar el total del pedido
        System.out.println("Total del pedido: $" + pedido1.getTotal());
        
    }
}
