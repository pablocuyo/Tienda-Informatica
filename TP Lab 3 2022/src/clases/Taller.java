package clases;

import ProductosYServicios.ServicioTaller;

import java.util.LinkedList;

public class Taller {
    private LinkedList<ServicioTaller> serviciosTomados;

    public Taller() {
        this.serviciosTomados = new LinkedList<>();
    }
    
	
	public void agregar(ServicioTaller elemento)
	{
		
		serviciosTomados.addLast(elemento);
		
	}
	
	public ServicioTaller remover()
	{
		
		return serviciosTomados.poll();
	}
	
	public ServicioTaller primerElemento()
	{
		return serviciosTomados.peekFirst();
	}
	
	public ServicioTaller ultimoElemento() {
		return serviciosTomados.peekLast();
	}
	
	public String mostrar() 
	{
		StringBuilder sb= new StringBuilder();
		LinkedList<ServicioTaller> aux= new LinkedList<>();
		
		while(!serviciosTomados.isEmpty()) 
		{
			aux.add(serviciosTomados.pollLast());
			sb.append(aux.peekLast().toString() +"\n");
		}
		
		while(!aux.isEmpty()) 
		{
			serviciosTomados.add(aux.pollLast());
		}
		
		return sb.toString();
	}
	
	public boolean estaVacio() 
	{
		boolean vacio = serviciosTomados.isEmpty();
		return vacio;
	}
}

