package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Facturacion.Factura;
import interfaces.I_Colecciones;

public class ContenedoraDeFacturas<K,T extends Factura> implements I_Colecciones<K,T>{
	
	private HashMap<K,T> listaFacturas;
	
	
	public ContenedoraDeFacturas() {
		this.listaFacturas = new HashMap<>();
	}

	
	@Override
	public void agregarObjetoColeccion(K clave, T elemento) {
		// TODO Auto-generated method stub
		listaFacturas.put(clave, elemento);
	}


	@Override
	public void eliminarObjDeLaColeccion(K clave) {
		// TODO Auto-generated method stub
		listaFacturas.remove(clave);
	}


	@Override
	public String mostrarElementoDeLaColeccion(K clave) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<K, T>> it = listaFacturas.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<K, T> entry =  (Map.Entry<K,T>)it.next();
			if(clave.equals(entry.getKey())) {
			sb.append(entry.getValue().toString()+"\n");
				}
			}
		return sb.toString();
	}


	@Override
	public String listar() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<K,T>> it = listaFacturas.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<K,T> entry =  (Map.Entry<K,T>)it.next();
			sb.append(entry.getValue().toString()+"\n");
		}
		return sb.toString();
	}

	public Iterator devolverIterator() 
	{
		return  listaFacturas.entrySet().iterator();
	}


	public int tamanio() 
	{
		return listaFacturas.size();
	}

	

	



	
}
