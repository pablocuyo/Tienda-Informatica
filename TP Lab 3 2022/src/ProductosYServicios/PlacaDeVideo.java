package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class PlacaDeVideo extends Producto{
	
	private String conectividad;
	private int consumo;
	private String tipoDeMemoria;
	private int capacidadDeMemoria;
	private boolean isbackPlate;
	
	
	public PlacaDeVideo() {
		super();
		this.conectividad = "";
		this.consumo = 0;
		this.tipoDeMemoria = "";
		this.capacidadDeMemoria = 0;
		this.isbackPlate = false;
	}
	
	public PlacaDeVideo(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String conectividad, int consumo,
			String tipoDeMemoria, int capacidadDeMemoria, boolean isbackPlate) {
		super("PV-"+ codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.conectividad = conectividad;
		this.consumo = consumo;
		this.tipoDeMemoria = tipoDeMemoria;
		this.capacidadDeMemoria = capacidadDeMemoria;
		this.isbackPlate = isbackPlate;
	}

	public String getConectividad() {
		return conectividad;
	}

	public int getConsumo() {
		return consumo;
	}

	public String getTipoDeMemoria() {
		return tipoDeMemoria;
	}

	public int getCapacidadDeMemoria() {
		return capacidadDeMemoria;
	}

	public boolean isBackPlate() {
		return isbackPlate;
	}
	public String showBackPlate() {
		String backPlate="no";
		if(isbackPlate==true){
			backPlate= "si";
		}
		return backPlate;
	}

	
	public boolean isIsbackPlate() {
		return isbackPlate;
	}

	public void setIsbackPlate(boolean isbackPlate) {
		this.isbackPlate = isbackPlate;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public void setTipoDeMemoria(String tipoDeMemoria) {
		this.tipoDeMemoria = tipoDeMemoria;
	}

	public void setCapacidadDeMemoria(int capacidadDeMemoria) {
		this.capacidadDeMemoria = capacidadDeMemoria;
	}

	@Override
	public String toString() {
		return "PlacaDeVideo"+ super.toString()+"\nConectividad: " + getConectividad() + "\nConsumo(Wts): " + getConsumo()
				+ "\nTipo de memoria(gen): " + getTipoDeMemoria() + "\nCapacidad de memoria(GB): " + getCapacidadDeMemoria()
				+ "\nBackPlate: " + showBackPlate();
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
			retorno.put("Conectividad",getConectividad());
			retorno.put("Consumo",getConsumo());
			retorno.put("Tipo Memoria VRam", getTipoDeMemoria());
			retorno.put("Capacidad memoria VRam", getCapacidadDeMemoria());
			retorno.put("Backplate", isBackPlate());
		}
		catch (
				JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
}
