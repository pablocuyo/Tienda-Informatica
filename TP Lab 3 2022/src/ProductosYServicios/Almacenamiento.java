package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Almacenamiento extends Producto{
    
	
	private String tipoDeDisco;
	private int capacidad;
	
	public Almacenamiento() {
		super();
		this.tipoDeDisco = "";
		this.capacidad = 0;
	}
	
	public Almacenamiento(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion,int capacidad,String tipoDeDisco) {
		super("AL-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		
		this.tipoDeDisco = tipoDeDisco;
		this.capacidad = capacidad;
	}

	

	public String getTipoDeDisco() {
		return tipoDeDisco;
	}

	public int getCapacidad() {
		return capacidad;
	}

	@Override
	public String toString() {
		return super.toString()+"Almacenamiento:\nTipo de disco: " + getTipoDeDisco()
				+ "\nCapacidad: " + getCapacidad();
	}
	
	@Override
	public JSONObject productoAJson() {
		// TODO Auto-generated method stub
		JSONObject retorno = new JSONObject();
		
		try {
			retorno.put("codigo",getCodigo());
			retorno.put("marca",getMarca());
			retorno.put("modelo",getModelo());
			retorno.put("stock",getStock());
			retorno.put("precio",getPrecio());
			retorno.put("peso",getPeso());
			retorno.put("paisOrigen",getPaisOrigen());
			retorno.put("rgb",isRgb());
			retorno.put("color",getColor());
			retorno.put("descripcion",getDescripcion());
			retorno.put("Capacidad",getCapacidad());
			retorno.put("Tipo de disco",getTipoDeDisco());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retorno;
	}

	public void setTipoDeDisco(String tipoDeDisco) {
		this.tipoDeDisco = tipoDeDisco;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
