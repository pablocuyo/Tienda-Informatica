package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Cooler extends Producto{
	
	private String tipo;
	private int consumo;
	
	public Cooler() {
		super();
		this.tipo = "";
		this.consumo =0;
	}
	
	
	
	public Cooler(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipo, int consumo) {
		super("CL-"+ codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipo = tipo;
		this.consumo = consumo;
	}



	public String getTipo() {
		return tipo;
	}



	public int getConsumo() {
		return consumo;
	}


	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}



	@Override
	public String toString() {
		return super.toString()+"\nTipo:" + getTipo() + "\nConsumo: " + getConsumo() ;
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
			retorno.put("Tipo",getTipo());
			retorno.put("Consumo",getConsumo());
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}
	
	
}
