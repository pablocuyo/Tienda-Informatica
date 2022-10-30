package Facturacion;

import clases.Cliente;
import clases.Persona;

import java.io.Serializable;
import java.util.Date;

public class Factura implements Serializable{
    private int id;
    private Date fecha;
    private Cliente comprador;
    private String listaDeProductos;
    private double precio;
    private String vendedor;//getNombre de vendedor
    public static int cantTotalFacturas;

    public Factura() {
        nuevoID();
        this.fecha = new Date();
        this.comprador = new Cliente();
        this.listaDeProductos = "p";
        this.precio = 0;
        this.vendedor = "v";
    }
    public Factura(Cliente comprador, Carrito listaDeProductos, String vendedor) {
        nuevoID();
        this.fecha = new Date();
        this.comprador = comprador;
        this.listaDeProductos = listaDeProductos.mostrarCarrito();
        this.precio = listaDeProductos.calcularPrecioTotal();
        this.vendedor = vendedor;
    }
    
    public void nuevoID(){
    	
        this.id=cantTotalFacturas+1;
       this.cantTotalFacturas=cantTotalFacturas+1;
    }
    
    
    public int getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setCantF(int nuevo) 
	{
		cantTotalFacturas=nuevo;
	}
	public Cliente getComprador() {
		return comprador;
	}

	public String getListaDeProductos() {
		return listaDeProductos;
	}

	public double getPrecio() {
		return precio;
	}

	public String getVendedor() {
		return vendedor;
	}

	public static int getCantTotalFacturas() {
		return cantTotalFacturas;
	}

	@Override
    public String toString() {
        return "Tienda de Informatica\n"+"Factura numero:"+id+"\nFecha=" + fecha +
                "\nCliente:" + comprador.getApellido() + " "+ comprador.getNombre() +
                "\nProductos:" + listaDeProductos +"\nVendedor:" + vendedor + "\n\nPrecio total:" + precio+"\n\n" ;
    }
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		        boolean igual=false;
		        if(o!=null){
		            if(o instanceof Factura){
		            	Factura aux= (Factura)o;
		                if(aux.getId()== getId()){
		                    igual=true;
		                }
		            }
		        }
		        return igual;
	}
}	
