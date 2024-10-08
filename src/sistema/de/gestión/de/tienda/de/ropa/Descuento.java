package sistema.de.gestión.de.tienda.de.ropa;

public class Descuento {
    private double porcentaje;
    private String descripcion;

    public Descuento(double porcentaje, String descripcion) {
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }


}