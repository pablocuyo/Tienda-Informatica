package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Mouse extends Producto{

	private int cantidadDeBotones;
	private String switcH;
	private String sensor;
	private boolean isInalambrica;
	private int dpiMax;
	
	
	
	public Mouse() {
		super();
		this.cantidadDeBotones = 0;
		this.switcH = "";
		this.sensor = "";
		this.isInalambrica = false;
		this.dpiMax = 0;
	}
	
	public Mouse(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, int cantidadDeBotones, String switcH, String sensor,
			boolean isInalambrica, int dpiMax) {
		super("MS-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.cantidadDeBotones = cantidadDeBotones;
		this.switcH = switcH;
		this.sensor = sensor;
		this.isInalambrica = isInalambrica;
		this.dpiMax = dpiMax;
	}

	public int getCantidadDeBotones() {
		return cantidadDeBotones;
	}

	public String getSwitcH() {
		return switcH;
	}

	public String getSensor() {
		return sensor;
	}

	public boolean isInalambrica() {
		return isInalambrica;
	}

	public int getDpiMax() {
		return dpiMax;
	}

	
	public void setCantidadDeBotones(int cantidadDeBotones) {
		this.cantidadDeBotones = cantidadDeBotones;
	}

	public void setSwitcH(String switcH) {
		this.switcH = switcH;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	public void setInalambrica(boolean isInalambrica) {
		this.isInalambrica = isInalambrica;
	}

	public void setDpiMax(int dpiMax) {
		this.dpiMax = dpiMax;
	}

	@Override
	public String toString() {
		return super.toString()+"Mouse: Cantidad de botones: " + getCantidadDeBotones() + ", Switch: " + getSwitcH()
				+ ", Sensor: " + getSensor() + ", es inalambrico: " + isInalambrica() + ", DpiMax: "
				+ getDpiMax() + "]";
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
			retorno.put("Cantidad de botones",getCantidadDeBotones());
			retorno.put("Switch",getSwitcH());
			retorno.put("Sensor", getSensor());
			retorno.put("Inalambrico", isInalambrica());
			retorno.put("Dpi max", getDpiMax());

		}
		catch (
				JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
}
