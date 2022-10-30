package ProductosYServicios;

public class ItemPedido {
    private Producto pedido; 
    private double precioTotal;
    private int cantidad;
    
    
    public ItemPedido(Producto aCargar, int cantidad) {
        this.pedido= aCargar;
        this.precioTotal=cantidad*this.pedido.getPrecio();
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return pedido;
    }

    public String descripcionPedido()
     {
     	return pedido.detallePedido();
     
     } 
     
    public double getPrecioTotal() 
    {
        return precioTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "\n" + descripcionPedido() +"\nCantidad=" + cantidad + "\nSubTotal=" + precioTotal; //
    }
}
