package jsonHerramientas;

import ProductosYServicios.*;
import colecciones.Catalogo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StreamJSON {
private String nombre;
	
	public StreamJSON()
	{
		this.nombre="";
	}
	
	public String javaAJSON(Catalogo catalogo) 
	{
		
		JSONObject json=new JSONObject();
		
		Iterator it= catalogo.devolerIt();
		
		
		try {
			JSONArray catalogoJson_auriculares=new JSONArray();
			JSONArray catalogoJson_almacenamiento=new JSONArray();
			JSONArray catalogoJson_Computadora= new JSONArray();
			JSONArray catalogoJson_cooler=new JSONArray();
			JSONArray catalogoJson_coolerCPU= new JSONArray();
			JSONArray catalogoJson_Fuente=new JSONArray();
			JSONArray catalogoJson_Gabinete=new JSONArray();
			JSONArray catalogoJson_MemoriaRam=new JSONArray();
			JSONArray catalogoJson_Microfono=new JSONArray();
			JSONArray catalogoJson_Monitor=new JSONArray();
			JSONArray catalogoJson_MotherBoard=new JSONArray();
			JSONArray catalogoJson_Mouse=new JSONArray();
			JSONArray catalogoJson_Parlante=new JSONArray();
			JSONArray catalogoJson_PlacaDeVideo=new JSONArray();
			JSONArray catalogoJson_Procesador=new JSONArray();
			JSONArray catalogoJson_Teclado=new JSONArray();
			JSONArray catalogoJson_WebCam=new JSONArray();
			

			
			
			
			Producto auxProducto;


			while(it.hasNext()) 
			{
				JSONObject auxJson= new JSONObject();
				Map.Entry<String, Producto> entry = (Entry<String,Producto>) it.next();
				auxProducto=entry.getValue();
				auxJson=auxProducto.productoAJson();
				
				if(auxProducto instanceof Auriculares) {
					catalogoJson_auriculares.put(auxJson);
				}
				
				if(auxProducto instanceof Almacenamiento) 
				{
					catalogoJson_almacenamiento.put(auxJson);
				}
				
				if(auxProducto instanceof Computadora) 
				{
					catalogoJson_Computadora.put(auxJson);
				}
				
				if(auxProducto instanceof Cooler) 
				{
					catalogoJson_cooler.put(auxJson);
				}
				
				if(auxProducto instanceof CoolerCpu) 
				{
					catalogoJson_coolerCPU.put(auxJson);
				}
				if(auxProducto instanceof Fuente) 
				{
					catalogoJson_Fuente.put(auxJson);
				}
				
				if(auxProducto instanceof Gabinete) 
				{
					catalogoJson_Gabinete.put(auxJson);
				}
				
				if(auxProducto instanceof MemoriaRam) 
				{
					catalogoJson_MemoriaRam.put(auxJson);
				}
				
				if(auxProducto instanceof Microfono) 
				{
					catalogoJson_Microfono.put(auxJson);
				}
				
				if(auxProducto instanceof Monitor) 
				{
					catalogoJson_Monitor.put(auxJson);
				}
				
				if(auxProducto instanceof MotherBoard) 
				{
					catalogoJson_MotherBoard.put(auxJson);
				}
				
				if(auxProducto instanceof Mouse) 
				{
					catalogoJson_Mouse.put(auxJson);
				}
				
				if(auxProducto instanceof Parlante) 
				{
					catalogoJson_Parlante.put(auxJson);
				}
				
				if(auxProducto instanceof PlacaDeVideo) 
				{
					catalogoJson_PlacaDeVideo.put(auxJson);
				}
				
				if(auxProducto instanceof Procesador) 
				{
					catalogoJson_Procesador.put(auxJson);
				}
				
				if(auxProducto instanceof Teclado) 
				{
					catalogoJson_Teclado.put(auxJson);
				}
				
				if(auxProducto instanceof WebCam) 
				{
					catalogoJson_WebCam.put(auxJson);
				}
				
			}
			json.put("Catalogo_Auriculares",catalogoJson_auriculares);
			json.put("Catalogo_Almacenamiento",catalogoJson_almacenamiento);
			json.put("Catalogo_Computadora",catalogoJson_Computadora);
			json.put("Catalogo_Cooler",catalogoJson_cooler);
			json.put("Catalogo_CoolerCPU", catalogoJson_coolerCPU);
			json.put("Catalogo_Fuente",catalogoJson_Fuente);
			json.put("Catalogo_Gabinete",catalogoJson_Gabinete);
			json.put("Catalogo_MemoriaRam",catalogoJson_MemoriaRam);
			json.put("Catalogo_Microfono",catalogoJson_Microfono);
			json.put("Catalogo_Monitor",catalogoJson_Monitor);
			json.put("Catalogo_MotherBoard",catalogoJson_MotherBoard);
			json.put("Catalogo_Mouse",catalogoJson_Mouse);
			json.put("Catalogo_Parlante",catalogoJson_Parlante);
			json.put("Catalogo_PlacaDeVideo",catalogoJson_PlacaDeVideo);
			json.put("Catalogo_Procesador",catalogoJson_Procesador);
			json.put("Catalogo_Teclado",catalogoJson_Teclado);
			json.put("Catalogo_WebCam",catalogoJson_WebCam);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JsonUtiles.grabar(json);
		return json.toString();
	}
	
	public Catalogo JsonAJava(String archivoJSON) 
	{
		
		StringBuilder sb = new StringBuilder();
		Catalogo catalogo = new Catalogo();
		try {
			
			
			JSONObject jsonCatalogo = new JSONObject(archivoJSON);
			
			JSONArray array_Auriculares=jsonCatalogo.getJSONArray("Catalogo_Auriculares");
			JSONArray array_Almacenamiento=jsonCatalogo.getJSONArray("Catalogo_Almacenamiento");
			JSONArray array_Coolers=jsonCatalogo.getJSONArray("Catalogo_Cooler");
			JSONArray array_CoolerCPU=jsonCatalogo.getJSONArray("Catalogo_CoolerCPU");
			JSONArray array_Computadoras=jsonCatalogo.getJSONArray("Catalogo_Computadora");
			JSONArray array_Fuente=jsonCatalogo.getJSONArray("Catalogo_Fuente");
			JSONArray array_Gabinete=jsonCatalogo.getJSONArray("Catalogo_Gabinete");
			JSONArray array_MemoriaRam=jsonCatalogo.getJSONArray("Catalogo_MemoriaRam");
			JSONArray array_Microfono=jsonCatalogo.getJSONArray("Catalogo_Microfono");
			JSONArray array_Monitor=jsonCatalogo.getJSONArray("Catalogo_Monitor");
			JSONArray array_MotherBoard=jsonCatalogo.getJSONArray("Catalogo_MotherBoard");
			JSONArray array_Mouse=jsonCatalogo.getJSONArray("Catalogo_Mouse");
			JSONArray array_Parlante=jsonCatalogo.getJSONArray("Catalogo_Parlante");
			JSONArray array_PlacaDeVideo=jsonCatalogo.getJSONArray("Catalogo_PlacaDeVideo");
			JSONArray array_Procesador=jsonCatalogo.getJSONArray("Catalogo_Procesador");
			JSONArray array_Teclado=jsonCatalogo.getJSONArray("Catalogo_Teclado");
			JSONArray array_WebCam=jsonCatalogo.getJSONArray("Catalogo_WebCam");
			
			
			for(int i=0;i<array_Auriculares.length();i++) 
			{
				Auriculares aCargar= new Auriculares();
				JSONObject productoJson=array_Auriculares.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setMicrofono(productoJson.getBoolean("Microfono"));
				aCargar.setInalambrico(productoJson.getBoolean("Inalambrico"));
				aCargar.setLargoDelCable(productoJson.getInt("Largo cable"));
				catalogo.agregar(aCargar);
				
			}
			

			for(int i=0;i<array_Almacenamiento.length();i++) 
			{
				Almacenamiento aCargar= new Almacenamiento();
				JSONObject productoJson=array_Almacenamiento.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setCapacidad(productoJson.getInt("Capacidad"));                   
				aCargar.setTipoDeDisco(productoJson.getString("Tipo de disco"));
				
				catalogo.agregar(aCargar);
				
			}
			
			for(int i=0;i<array_Computadoras.length();i++) 
			{
				Computadora aCargar= new Computadora();
				JSONObject productoJson=array_Computadoras.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setTipoPc(productoJson.getString("TipoDePC"));
				aCargar.setDisco(productoJson.getString("disco"));
				aCargar.setRam(productoJson.getString("RAM"));
				aCargar.setCpu(productoJson.getString("CPU"));
				aCargar.setMother(productoJson.getString("Mother"));
				aCargar.setFuente(productoJson.getString("Fuente"));
				aCargar.setGabinete(productoJson.getString("Gabinete"));
				aCargar.setGpu(productoJson.getString("GPU"));
				aCargar.setCooler(productoJson.getString("Cooler"));
				
				catalogo.agregar(aCargar);
				
			}
			
			for(int i=0;i<array_Coolers.length();i++) 
			{
				Cooler aCargar= new Cooler();
				JSONObject productoJson=array_Coolers.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setTipo(productoJson.getString("Tipo"));                   
				aCargar.setConsumo(productoJson.getInt("Consumo"));
				
				catalogo.agregar(aCargar);
				
			}
			
			for(int i=0;i<array_CoolerCPU.length();i++) 
			{
				CoolerCpu aCargar= new CoolerCpu();
				JSONObject productoJson=array_CoolerCPU.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setTipo(productoJson.getString("Tipo"));                   
				aCargar.setConsumo(productoJson.getInt("Consumo"));
				aCargar.setTdp(productoJson.getInt("TDP"));
				aCargar.setTipoDeDisipacion(productoJson.getString("Tipo disipacion"));
				aCargar.setSocketCompatible(productoJson.getString("Socket"));

				catalogo.agregar(aCargar);
				
			}
			
			for(int i=0;i<array_Fuente.length();i++) 
			{
				Fuente aCargar= new Fuente();
				JSONObject productoJson=array_Fuente.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setWatts(productoJson.getInt("Watts"));
				aCargar.setFormato(productoJson.getString("Formato"));
				aCargar.setCertificacion(productoJson.getString("Certificacion"));
				aCargar.setModular(productoJson.getBoolean("Modular"));
				
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_Gabinete.length();i++) 
			{
				Gabinete aCargar= new Gabinete();
				JSONObject productoJson=array_Gabinete.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setFactorMother(productoJson.getString("Factor mother"));
				aCargar.setVentana(productoJson.getBoolean("Ventana"));
				aCargar.setCantidadDeSlotsParaCooler(productoJson.getInt("Slot Coolers"));
				aCargar.setUsbFrontal(productoJson.getInt("USBs frontales"));
				aCargar.setAlto(productoJson.getInt("Alto"));
				aCargar.setAncho(productoJson.getInt("Ancho"));
				aCargar.setProfundo(productoJson.getInt("Profundidad"));
				
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_MemoriaRam.length();i++) 
			{
				MemoriaRam aCargar= new MemoriaRam();
				JSONObject productoJson=array_MemoriaRam.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setCapacidad(productoJson.getInt("Capacidad"));
				aCargar.setFrecuencia(productoJson.getInt("Frecuencia"));
				aCargar.setTipo(productoJson.getString("Tipo"));
				aCargar.setCantidad(productoJson.getInt("Cantidad"));
				aCargar.setLatencia(productoJson.getString("Latencia"));
				aCargar.setVoltaje(productoJson.getInt("Voltaje"));
				aCargar.setDisipador(productoJson.getBoolean("Disipador"));
			
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_Microfono.length();i++) 
			{
				Microfono aCargar= new Microfono();
				JSONObject productoJson=array_Microfono.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setTipoDePie(productoJson.getString("Tipo de pie"));
				aCargar.setConexion(productoJson.getString("Conexion"));
			
			
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_Monitor.length();i++) 
			{
				Monitor aCargar= new Monitor();
				JSONObject productoJson=array_Monitor.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setTipoDePanel(productoJson.getString("Tipo de panel"));
				aCargar.setTipoDeFuente(productoJson.getString("Tipo de fuente"));
				aCargar.setCurvo(productoJson.getBoolean("Curvo"));
				aCargar.setConexion(productoJson.getString("Conexion"));
				aCargar.setPulgadas(productoJson.getInt("Pulgadas"));
				aCargar.setResolucion(productoJson.getString("Resolucion"));
				aCargar.setFrecuencia(productoJson.getString("Frecuencia"));
		
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_MotherBoard.length();i++) 
			{
				MotherBoard aCargar= new MotherBoard();
				JSONObject productoJson=array_MotherBoard.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setPlataforma(productoJson.getString("Plataforma"));
				aCargar.setSocket(productoJson.getString("Socket"));
				aCargar.setFactor(productoJson.getString("Factor"));
				aCargar.setCantidadDeSlotsDeMemoria(productoJson.getInt("Slot para memoria Ram"));
				aCargar.setPuertosSata(productoJson.getInt("Puertos sata"));
				aCargar.setSalidasDeVideo(productoJson.getString("Salidas de video"));
				aCargar.setCantidadDeSlotsM2(productoJson.getInt("Slots para ssd m2"));
				aCargar.setPuertosUSB(productoJson.getInt("Puertos USB"));
				
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_Mouse.length();i++) 
			{
				Mouse aCargar= new Mouse();
				JSONObject productoJson=array_Mouse.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setCantidadDeBotones(productoJson.getInt("Cantidad de botones"));
				aCargar.setSwitcH(productoJson.getString("Switch"));
				aCargar.setSensor(productoJson.getString("Sensor"));
				aCargar.setInalambrica(productoJson.getBoolean("Inalambrico"));
				aCargar.setDpiMax(productoJson.getInt("Dpi max"));

				catalogo.agregar(aCargar);
			}
			
			
			
			for(int i=0;i<array_Parlante.length();i++) 
			{
				Parlante aCargar= new Parlante();
				JSONObject productoJson=array_Parlante.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setPotencia(productoJson.getString("Potencia"));
				aCargar.setTipoDeConectores(productoJson.getString("Tipo de conectores"));
				aCargar.setAlimentacion(productoJson.getString("Alimentacion"));
				
				catalogo.agregar(aCargar);
			}
			
			
			for(int i=0;i<array_PlacaDeVideo.length();i++) 
			{
				PlacaDeVideo aCargar= new PlacaDeVideo();
				JSONObject productoJson=array_PlacaDeVideo.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setConectividad(productoJson.getString("Conectividad"));
				aCargar.setConsumo(productoJson.getInt("Consumo"));
				aCargar.setTipoDeMemoria(productoJson.getString("Tipo Memoria VRam"));
				aCargar.setCapacidadDeMemoria(productoJson.getInt("Capacidad memoria VRam"));
				aCargar.setIsbackPlate(productoJson.getBoolean("Backplate"));
				
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_Procesador.length();i++) 
			{
				Procesador aCargar= new Procesador();
				JSONObject productoJson=array_Procesador.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setSocket(productoJson.getString("Socket"));
				aCargar.setNucleos(productoJson.getInt("Nucleos"));
				aCargar.setHilos(productoJson.getInt("Hilos de proceso"));
				aCargar.setFrecuenciaTurbo(productoJson.getInt("Frecuencia turbo"));
				aCargar.setProcesoDeFabricacion(productoJson.getInt("Proceso de fabricacion"));
				aCargar.setTdp(productoJson.getInt("TDP"));
				aCargar.setCooler(productoJson.getBoolean("Cooler incluido"));
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_Teclado.length();i++) 
			{
				Teclado aCargar= new Teclado();
				JSONObject productoJson=array_Teclado.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setTipo(productoJson.getString("Tipo"));
				aCargar.setFormfactor(productoJson.getString("Form Factor"));
				aCargar.setSwitcH(productoJson.getString("Switches"));
				
				catalogo.agregar(aCargar);
			}
			
			for(int i=0;i<array_WebCam.length();i++) 
			{
				WebCam aCargar= new WebCam();
				JSONObject productoJson=array_WebCam.getJSONObject(i);
				
				aCargar.setCodigo(productoJson.getString("codigo"));
				aCargar.setMarca(productoJson.getString("marca"));
				aCargar.setModelo(productoJson.getString("modelo"));
				aCargar.setStock(productoJson.getInt("stock"));
				aCargar.setPrecio(productoJson.getDouble("precio"));
				aCargar.setPeso(productoJson.getDouble("peso"));
				aCargar.setPaisOrigen(productoJson.getString("paisOrigen"));
				aCargar.setRgb(productoJson.getBoolean("rgb"));
				aCargar.setColor(productoJson.getString("color"));
				aCargar.setDescripcion(productoJson.getString("descripcion"));
				aCargar.setResolucionMaximaDevideo(productoJson.getString("Resolucion Max"));
				aCargar.setTipoDeLente(productoJson.getString("Tipo de lente"));
				aCargar.setTipoDeResolucion(productoJson.getString("Tipo de resolucion"));
				aCargar.setMicrofono(productoJson.getBoolean("Microfono incluido"));
				
				catalogo.agregar(aCargar);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return catalogo;
	}
	
	
	
}
