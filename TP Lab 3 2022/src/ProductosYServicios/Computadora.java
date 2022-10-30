package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Computadora extends Producto {

	private String tipoPc;//notebook o de escritorio
	private String disco;
	private String ram;
	private String cpu;
	private String mother;
	private String fuente;
	private String gabinete;
	private String gpu;
	private String cooler;
	
	
	
	public Computadora() 
	{
		super();
		this.tipoPc = "";
		this.disco = "";
		this.ram = "";
		this.cpu = "";
		this.mother = "";
		this.fuente = "";
		this.gabinete = "";
		this.gpu = "";
		this.cooler = "";
	}
	
	
	public Computadora(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipoPc, String disco, String ram,
			String cpu, String mother, String fuente, String gabinete, String gpu, String cooler) {
		
		super("PC-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.tipoPc = tipoPc;
		this.disco = disco;
		this.ram = ram;
		this.cpu = cpu;
		this.mother = mother;
		this.fuente = fuente;
		this.gabinete = gabinete;
		this.gpu = gpu;
		this.cooler = cooler;
	}
	public Computadora( String tipoPc, String disco, String ram,
					   String cpu, String mother, String fuente, String gabinete, String gpu, String cooler) {

		this.tipoPc = tipoPc;
		this.disco = disco;
		this.ram = ram;
		this.cpu = cpu;
		this.mother = mother;
		this.fuente = fuente;
		this.gabinete = gabinete;
		this.gpu = gpu;
		this.cooler = cooler;
	}



	public String getTipoPc() {
		return tipoPc;
	}


	public String getDisco() {
		return disco;
	}


	public String getRam() {
		return ram;
	}


	public String getCpu() {
		return cpu;
	}


	public String getMother() {
		return mother;
	}


	public String getFuente() {
		return fuente;
	}


	public String getGabinete() {
		return gabinete;
	}


	public String getGpu() {
		return gpu;
	}


	public String getCooler() {
		return cooler;
	}


	
	public void setTipoPc(String tipoPc) {
		this.tipoPc = tipoPc;
	}


	public void setDisco(String disco) {
		this.disco = disco;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public void setMother(String mother) {
		this.mother = mother;
	}


	public void setFuente(String fuente) {
		this.fuente = fuente;
	}


	public void setGabinete(String gabinete) {
		this.gabinete = gabinete;
	}


	public void setGpu(String gpu) {
		this.gpu = gpu;
	}


	public void setCooler(String cooler) {
		this.cooler = cooler;
	}


	@Override
	public String toString() {
		return super.toString()+"Tipo=" + tipoPc + ", disco:" + disco + ", ram: " + ram + ", cpu: " + cpu + ", mother: "
				+ mother + ", fuente: " + fuente + ", gabinete: " + gabinete + ", gpu: " + gpu + ", cooler: " + cooler;
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
			retorno.put("TipoDePC", getTipoPc());
			retorno.put("disco", getDisco());
			retorno.put("RAM", getRam());
			retorno.put("CPU", getCpu());
			retorno.put("Mother", getMother());
			retorno.put("Fuente", getFuente());
			retorno.put("Gabinete", getGabinete());
			retorno.put("GPU", getGpu());
			retorno.put("Cooler", getCooler());

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return retorno;
	}
}
