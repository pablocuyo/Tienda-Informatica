package ProductosYServicios;

import java.io.Serializable;

public class ItemServicio implements Serializable{
    private String descripcion;
    private double precio;

    public ItemServicio(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nServicio: " + descripcion + "\nPrecio=" + precio;
    }
}
