package ProductosYServicios;

import org.json.JSONException;
import org.json.JSONObject;

public class CoolerCpu extends Cooler{
	
	private int tdp;
	private String tipoDeDisipacion;
	private String socketCompatible;
	
	
	public CoolerCpu() {
		super();
		this.tdp = 0;
		this.tipoDeDisipacion = "";
		this.socketCompatible = "";
	}


	public CoolerCpu(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipo, int consumo, int tdp,
			String tipoDeDisipacion, String socketCompatible) {
		super("CPU"+codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion, tipo, consumo);
		this.tdp = tdp;
		this.tipoDeDisipacion = tipoDeDisipacion;
		this.socketCompatible = socketCompatible;
	}


	public int getTdp() {
		return tdp;
	}


	public String getTipoDeDisipacion() {
		return tipoDeDisipacion;
	}


	public String getSocketCompatible() {
		return socketCompatible;
	}

	
	public void setTdp(int tdp) {
		this.tdp = tdp;
	}


	public void setTipoDeDisipacion(String tipoDeDisipacion) {
		this.tipoDeDisipacion = tipoDeDisipacion;
	}


	public void setSocketCompatible(String socketCompatible) {
		this.socketCompatible = socketCompatible;
	}


	@Override
	public String toString() {
		return super.toString()+"\nTdp:" + getTdp() + "\nTipo de disipacion: " + getTipoDeDisipacion()
				+ "\nSocket compatible:" + getSocketCompatible();
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
			retorno.put("Tipo",getTipo());
			retorno.put("Consumo",getConsumo());
			retorno.put("TDP", getTdp());
			retorno.put("Tipo disipacion", getTipoDeDisipacion());
			retorno.put("Socket", getSocketCompatible());

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}
	
	
}
