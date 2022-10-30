package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Teclado extends Producto{
	
	private String tipo;
	private String formfactor;
	private String switcH;
	
	public Teclado() {
		super();
		this.tipo = "";
		this.formfactor = "";
		this.switcH = "";
	}
	
	
	public Teclado(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipo, String formfactor, String switcH) {
		super("KB-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipo = tipo;
		this.formfactor = formfactor;
		this.switcH = switcH;
	}


	public String getTipo() {
		return tipo;
	}


	public String getFormfactor() {
		return formfactor;
	}


	public String getSwitcH() {
		return switcH;
	}


	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setFormfactor(String formfactor) {
		this.formfactor = formfactor;
	}


	public void setSwitcH(String switcH) {
		this.switcH = switcH;
	}


	@Override
	public String toString() {
		return super.toString()+"Teclado:  Tipo: " + getTipo() + ", Form factor: " + getFormfactor() + ", Switch: "
				+ getSwitcH() + "]";
	}


	
	@Override
	public JSONObject productoAJson() {

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
			retorno.put("Form Factor",getFormfactor());
			retorno.put("Switches", getSwitcH());
		}
		catch (
				JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
}
