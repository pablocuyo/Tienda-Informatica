package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Fuente extends Producto{
	private int watts;
	private String formato;
	private String certificacion;
	private boolean isModular;
	
	
	public Fuente() {
		super();
		this.watts = 0;
		this.formato = "";
		this.certificacion = "";
		this.isModular = false;
	}


	public Fuente(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, int watts, String formato, String certificacion,
			boolean isModular) {
		super("FU-"+ codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.watts = watts;
		this.formato = formato;
		this.certificacion = certificacion;
		this.isModular = isModular;
	}


	public int getWatts() {
		return watts;
	}


	public String getFormato() {
		return formato;
	}


	public String getCertificacion() {
		return certificacion;
	}


	public boolean isModular() {
		return isModular;
	}

	

	public void setWatts(int watts) {
		this.watts = watts;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}


	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}


	public void setModular(boolean isModular) {
		this.isModular = isModular;
	}


	@Override
	public String toString() {
		return super.toString()+"Fuente tWatts: " + getWatts() + ", Formato: " + getFormato() + ", Certificacion: "
				+ getCertificacion() + ", Modular: " + isModular() + "]";
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
			retorno.put("Watts",getWatts());
			retorno.put("Formato",getFormato());
			retorno.put("Certificacion", getCertificacion());
			retorno.put("Modular", isModular());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}
	
	
	
}
