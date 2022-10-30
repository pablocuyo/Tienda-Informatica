package interfaces;

public interface I_Colecciones<K,T> {

	public void agregarObjetoColeccion(K clave, T elemento);
	
	public void eliminarObjDeLaColeccion(K clave);
	
	public String mostrarElementoDeLaColeccion(K clave);
	
	public String listar();
	
	
}
