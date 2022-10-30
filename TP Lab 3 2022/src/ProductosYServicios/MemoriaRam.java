package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class MemoriaRam extends Producto{
	
	private int capacidad;
	private int frecuencia;
	private String tipo;
	private int cantidad;
	private String latencia;
	private float voltaje;
	private boolean isDisipador;
	
	
	public MemoriaRam() {
		super();
		this.capacidad = 0;
		this.frecuencia = 0;
		this.tipo = "";
		this.cantidad = 0;
		this.latencia = "";
		this.voltaje = 0;
		this.isDisipador = false;
	}
	
	public MemoriaRam(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, int capacidad, int frecuencia,
			String tipo, int cantidad, String latencia, float voltaje, boolean isDisipador) {
		super("MR-"+ codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.latencia = latencia;
		this.voltaje = voltaje;
		this.isDisipador = isDisipador;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getLatencia() {
		return latencia;
	}

	public float getVoltaje() {
		return voltaje;
	}

	public boolean isDisipador() {
		return isDisipador;
	}

	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setLatencia(String latencia) {
		this.latencia = latencia;
	}

	public void setVoltaje(float voltaje) {
		this.voltaje = voltaje;
	}

	public void setDisipador(boolean isDisipador) {
		this.isDisipador = isDisipador;
	}

	@Override
	public String toString() {
		return super.toString()+"\nMemoria Ram: \nGBs: " + getCapacidad() + "\nFrecuencia(MHZ): " + getFrecuencia() + "Gen: "
				+ getTipo() + "\nCantidad de tarjetas dim: " + getCantidad() + "\nLatencia: " + getLatencia()
				+ "\nVoltaje: " + getVoltaje() + "\nDisipador: " + isDisipador();
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
			retorno.put("Capacidad",getCapacidad());
			retorno.put("Frecuencia",getFrecuencia());
			retorno.put("Tipo", getTipo());
			retorno.put("Cantidad", getCantidad());
			retorno.put("Latencia",getLatencia());
			retorno.put("Voltaje",getVoltaje());
			retorno.put("Disipador", isDisipador());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}




}
