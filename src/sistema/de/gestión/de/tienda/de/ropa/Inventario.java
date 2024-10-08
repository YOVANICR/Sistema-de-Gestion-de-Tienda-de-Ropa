package sistema.de.gestión.de.tienda.de.ropa;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Prenda> listaPrendas;

    public Inventario() {
        listaPrendas = new ArrayList<>();
    }

    public void agregarPrenda(Prenda prenda) {
        listaPrendas.add(prenda);
    }

    public ArrayList<Prenda> getListaPrendas() {
        return listaPrendas;
    }

    // Otros métodos según sea necesario
}