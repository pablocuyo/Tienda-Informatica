package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class Auriculares extends Producto {
	
	private boolean isInalambrico;
	private boolean isMicrofono;
	private int largoDelCable; //en metros;
	
	
	public Auriculares() {
		super();
		this.isInalambrico = false;
		this.isMicrofono = false;
		this.largoDelCable = 1;
	}
	
	
	
	public Auriculares(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, boolean isInalambrico,
			boolean isMicrofono, int largoDelCable) {
		super("AU-"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion);
		this.isInalambrico = isInalambrico;
		this.isMicrofono = isMicrofono;
		this.largoDelCable = largoDelCable;
	}



	public boolean isInalambrico() {
		return isInalambrico;
	}

	public boolean isMicrofono() {
		return isMicrofono;
	}

	public int getLargoDelCable() {
		return largoDelCable;
	}

	@Override
	public String toString() {
		return super.toString()+"Auriculares:\nInalambrico: " + isInalambrico() + "\nMicrofono: " + isMicrofono()
				+ "\nLargoDelCable: " + getLargoDelCable();
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
			retorno.put("Microfono",isMicrofono);
			retorno.put("Inalambrico",isInalambrico);
			retorno.put("Largo cable",getLargoDelCable());
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}



	public void setInalambrico(boolean isInalambrico) {
		this.isInalambrico = isInalambrico;
	}



	public void setMicrofono(boolean isMicrofono) {
		this.isMicrofono = isMicrofono;
	}



	public void setLargoDelCable(int largoDelCable) {
		this.largoDelCable = largoDelCable;
	}
	
	
	
}
