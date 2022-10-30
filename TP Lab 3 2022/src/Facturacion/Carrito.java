package Facturacion;

import ProductosYServicios.ItemPedido;
import ProductosYServicios.ItemServicio;

import java.util.ArrayList;

public class Carrito {
	
    private ArrayList<ItemPedido> items;
    private ArrayList<ItemServicio>misServicios;

    public Carrito() {
        this.items=new ArrayList<>();
        this.misServicios=new ArrayList<>();
    }
    
    
    public String mostrarCarrito(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<items.size();i++)
        {
            sb.append(items.get(i).toString()+"\n");
        }
        for(int i=0;i<misServicios.size();i++)
        {
            sb.append(misServicios.get(i).toString()+"\n");
        }
        
        sb.append("\nTotal carrito: "+calcularPrecioTotal()+"\n");
        return sb.toString();
    }
    
    public void agregar(ItemPedido nuevo){
        this.items.add(nuevo);
    }
    
    public void agregar(ItemServicio nuevo){
        this.misServicios.add(nuevo);
    }
    
    public double calcularPrecioTotal() 
    {
    	double total=0;
    	
    	for(int i=0;i<items.size();i++) 
    	{
    		total=total+items.get(i).getPrecioTotal();
    	}
    	
    	for(int i=0;i<misServicios.size();i++) 
    	{
    		total=total+misServicios.get(i).getPrecio();
    	}
    	
    	
    	return total;
    }

    public ArrayList<ItemPedido> getItems() {
        return items;
    }

    public ArrayList<ItemServicio> getMisServicios() {
        return misServicios;
    }

    public int tamanioCarrito()
    {
    	return misServicios.size()+items.size();
    }
    
    public void vaciarCarro() 
    {
    	items.removeAll(items);
    	misServicios.removeAll(misServicios);
    }
    public void limpiarCarro(){
        for(int i=0;i<items.size();i++){
            items.get(i).getProducto().aumentarStock(items.get(i).getCantidad());
        }
    }

}
