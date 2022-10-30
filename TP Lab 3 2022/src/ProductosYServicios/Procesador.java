package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Procesador extends Producto{
	
	private String socket;
	private int nucleos;
	private int hilos;
	private int frecuenciaTurbo;
	private int procesoDeFabricacion;
	private int tdp;
	private boolean isCooler;
	
	
	public Procesador() {
		super();
		this.socket = "";
		this.nucleos = 0;
		this.hilos = 0;
		this.frecuenciaTurbo = 0;
		this.procesoDeFabricacion = 0;
		this.tdp = 0;
		this.isCooler = false;
	}
	
	public Procesador(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String socket, int nucleos, int hilos,
			int frecuenciaTurbo, int procesoDeFabricacion, int tdp, boolean isCooler) {
		super("CP-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.socket = socket;
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.frecuenciaTurbo = frecuenciaTurbo;
		this.procesoDeFabricacion = procesoDeFabricacion;
		this.tdp = tdp;
		this.isCooler = isCooler;
	}

	public String getSocket() {
		return socket;
	}

	public int getNucleos() {
		return nucleos;
	}

	public int getHilos() {
		return hilos;
	}

	public int getFrecuenciaTurbo() {
		return frecuenciaTurbo;
	}

	public int getProcesoDeFabricacion() {
		return procesoDeFabricacion;
	}

	public int getTdp() {
		return tdp;
	}

	public String mostrarCooler() {
		String cooler="no";
		if(isCooler==true){
			cooler="si";
		}
		return cooler;
	}

	public boolean isCooler() 
	{
		return isCooler;
	}
	
	public void setSocket(String socket) {
		this.socket = socket;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public void setHilos(int hilos) {
		this.hilos = hilos;
	}

	public void setFrecuenciaTurbo(int frecuenciaTurbo) {
		this.frecuenciaTurbo = frecuenciaTurbo;
	}

	public void setProcesoDeFabricacion(int procesoDeFabricacion) {
		this.procesoDeFabricacion = procesoDeFabricacion;
	}

	public void setTdp(int tdp) {
		this.tdp = tdp;
	}

	public void setCooler(boolean isCooler) {
		this.isCooler = isCooler;
	}

	@Override
	public String toString() {
		return super.toString()+"Procesador: \nSocket: " + getSocket() + "\nNucleos:" + getNucleos() + "\nHilos: "
				+ getHilos() + "\nFrecuencia turbo(Mhz): " + getFrecuenciaTurbo() + "\nProceso de fabricacion(nm): "
				+ getProcesoDeFabricacion() + "\nTdp:" + getTdp() + "\nTiene Cooler: " + mostrarCooler();
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
			retorno.put("Socket",getSocket());
			retorno.put("Nucleos", getNucleos());
			retorno.put("Hilos de proceso", getHilos());
			retorno.put("Frecuencia turbo", getFrecuenciaTurbo());
			retorno.put("Proceso de fabricacion", getProcesoDeFabricacion());
			retorno.put("TDP", getTdp());
			retorno.put("Cooler incluido",isCooler());
		}
		catch (
				JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
}
