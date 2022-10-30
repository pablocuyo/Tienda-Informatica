package colecciones;

import ProductosYServicios.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Catalogo {

	HashMap<String,Producto> mapaCatalogo;

	public Catalogo() {
		this.mapaCatalogo = new HashMap<String,Producto>();
	}
	
	public void agregar(Producto nuevo){
		this.mapaCatalogo.put(nuevo.getCodigo(),nuevo);
	}
	
	
	public void eliminar(String id){
		this.mapaCatalogo.remove(id);
	}
	
	public HashMap<String, Producto> getMapaCatalogo() {
		return mapaCatalogo;
	}
	
	
	
	public String listar(){
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			sb.append(entry.getValue().toString()+"\n");
		}
		return sb.toString();
	}
	
	public String listarAlmacenamiento()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Almacenamiento){
				sb.append(entry.getValue().toString()+"\n");
			}

		}
		return sb.toString();
	}

	

	public String listarAuriculares()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Auriculares){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	public String listarComputadoras()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Computadora){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarCoolers()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Cooler){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarFuentes()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Fuente){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	public String listarGabinetes()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Gabinete){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarMemorias()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof MemoriaRam){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarMicrofonos()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Microfono){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarMonitores()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Monitor){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarMotherboards()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof MotherBoard){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarMouses()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Mouse){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarParlantes()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Parlante){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarPlacas()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof PlacaDeVideo){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarProcesadores()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Procesador){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarTeclados()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof Teclado){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public String listarWebcams()
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<String, Producto> entry =  (Map.Entry<String,Producto>)it.next();
			if(entry.getValue() instanceof WebCam){
				sb.append(entry.getValue().toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	
	public void editar(Producto editado){
		String clave= editado.getCodigo();
		this.mapaCatalogo.put(clave,editado);
	}
	
	
	public String buscar(String codigo)
	{
		String retorno="";
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Producto> entry = (Map.Entry<String, Producto>) it.next();
			if(entry.getKey().equals(codigo)) {
				retorno = entry.getValue().toString();
			}
			}return retorno;
	}
	public Producto retornarProducto(String codigo)
	{
		Producto aux=null;
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Producto> entry = (Map.Entry<String, Producto>) it.next();
			if(entry.getKey().equals(codigo)) {
				aux = entry.getValue();
			}
		}
		return aux;
	}

	public Iterator devolerIt() 
	{
		
		Iterator<Map.Entry<String, Producto>> it = mapaCatalogo.entrySet().iterator();
		
		return it;
		
	}
}
