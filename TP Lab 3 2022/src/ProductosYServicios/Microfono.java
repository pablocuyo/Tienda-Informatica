package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Microfono extends Producto{
	
	private String tipoDePie;
	private String conexion;
	

	public Microfono() {
		super();
		this.tipoDePie = "";
		this.conexion = "";
	}
	public Microfono(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipoDePie, String conexion) {
		super("MI-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipoDePie = tipoDePie;
		this.conexion = conexion;
	}
	public String getTipoDePie() {
		return tipoDePie;
	}
	public String getConexion() {
		return conexion;
	}
	
	
	public void setTipoDePie(String tipoDePie) {
		this.tipoDePie = tipoDePie;
	}
	public void setConexion(String conexion) {
		this.conexion = conexion;
	}
	@Override
	public String toString() {
		return super.toString()+"Microfono Tipo de pie: " + getTipoDePie() + ", Conexion: " + getConexion() + "]";
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
			retorno.put("Tipo de pie",getTipoDePie());
			retorno.put("Conexion",getConexion());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
	
}
