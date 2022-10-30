package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Monitor extends Producto {

	private String tipoDePanel;
	private boolean isCurvo;
	private String conexion;
	private String tipoDeFuente;
	private int pulgadas;
	private String resolucion;
	private String frecuencia;
	
	public Monitor() {
		super();
		this.tipoDePanel = "";
		this.isCurvo = false;
		this.conexion = "";
		this.tipoDeFuente = "";
		this.pulgadas = 18;
		this.resolucion = "";
		this.frecuencia = "";
	}
	
	public Monitor(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipoDePanel, boolean isCurvo, String conexion,
			String tipoDeFuente, int pulgadas, String resolucion, String frecuencia) {
		super("MO-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipoDePanel = tipoDePanel;
		this.isCurvo = isCurvo;
		this.conexion = conexion;
		this.tipoDeFuente = tipoDeFuente;
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
		this.frecuencia = frecuencia;
	}

	public String getTipoDePanel() {
		return tipoDePanel;
	}

	public boolean isCurvo() {
		return isCurvo;
	}

	public String getConexion() {
		return conexion;
	}

	public String getTipoDeFuente() {
		return tipoDeFuente;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public String getFrecuencia() {
		return frecuencia;
	}
	
	

	public void setTipoDePanel(String tipoDePanel) {
		this.tipoDePanel = tipoDePanel;
	}

	public void setCurvo(boolean isCurvo) {
		this.isCurvo = isCurvo;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

	public void setTipoDeFuente(String tipoDeFuente) {
		this.tipoDeFuente = tipoDeFuente;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return super.toString()+"Monitor: Tipo de panel: " + getTipoDePanel() + ", Curvo: " + isCurvo() + ", Conexion: "
				+ getConexion() + ", Tipo de fuente: " + getTipoDeFuente() + ", Pulgadas: " + getPulgadas()
				+ ", Resolucion: " + getResolucion() + ", Frecuencia: " + getFrecuencia() + "]";
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
			retorno.put("Tipo de panel",getTipoDePanel());
			retorno.put("Tipo de fuente",getTipoDeFuente());
			retorno.put("Curvo",isCurvo());
			retorno.put("Conexion",getConexion());
			retorno.put("Pulgadas",getPulgadas());
			retorno.put("Resolucion",getResolucion());
			retorno.put("Frecuencia", getFrecuencia());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
	
	
	
}
