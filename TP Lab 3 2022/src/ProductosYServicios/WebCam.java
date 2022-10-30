package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class WebCam extends Producto{
	
	private String resolucionMaximaDevideo;
	private String tipoDeLente;
	private String tipoDeResolucion;
	private boolean isMicrofono;
	

	public WebCam() {
		super();
		this.resolucionMaximaDevideo = "";
		this.tipoDeLente = "";
		this.tipoDeResolucion = "";
		this.isMicrofono = false;
	}
	
	public WebCam(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String resolucionMaximaDevideo, String tipoDeLente,
			String tipoDeResolucion, boolean isMicrofono) {
		super("WC-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.resolucionMaximaDevideo = resolucionMaximaDevideo;
		this.tipoDeLente = tipoDeLente;
		this.tipoDeResolucion = tipoDeResolucion;
		this.isMicrofono = isMicrofono;
	}

	public String getResolucionMaximaDevideo() {
		return resolucionMaximaDevideo;
	}

	public String getTipoDeLente() {
		return tipoDeLente;
	}

	public String getTipoDeResolucion() {
		return tipoDeResolucion;
	}

	public boolean isMicrofono() {
		return isMicrofono;
	}

	
	public void setResolucionMaximaDevideo(String resolucionMaximaDevideo) {
		this.resolucionMaximaDevideo = resolucionMaximaDevideo;
	}

	public void setTipoDeLente(String tipoDeLente) {
		this.tipoDeLente = tipoDeLente;
	}

	public void setTipoDeResolucion(String tipoDeResolucion) {
		this.tipoDeResolucion = tipoDeResolucion;
	}

	public void setMicrofono(boolean isMicrofono) {
		this.isMicrofono = isMicrofono;
	}

	@Override
	public String toString() {
		return super.toString()+"WebCam Resolucion maxima de video: " + getResolucionMaximaDevideo() + ", Tipo de lente: "
				+ getTipoDeLente() + ", Tipo de resolucion: " + getTipoDeResolucion() + ", tiene microfono: "
				+ isMicrofono() + "]";
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
			retorno.put("Resolucion Max",getResolucionMaximaDevideo());
			retorno.put("Tipo de lente",getTipoDeLente());
			retorno.put("Tipo de resolucion", getTipoDeResolucion());
			retorno.put("Microfono incluido", isMicrofono());

		}
		catch (
				JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
}
