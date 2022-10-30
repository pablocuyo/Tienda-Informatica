package test;

import Facturacion.Carrito;
import Facturacion.Factura;
import ProductosYServicios.*;
import clases.Cliente;
import clases.Taller;
import clases.Vendedor;
import colecciones.Catalogo;
import colecciones.Contenedora;
import colecciones.ContenedoraDeFacturas;
import excepciones.ContraseniaIncorrectaExcepcion;
import excepciones.DNIIncorrectoExcepcion;
import excepciones.NoHayStockExcepcion;
import manejoArchivo.ArchivoHerramientas;

import java.util.ArrayList;

public class TiendaInformatica<K> {
	private String nombre;
	private Catalogo catalogo;
	private Taller taller;
	private ArrayList<ItemServicio>services;
	private ContenedoraDeFacturas<K, Factura> facturas;
	private Contenedora<K,Cliente> listaDeClientes;
	private Contenedora<K,Vendedor> listaDeVendedores;
	private Carrito carroDeCompras;
	
	public TiendaInformatica(String nombre) {
		this.nombre=nombre;
		this.catalogo = new Catalogo();
		this.taller = new Taller();
		this.services=new ArrayList<>();
		this.facturas = new ContenedoraDeFacturas<>();
		this.listaDeClientes = new Contenedora<>();
		this.listaDeVendedores = new Contenedora<>();
		this.carroDeCompras = new Carrito();
	}
	
	
	public ContenedoraDeFacturas<K, Factura> getFacturas() {
		return facturas;
	}


	public void setFacturas(ContenedoraDeFacturas<K, Factura> facturas) {
		this.facturas = facturas;
	}


	public Contenedora<K, Cliente> getListaDeClientes() {
		return listaDeClientes;
	}


	public void setListaDeClientes(Contenedora<K, Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}


	public Contenedora<K, Vendedor> getListaDeVendedores() {
		return listaDeVendedores;
	}


	public void setListaDeVendedores(Contenedora<K, Vendedor> listaDeVendedores) {
		this.listaDeVendedores = listaDeVendedores;
	}


	
	public void cargarCatalogoAlaTienda(Catalogo catalogo) {
		
		this.catalogo=catalogo;
		
	}
	
	public void agregarService(ItemServicio nuevo){
		this.services.add(nuevo);
	}
	
	public String listarServices(){			//muestra los servicios disponibles en taller
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<services.size();i++){
			sb.append(services.get(i).toString());
		}return sb.toString();
	}
	
	
	//Metodo agregarProducto poliformico para los distintos productos del catalogo
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion, int capacidad
								,String tipoDeDisco) {
		Producto nuevo= new Almacenamiento(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,capacidad,tipoDeDisco);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion, boolean inalambrico , boolean microfono, int cable) {
		Producto nuevo= new Auriculares(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,inalambrico,microfono,cable);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String tipoPc, String disco, String ram,
			String cpu, String mother, String fuente, String gabinete, String gpu, String cooler) 
	{
		Producto nuevo =new Computadora(codigo,marca,modelo,stock,precio,peso,paisOrigen,rgb,color,descripcion,tipoPc,disco,ram,cpu,mother,fuente,gabinete,gpu,cooler);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipo, int consumo) {
		Producto nuevo= new Cooler(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipo, consumo);
		this.catalogo.agregar(nuevo);
	}

	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipo, int consumo, int tdp, String disipador, String socket) {
		Producto nuevo= new CoolerCpu(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipo, consumo, tdp, disipador, socket);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,int wts,String formato, String cerificacion, boolean modular) {
		Producto nuevo= new Fuente(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion, wts,formato,cerificacion, modular);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String factor, boolean ventana,int slotCooler,int usb,int alto, int ancho, int prof) {
		Producto nuevo= new Gabinete(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion, factor,ventana,slotCooler,usb, alto, ancho, prof );
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,int capac, int frecuencia, String tipo, int cantidad, String latencia, float voltaje, boolean disipador){
		Producto nuevo= new MemoriaRam(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion, capac, frecuencia,  tipo, cantidad,latencia, voltaje, disipador);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipoPie,String coneccion){
		Producto nuevo= new Microfono(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipoPie,coneccion);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipoPanel, boolean curvo, String coneccion,String tipoFuente, int pulgadas, String resolucion, String frecuencia){
		Producto nuevo= new Monitor(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipoPanel,curvo,coneccion,tipoFuente, pulgadas, resolucion, frecuencia);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String plataforma, String socket,
								String factor, int cantidadDeSlotsDeMemoria, int puertosSata, String salidasDeVideo, int cantidadDeSlotsM2,
								int puertosUSB) {
		Producto nuevo = new MotherBoard(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion, plataforma, socket,
				factor, cantidadDeSlotsDeMemoria,puertosSata, salidasDeVideo, cantidadDeSlotsM2, puertosUSB);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, int cantidadDeBotones, String switcH, String sensor,
			boolean isInalambrica, int dpiMax) {
		Producto nuevo = new Mouse (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,cantidadDeBotones,switcH,sensor,isInalambrica,dpiMax);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String potencia, String tipoDeConectores,
			String alimentacion) {
		Producto nuevo = new Parlante (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion, potencia,  tipoDeConectores, alimentacion);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String conectividad, int consumo,
			String tipoDeMemoria, int capacidadDeMemoria, boolean isbackPlate) {
		Producto nuevo = new PlacaDeVideo(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,conectividad,consumo, tipoDeMemoria,  capacidadDeMemoria,  isbackPlate);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String socket, int nucleos, int hilos,
			int frecuenciaTurbo, int procesoDeFabricacion, int tdp, boolean isCooler) {
		Producto nuevo = new Procesador (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,socket,nucleos,hilos, frecuenciaTurbo, procesoDeFabricacion, tdp, isCooler);
		this.catalogo.agregar(nuevo);
	}

	public void agregarTeclado(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipo, String formfactor, String switcH) {
		Producto nuevo = new Teclado(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,tipo,formfactor,switcH);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String resolucionMaximaDevideo, String tipoDeLente,
			String tipoDeResolucion, boolean isMicrofono) {
		Producto nuevo = new WebCam(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,resolucionMaximaDevideo,tipoDeLente,tipoDeResolucion,isMicrofono);
		this.catalogo.agregar(nuevo);
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void borrarProducto(String aBorrar){ //borra producto del catalogo por codigo
		catalogo.eliminar(aBorrar);
	}
	public String buscarProducto(String codigo){ //busca producto del catalogo por codigo
		return catalogo.buscar(codigo);
	}
	public Producto productoAcarrito(String codigo){ //retorna producto del catalogo se utiliza para el carrito en el menu
		
		return catalogo.retornarProducto(codigo);
	}
	public boolean checkProducto(String codigo){ //mira si existe un producto
		return catalogo.getMapaCatalogo().containsKey(codigo);
	}
	
	public void actualizarPrecioProducto(String codigo,double precio) //actualiza el precio de un producto del catalogo
	{
		Producto aux=catalogo.retornarProducto(codigo);
		aux.setPrecio(precio);
	}
	
	public int aumentarStockDeProducto(String codigo,int cantidad) //aumenta el stock de un producto del catalogo
	{
		
		Producto aux=catalogo.retornarProducto(codigo);
		aux.aumentarStock(cantidad);
		
		return aux.getStock();
	}
	
	public int reducirStockDeProducto(String codigo,int cantidad) throws NoHayStockExcepcion //recude el stock de un producto del catalogo si el valor ingresado es mayor al stock eleva una excepcion
	{
		
		Producto aux=catalogo.retornarProducto(codigo);
		aux.reducirStock(cantidad);
		
		return aux.getStock();
	}
	
	//MUESTRA DE DISTINTOS PRODUCTOS DEL CATALOGO
	public String mostrarAlmacenamiento(){
		return catalogo.listarAlmacenamiento();
	}
	public String mostrarAuriculares(){
		return catalogo.listarAuriculares();
	}
	
	public String mostrarComputadora() 
	{
		return catalogo.listarComputadoras();
	}
	public String mostrarCooler(){
		return catalogo.listarCoolers();
	}
	public String mostrarFuentes(){
		return catalogo.listarFuentes();
	}
	public String mostrarGabinetes(){
		return catalogo.listarGabinetes();
	}
	public String mostrarMemorias(){
		return catalogo.listarMemorias();
	}
	public String mostrarMicrofonos() {
		return catalogo.listarMicrofonos();
	}
	public String mostrarMonitores(){
		return catalogo.listarMonitores();
	}
	public String mostrarMothers(){
		return catalogo.listarMotherboards();
	}
	public String mostrarMouses(){
		return catalogo.listarMouses();
	}
	public String mostrarParlantes(){
		return catalogo.listarParlantes();
	}
	public String mostrarPlacas(){
		return catalogo.listarPlacas();
	}
	public String mostrarProcesadores(){
		return catalogo.listarProcesadores();
	}
	public String mostrarTeclados(){
		return catalogo.listarTeclados();
	}
	public String mostrarWebcams(){
		return catalogo.listarWebcams();
	}
	public String mostrarTodo(){
		return catalogo.listar();
	}
	
	public void agregarAlCarrito(Producto nuevo, int cant){ //recibe un producto y la cantidad y lo agrega al carrito
		ItemPedido nuevoItem=new ItemPedido(nuevo, cant);
		this.carroDeCompras.agregar(nuevoItem);
	}

	public void agregarServiceAlCarrito(int opcion){//agrega un serivicio al carrito que posteriormente puede ser agregado al taller
		if(opcion>0 && opcion<=services.size()){
			this.carroDeCompras.agregar(services.get(opcion-1));
		}

	}
	public String listarCarrito(){ //muestra al carrito
		return this.carroDeCompras.mostrarCarrito();
	}
	public int tamanioDeCarro() //retorna el tamanio del carrito
	{
		return carroDeCompras.tamanioCarrito();
	}
	public Factura ticket(Cliente comprador,Carrito aFacturar,Vendedor vendedor){ //GENERA FACTURA,AUMENTA LAS VENTAS DE EL VENDEDOR,SE GUARDA EN CLIENTE,
																				 //GENERA UNA SERVICIO EN EL TALLER Y SE GUARDA EN LA CONTENEDORA DE FACTURAS.
		Factura nueva= new Factura(comprador,aFacturar,vendedor.getApellido()+vendedor.getNombre());
		vendedor.sumarVenta(carroDeCompras.calcularPrecioTotal());
		comprador.agregarFacturaCliente(nueva);
		generarServicio(comprador);
		agregarFactura(nueva);
		
		return nueva;
	}

	public void generarServicio(Cliente comprador) //SE INVOCA EN TICKET.AGREGA A LA COLA DE TALLER
	{
		for(int i=0;i<carroDeCompras.getMisServicios().size();i++) {
			ServicioTaller nuevo = new ServicioTaller(carroDeCompras.getMisServicios().get(i).getDescripcion(),comprador);
			taller.agregar(nuevo);
		}
	}
	
	
	public void agregarFactura(Factura nueva) //AGREGA A LA CONTENEDORA DE FACTURAS DE LA TIENDA
	{
		Integer aux=nueva.getId();
		facturas.agregarObjetoColeccion((K)aux, nueva);
	}
	
	public String buscarFactura(int id) //RETORNA UN STRING CON UNA FACTURA A BUSCAR POR ID
	{
		Integer aux= id;
		String facturaAux = facturas.mostrarElementoDeLaColeccion((K)aux);
		return facturaAux;
	}
	
	public String mostrarFacturasDeCliente(String dni) //MUESTRA LAS FACTURAS DE UN CLIENTE POR DNI
	{
		Cliente aux;
		aux=listaDeClientes.devolverPersona((K)dni);
		
		return aux.listarCompras();
	}
	public Carrito getCarroDeCompras() {
		return carroDeCompras;
	}
	
	public void pasarTiendaAArchivo() //PASA LOS ATRIBUTOS DE LA TIENDA QUE NOS INTERESAN QUE PERDUREN A UN ARCHIVO
	{
		ArchivoHerramientas archivo= new ArchivoHerramientas<>();
		archivo.guardarClienteEnArchivo(listaDeClientes);
		archivo.guardarVendedorEnArchivo(listaDeVendedores);
		archivo.guardarFacturasEnArchivo(facturas);
		archivo.guardarTallerEnArchivo(taller);
		archivo.guardarServicesEnArchivo(services);
	}
	
	public void archivoATiendaInformatica() //CARGA EN LA TIENDA LAS DISTINTAS COLECCIONES DESDE UN ARCHIVO
	{
		ArchivoHerramientas archivo= new ArchivoHerramientas<>();
		listaDeClientes=archivo.cargarClientesDesdeArchivo();
		listaDeVendedores=archivo.cargarVendedoresDesdeArchivo();
		facturas=archivo.cargarFacturasDesdeArchivo();
		taller=archivo.cargarTallerDesdeArchivo();
		services=archivo.cargarServicesDesdeArchivo();
	}
	public void agregarCliente(String nombre,String apellido,String dni,String telefono,String direccion,String correo){//AGREGA UN CLIENTE A LA CONTENEDORA DE CLIENTES
		Cliente nuevo= new Cliente(nombre, apellido,dni,telefono,direccion,correo);
		if(!listaDeClientes.existe((K)dni)) {
			listaDeClientes.agregarObjetoColeccion((K) dni, nuevo);
		}
	}
	
	public String listarClientes(){ //MUESTRA LOS CLIENTES
		return listaDeClientes.listar();
	}
	public String buscarCliente(String id){ //BUSCA UN CLIENTE POR DNI Y RETORNA UN STRING
		return listaDeClientes.mostrarElementoDeLaColeccion((K)id);
	}
	
	public Cliente retornarCliente(String id){//RETORNA UN CLIENTE POR DNI

		return listaDeClientes.devolverPersona((K)id);
	}
	
	public void editarCliente(String id,String dato,int opcion){//EDITA UN CLIENTE (DIRECCION,CORREO,TELEFONO)
		if(opcion>0 && opcion<4){
			listaDeClientes.devolverPersona((K)id).editarPersona(dato, opcion);
		}
			
	}
	
	public boolean existeCliente(K clave) //VERIFICA QUE EXISTA UN CLIENTE POR CLAVE
	{
		return listaDeClientes.existe(clave);
	}
	
	public void agregarVendedor(String nombre,String apellido,String dni,String telefono,String direccion,String correo,String contrasenia) //AGREGA UN VENDEDOR A LA CONTENEDORA DE VENDEDORES
	{
		Vendedor nuevo= new Vendedor(nombre, apellido,dni,telefono,direccion,correo,contrasenia);
		if(!listaDeVendedores.existe((K)dni)) {
			listaDeVendedores.agregarObjetoColeccion((K) dni, nuevo);
		}
	}
	
	public String listarVendedores() //MUESTRA LOS VENDEDORES
	{
		return listaDeVendedores.listar();
	}
	
	public String buscarVendedor(String id){ //BUSCA UN VENDEDOR POR DNI
		return listaDeVendedores.mostrarElementoDeLaColeccion((K)id);
	}
	
	public Vendedor retornarVendedor(String id) //DEVUELVE UN VENDEDOR POR DNI
	{
		return listaDeVendedores.devolverPersona((K) id);
	}

	public void editarVendedor(String id,String dato,int opcion){ //EDITA UN VENDEDOR 
		if(opcion>0 && opcion<4){
			listaDeVendedores.devolverPersona((K)id).editarPersona(dato, opcion);
		}
			
	}
	
	public void removerVendedor(String id) //ELIMINA UN VENDEDOR DE LA CONTENEDORA DE VENDEDORES
	{
		listaDeVendedores.eliminarObjDeLaColeccion((K) id);
	}
	
	public boolean comprobarLoginVendedor(String dni, String contrasenia) throws ContraseniaIncorrectaExcepcion, DNIIncorrectoExcepcion //METODO PARA INGRESAR AL MENU DEL PROGRAMA, 
																																		//	SI LA CONTRASENIA O EL DNI INGRESADO SON INCORRECTOS LANZA UNA EXCEPCION
	{
		boolean correcto=false;
		if(listaDeVendedores.existe((K)dni)) {
			Vendedor aux= listaDeVendedores.devolverPersona((K) dni);
			if(((aux.comprobarDNI(dni))==true && aux.comprobarContrasenia(contrasenia))==true) 
			{
				correcto=true;
			}
		}
		else 
		{
			throw new DNIIncorrectoExcepcion("NO EXISTE ESTE DNI");
		}
		
		return correcto;
	}
	
	public String listarTaller() //MUESTRA LOS SERVICIOS DEL TALLER
	{
		return taller.mostrar();
	}
	
	public void conformarServicio() //CONFORMA UN SERVICIO ES DECIR LO REMUEVE DEL TALLER
	{
		taller.remover();
	}
	
	public String listarFacturas() //LISTA LAS FACTURAS DE LA TIENDA
	{
		return facturas.listar();
	}
	
	public void restablecerStock(){ //METODO UTILIZADO EN CASO DE QUERER NO VENDER LOS ELEMENTOS DEL CARRITO, REINTEGRA EL STOCK DE LOS PRODUCTOS AL CATALOGO
		carroDeCompras.limpiarCarro();
	}
}
