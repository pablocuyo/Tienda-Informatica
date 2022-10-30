package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Gabinete extends Producto {
	
	private String factorMother;
	private boolean isVentana;
	private int cantidadDeSlotsParaCooler;
	private int usbFrontal;
	private int alto;
	private int ancho;
	private int profundo;
	
	
	public Gabinete() {
		super();
		this.factorMother = "";
		this.isVentana = false;
		this.cantidadDeSlotsParaCooler = 0;
		this.usbFrontal = 0;
		this.alto = 0;
		this.ancho = 0;
		this.profundo = 0;
	}
	
	public Gabinete(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String facttorMother, boolean isVentana, int cantidadDeSlotsParaCooler, int usbFrontal, int alto, int ancho, int profundo) {
		super("GA"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.factorMother = facttorMother;
		this.isVentana = isVentana;
		this.cantidadDeSlotsParaCooler = cantidadDeSlotsParaCooler;
		this.usbFrontal = usbFrontal;
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
	}

	public String getFactorMother() {
		return factorMother;
	}

	public boolean isVentana() {
		return isVentana;
	}


	public int getCantidadDeSlotsParaCooler() {
		return cantidadDeSlotsParaCooler;
	}

	public int getUsbFrontal() {
		return usbFrontal;
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	public int getProfundo() {
		return profundo;
	}

	
	public void setFactorMother(String factorMother) {
		this.factorMother = factorMother;
	}

	public void setVentana(boolean isVentana) {
		this.isVentana = isVentana;
	}

	public void setCantidadDeSlotsParaCooler(int cantidadDeSlotsParaCooler) {
		this.cantidadDeSlotsParaCooler = cantidadDeSlotsParaCooler;
	}

	public void setUsbFrontal(int usbFrontal) {
		this.usbFrontal = usbFrontal;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setProfundo(int profundo) {
		this.profundo = profundo;
	}

	@Override
	public String toString() {
		return super.toString()+"Gabinete FactorMother: " + getFactorMother() + ", Ventana:" + isVentana() + ", Cantidad de Slots para cooler: " + getCantidadDeSlotsParaCooler()
				+ ", Usb Frontal: " + getUsbFrontal() + ", Alto: " + getAlto() + ", Ancho: " + getAncho()
				+ ", Profundo: " + getProfundo() + "]";
	}

	@Override
	public JSONObject productoAJson() {
		// TODO Auto-generated method stub
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
			retorno.put("Factor mother",getFactorMother());
			retorno.put("Ventana",isVentana());
			retorno.put("Slot Coolers", getCantidadDeSlotsParaCooler());
			retorno.put("USBs frontales", getUsbFrontal());
			retorno.put("Alto",getAlto());
			retorno.put("Ancho",getAncho());
			retorno.put("Profundidad",getProfundo());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;

	}
	
	
	
}
