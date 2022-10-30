package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Parlante extends Producto{
	
	private String potencia;
	private String tipoDeConectores;
	private String alimentacion;
	
	
	public Parlante() {
		super();
		this.potencia = "";
		this.tipoDeConectores = "";
		this.alimentacion = "";
	}
	
	public Parlante(String codigo, String marca, String modelo, int stock, double precio, double peso,
					String paisOrigen, boolean rgb, String color, String descripcion, String potencia, String tipoDeConectores,
					String alimentacion) {
		super("PA-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.potencia = potencia;
		this.tipoDeConectores = tipoDeConectores;
		this.alimentacion = alimentacion;
	}

	public String getPotencia() {
		return potencia;
	}

	public String getTipoDeConectores() {
		return tipoDeConectores;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public void setTipoDeConectores(String tipoDeConectores) {
		this.tipoDeConectores = tipoDeConectores;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return super.toString()+"Parlantes Potencia: " + getPotencia() + ", Tipo de conectores: " + getTipoDeConectores()
				+ ", Alimentacion: " + getAlimentacion() + "]";
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
			retorno.put("Potencia",getPotencia());
			retorno.put("Tipo de conectores",getTipoDeConectores());
			retorno.put("Alimentacion", getAlimentacion());
		}
		catch (
				JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
}
