package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class MotherBoard extends Producto{

	private String plataforma;
	private String socket;
	private String factor;
	private int cantidadDeSlotsDeMemoria;
	private int puertosSata;
	private String salidasDeVideo;
	private int cantidadDeSlotsM2;
	private int puertosUSB;

	public MotherBoard() {
		super();
		this.plataforma = "";
		this.socket = "";
		this.factor = "";
		this.cantidadDeSlotsDeMemoria = 0;
		this.puertosSata = 0;
		this.salidasDeVideo = "";
		this.cantidadDeSlotsM2 = 0;
		this.puertosUSB = 0;
	}

	public MotherBoard(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String plataforma, String socket,
			String factor, int cantidadDeSlotsDeMemoria, int puertosSata, String salidasDeVideo, int cantidadDeSlotsM2,
			int puertosUSB) {
		super("MB-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.plataforma = plataforma;
		this.socket = socket;
		this.factor = factor;
		this.cantidadDeSlotsDeMemoria = cantidadDeSlotsDeMemoria;
		this.puertosSata = puertosSata;
		this.salidasDeVideo = salidasDeVideo;
		this.cantidadDeSlotsM2 = cantidadDeSlotsM2;
		this.puertosUSB = puertosUSB;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public String getSocket() {
		return socket;
	}

	public String getFactor() {
		return factor;
	}

	public int getCantidadDeSlotsDeMemoria() {
		return cantidadDeSlotsDeMemoria;
	}

	public int getPuertosSata() {
		return puertosSata;
	}

	public String getSalidasDeVideo() {
		return salidasDeVideo;
	}

	public int getCantidadDeSlotsM2() {
		return cantidadDeSlotsM2;
	}

	public int getPuertosUSB() {
		return puertosUSB;
	}
	
	

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public void setFactor(String factor) {
		this.factor = factor;
	}

	public void setCantidadDeSlotsDeMemoria(int cantidadDeSlotsDeMemoria) {
		this.cantidadDeSlotsDeMemoria = cantidadDeSlotsDeMemoria;
	}

	public void setPuertosSata(int puertosSata) {
		this.puertosSata = puertosSata;
	}

	public void setSalidasDeVideo(String salidasDeVideo) {
		this.salidasDeVideo = salidasDeVideo;
	}

	public void setCantidadDeSlotsM2(int cantidadDeSlotsM2) {
		this.cantidadDeSlotsM2 = cantidadDeSlotsM2;
	}

	public void setPuertosUSB(int puertosUSB) {
		this.puertosUSB = puertosUSB;
	}

	@Override
	public String toString() {
		return super.toString()+"MotherBoard:  Plataforma: " + getPlataforma() + ", Socket: " + getSocket() + ", Factor: "
				+ getFactor() + ", Cantidad de Slots de memoria: " + getCantidadDeSlotsDeMemoria()
				+ ", Puertos sata: " + getPuertosSata() + ", Salidas de video: " + getSalidasDeVideo()
				+ ", cantidad de SlotsM2: " + getCantidadDeSlotsM2() + ", PuertosUSB: " + getPuertosUSB() + "]";
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
		retorno.put("Plataforma",getPlataforma());
		retorno.put("Socket",getSocket());
		retorno.put("Factor", getFactor());
		retorno.put("Slot para memoria Ram", getCantidadDeSlotsDeMemoria());
		retorno.put("Puertos sata", getPuertosSata());
		retorno.put("Salidas de video", getSalidasDeVideo());
		retorno.put("Slots para ssd m2", getCantidadDeSlotsM2());
		retorno.put("Puertos USB", getPuertosUSB());
	}
		catch (
	JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return retorno;

	}


}
