package test;

import Facturacion.Factura;
import ProductosYServicios.Producto;
import clases.Cliente;
import clases.Vendedor;
import excepciones.ContraseniaIncorrectaExcepcion;
import excepciones.DNIIncorrectoExcepcion;
import excepciones.NoHayStockExcepcion;
import jsonHerramientas.JsonUtiles;
import jsonHerramientas.StreamJSON;

import java.util.Scanner;

public class Menu {

	
	private String nombre;
	public Menu(String nombre) {
		this.nombre=nombre;
	}
	TiendaInformatica miTienda= new TiendaInformatica<>(nombre);

    
	public void opciones(){
		
		
		miTienda.archivoATiendaInformatica();
		int cantF=miTienda.getFacturas().tamanio();
		Factura auxF=new Factura();
		auxF.setCantF(cantF);


		String fuente= JsonUtiles.leer();
		if(fuente.isEmpty()){
			System.out.println("Este archivo no contiene nada\n\n");
		}
		StreamJSON aux= new StreamJSON();
		miTienda.setCatalogo(aux.JsonAJava(fuente));
		
		int opcion,opcionCatalogo;

		Scanner teclado = new Scanner(System.in);
		miTienda.getCatalogo();
		StreamJSON nuevoJSON = new StreamJSON();
		String dniLogin="";
		
		boolean accedido=false;
		int intentos=0;
		
		System.out.println("BIENVENIDO A TIENDA INFORMATICA\n\n\n");
		
		do {
			System.out.println("\nIngrese su dni para ingresar: ");
			dniLogin = teclado.nextLine();
			System.out.println("\nIngrese contraseña: \n");
			String contraseñaLogin = teclado.nextLine();
			try {
				if (miTienda.comprobarLoginVendedor(dniLogin, contraseñaLogin) == true) {
					accedido = true;
				}
			} catch (ContraseniaIncorrectaExcepcion e1) {
				System.out.println(e1.getMessage());
			} catch (DNIIncorrectoExcepcion e1) {
				System.out.println(e1.getMessage());
			}
			intentos++;
		}while(intentos<3 && accedido==false);
		if(accedido) {
			Vendedor vendedorActivo=miTienda.retornarVendedor(dniLogin);
		do {
			System.out.println("\nMenu Principal.\nDiginte la opcion deseada o 9 para salir\n");
			System.out.println("\n1.Catalogo.");
			System.out.println("\n2.Ventas.");
			System.out.println("\n3.Taller.");
			System.out.println("\n4.Clientes.");
			System.out.println("\n5.Administrador.");
			System.out.println("\n\n6.SALIR");
			int cont = 1;
			opcion = teclado.nextInt();

				switch (opcion) {
					case 1:
						do{
							System.out.println("\nMenu Catalogo \nDigite la opcion:");
							System.out.println("\n1.agregar producto");
							System.out.println("\n2.quitar producto");
							System.out.println("\n3.Listar Productos");
							System.out.println("\n4.Consultar Producto");
							System.out.println("\n5.Actualizar producto");
							int menuCatalogo = teclado.nextInt();
							switch (menuCatalogo) {
								case 1:
									
									System.out.println("\nCategoria:");
									System.out.println("\n1.Almacenamiento");
									System.out.println("\n2.Auriculares.");
									System.out.println("\n3.Computadora:");
									System.out.println("\n4.Cooler:");
									System.out.println("\n5.CoolerCPU:");
									System.out.println("\n6.Fuente:");
									System.out.println("\n7.Gabinete:");
									System.out.println("\n8.Memoria RAM:");
									System.out.println("\n9.Microfono:");
									System.out.println("\n10.Monitor:");
									System.out.println("\n11.MotherBoard:");
									System.out.println("\n12.Mouse:");
									System.out.println("\n13.Parlante:");
									System.out.println("\n14.Placa de video:");
									System.out.println("\n15.Procesador:");
									System.out.println("\n16.Teclado:");
									System.out.println("\n17.Webcam:");
									System.out.println("\n0 para salir.");
									opcionCatalogo= teclado.nextInt();

									if(opcionCatalogo!=0) {
										System.out.println("Ingrese codigo: ");
										teclado.nextLine();
										String codigo2 = teclado.nextLine();


										System.out.println("Ingrese marca: ");

										String marca = teclado.nextLine();

										System.out.println("Ingrese modelo: ");

										String modelo = teclado.nextLine();

										System.out.println("Ingrese stock: ");
										int stock = teclado.nextInt();

										System.out.println("Ingrese precio: ");
										double precio = teclado.nextDouble();

										System.out.println("Ingrese peso(Grs): ");
										double peso = teclado.nextDouble();

										System.out.println("Ingrese pais de origen: ");
										teclado.nextLine();

										String paisOrigen = teclado.nextLine();

										System.out.println("Ingrese 1 si es RGB: ");
										int rgb = teclado.nextInt();
										boolean isRgb = false;
										if (rgb == 1) {
											isRgb = true;
										}

										System.out.println("Ingrese color: ");
										teclado.nextLine();
										String color = teclado.nextLine();

										System.out.println("Ingrese descripcion: ");

										String descripcion = teclado.nextLine();


									switch(opcionCatalogo) {
									 
									case 1:
										System.out.println("\nALMACENAMIENTO\n");
										System.out.println("Ingrese tipo de disco: ");
										String tipoDeDisco= teclado.nextLine();
										
										System.out.println("Ingrese capacidad del disco(MBs): ");
										int capacidad=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, capacidad, tipoDeDisco);
										
										break;
										
									case 2: 
										System.out.println("\nAURICULARES\n");
										System.out.println("Ingrese 1 si es inalambrico: ");
										int inalambrico= teclado.nextInt();
										boolean isInalambrico=false;
										
										if(inalambrico==1) {
											isInalambrico=true;
										}
										
										System.out.println("Ingrese 1 si tiene mircrofono: ");
										int tieneMiCrofono= teclado.nextInt();
										boolean isMicrofono=false;
										
										if(tieneMiCrofono==1) {
											isMicrofono=true;
										}
										
										System.out.println("Ingrese el largo del cable: ");
										int largoDelCable= teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,isInalambrico,isMicrofono,largoDelCable);
										break;
									
									case 3:

										System.out.println("Ingrese tipo de PC(Notebooke,AIO,Escritorio):");
										String tipoPc=teclado.nextLine();
										
										System.out.println("\nIngrese motherboard");
										String mother = teclado.nextLine();
								
										System.out.println("\nIngrese Procesador");
										String procesador = teclado.nextLine();
									
										
										System.out.println("\nIngrese memoria Ram");
										String memoriaR = teclado.nextLine();
										
										System.out.println("\nIngrese Fuente");
										String fuenteC = teclado.nextLine();
								
										System.out.println("\nIngrese Gabinete");
										String gabinete = teclado.nextLine();
										
										System.out.println("\nIngrese Almacenamiento");
										String almacenamiento = teclado.nextLine();
										
								
										System.out.println("\nIngrese Cooler");
										String cooler = teclado.nextLine();
	
										System.out.println("\nIngrese GPU");
										String GPU = teclado.nextLine();

									
										miTienda.agregarProducto(codigo2,marca,modelo,stock,precio,peso,paisOrigen,isRgb,color,descripcion,tipoPc,almacenamiento,memoriaR,procesador,mother,fuenteC,gabinete,GPU,cooler);
									
										break;
									case 4: 
										System.out.println("\nCOOLER DE GABINETE\n");
										String tipo="Gabinete";
										
										System.out.println("Ingrese el consumo: ");
										int consumo=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,tipo,consumo);							
										break;
									
									case 5: 
										System.out.println("\nCOOLER DE CPU\n");
										String tipoCPU="CPU";
										
										System.out.println("Ingrese el consumo: ");
										int consumoCPU=teclado.nextInt();
										
										System.out.println("Ingrese el TDP: ");
										int tdp=teclado.nextInt();
										
										System.out.println("Ingrese el tipo de disipacion: ");
										teclado.nextLine();
										String tDisipacion= teclado.nextLine();
										
										System.out.println("Ingrese socket compatible: ");
										String socketC=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tipoCPU, consumoCPU,tdp,tDisipacion,socketC);
										break;
									
									case 6: 
										System.out.println("\nFUENTE\n");
										System.out.println("Ingrese los watts de consumo: ");
										int watts=teclado.nextInt();
										
										System.out.println("Ingrese el formato: ");
										teclado.nextLine();
										String formato=teclado.nextLine();
										
										System.out.println("Ingrese la certificacion: ");
										String certificacion=teclado.nextLine();
										
										System.out.println("Ingrese 1 si es modular: ");
										int modular= teclado.nextInt();
										boolean isModular=false;
										
										if(modular==1) {
											isModular=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,watts,formato,certificacion,isModular);
										break;
									
									case 7: 
										System.out.println("\nGABINETE\n");
										System.out.println("Ingrese el factor mother: ");
										String factorM=teclado.nextLine();
										
										System.out.println("Ingrese 1 si tiene ventana: ");
										int ventana= teclado.nextInt();
										boolean isVentana=false;
										
										if(ventana==1) {
											isVentana=true;
										}
										
										System.out.println("Ingrese la cantidad de slots para cooler: ");
										int slotsCooler= teclado.nextInt();
										
										System.out.println("Ingrese la cantidad de USB frontales: ");
										int usbFrontal= teclado.nextInt();
										
										System.out.println("Ingrese el alto(cms):");
										int alto= teclado.nextInt();
										
										System.out.println("Ingrese el ancho(cms):");
										int ancho= teclado.nextInt();
										
										System.out.println("Ingrese el profundo(cms):");
										int profundo= teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,factorM,isVentana,slotsCooler,usbFrontal,alto,ancho,profundo);
								
										break;
									
									case 8: 
										System.out.println("\nMEMORIA RAM\n");
										System.out.println("Ingrese GBs de capacidad: ");
										int capacidadRam= teclado.nextInt();
										
										System.out.println("Ingrese la frecuencia(MHZ): ");
										int frecuencia= teclado.nextInt();
										
										System.out.println("Ingrese Gen(DDR): ");
										teclado.nextLine();
										String tipoRam=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de tarjetas: ");
										int cantidadRam= teclado.nextInt();
										
										System.out.println("Ingrese la latencia: ");
										teclado.nextLine();
										String latencia=teclado.nextLine();
										
										System.out.println("Ingrese el voltaje: ");
										float voltaje= teclado.nextFloat();
										
										System.out.println("Ingrese 1 si tiene disipador: ");
										int disipador= teclado.nextInt();
										
										boolean isDisipador=false;
										
										if(disipador==1) {
											isDisipador=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, capacidadRam,frecuencia,tipoRam,cantidadRam,latencia,voltaje,isDisipador);
										break;
									
									case 9: 
										System.out.println("\nMICROFONO\n");
										
										System.out.println("Ingrese el tipo de pie:");
										String tipoDePie=teclado.nextLine();
										
										System.out.println("Ingrese la conexion: ");
										String conexion=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tipoDePie, conexion);
										break;
									
									case 10: 
										System.out.println("\nMONITOR\n");
										System.out.println("Ingrese el tipo de panel");
										String tipoDePanel=teclado.nextLine();
										
										System.out.println("Ingrese 1 si es curvo: ");
										int curvo= teclado.nextInt();
										boolean isCurvo=false;
										
										if(curvo==1) {
											isCurvo=true;
										}
										
										System.out.println("Ingrese conexion: ");
										teclado.nextLine();
										String conexionMonitor=teclado.nextLine();
										
										System.out.println("Ingrese tipo de fuente: ");
										String tipoDeFuente=teclado.nextLine();
										
										System.out.println("Ingrese las pulgadas: ");
										int pulgadas=teclado.nextInt();
										
										System.out.println("ingrese resolucion: ");
										teclado.nextLine();
										String resolucion=teclado.nextLine();
										
										System.out.println("ingrese frecuencia: ");
										String frecuenciaMonitor=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tipoDePanel, isCurvo,conexionMonitor,tipoDeFuente,pulgadas,resolucion,frecuenciaMonitor);
										break;
									
									case 11: 
										System.out.println("\nMOTHERBOARD\n");
										System.out.println("Ingrese Plataforma: ");
										String plataforma=teclado.nextLine();
										
										System.out.println("Ingrese socket: ");
										String socket=teclado.nextLine();
										
										System.out.println("Ingrese factor: ");
										String factor=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de slots para memoria Ram: ");
										int canSlotsM=teclado.nextInt();
										
										System.out.println("Ingrese cantidad de puertos sata: ");
										int puertosSata=teclado.nextInt();
										
										System.out.println("Ingrese salidas de video: ");
										teclado.nextLine();
										String salidaDeVideo=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de slots M2: ");
										int cantidadDeSlotsM2=teclado.nextInt();
										
										System.out.println("Ingrese cantidad de puertos USB: ");
										int puertosUSB=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,plataforma,socket,factor,canSlotsM,puertosSata,salidaDeVideo,cantidadDeSlotsM2,puertosUSB);
										break;
									
									case 12: 
										System.out.println("\nMOUSE\n");
										System.out.println("Ingrese cantidad de botones: ");
										int cantidadDeBotones=teclado.nextInt(); 
										
										System.out.println("Ingrese el tipo de switch: ");
										teclado.nextLine();
										String switchM=teclado.nextLine();
										
										System.out.println("Ingrese el tipo de sensor: ");
										String sensor=teclado.nextLine();
										
										System.out.println("Ingrese 1 si es inalambrico: ");
										int inalambricoMouse= teclado.nextInt();
										boolean isInalambricoMouse=false;
										if(inalambricoMouse==1) {
											isInalambricoMouse=true;
										}
										
										System.out.println("Ingrese los dpi maximos: ");
										int dpiMaximos=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, cantidadDeBotones, switchM,sensor,isInalambricoMouse,dpiMaximos);
										break;
									
									case 13: 
										System.out.println("\nPARLANTES\n");
										System.out.println("Ingrese la potencia: ");
										String potencia=teclado.nextLine();
										
										System.out.println("Ingrese los tipos de conectores: ");
										String conectores=teclado.nextLine();
										
										System.out.println("Ingrese el tipo de alimentacion: ");
										String alimentacion=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, potencia, conectores,alimentacion);
										break;
									
									case 14: 
										System.out.println("\nPLACA DE VIDEO\n");
										System.out.println("Ingrese tipo de conectividad: ");
										String conectividad=teclado.nextLine();
										
										System.out.println("Ingrese consumo(Wts): ");
										int consumoVideo=teclado.nextInt();
										
										System.out.println("Ingrese tipo de memoria(Gen): ");
										teclado.nextLine();
										String tipoDeMemoria=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de memoria VRAM(GBs): ");
										int capMemoria= teclado.nextInt();
										
										System.out.println("Ingrese 1 si posee backPlate: ");
										int backPlate= teclado.nextInt();
										boolean isBackPlate=false;
										if(backPlate==1) {
											isBackPlate=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, conectividad, consumoVideo,tipoDeMemoria,capMemoria,isBackPlate);
										break;
									
									case 15: 
										System.out.println("\nPROCESADOR\n");
										System.out.println("Ingrese el tipo de socket: ");
										String socketP=teclado.nextLine();
										
										System.out.println("Ingrese la cantidad de nucleos: ");
										int nucleos= teclado.nextInt();
										
										System.out.println("Ingrese la cantidad de hilos: ");
										int hilos= teclado.nextInt();
										
										System.out.println("Ingrese la frecuencia turbo(MHZ): ");
										int frecuenciaTurbo= teclado.nextInt();
										
										System.out.println("Ingrese proceso de fabricacion(numero nm): ");
										int procesoDeFabricacion= teclado.nextInt();
										
										System.out.println("Ingrese TDP: ");
										int tdpProcesador= teclado.nextInt();
										
										System.out.println("Ingrese 1 si tiene cooler: ");
										int coolerP= teclado.nextInt();
										boolean isCooler=false;
										if(coolerP==1) {
											isCooler=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, socketP, nucleos,hilos,frecuenciaTurbo,procesoDeFabricacion,tdpProcesador,isCooler);
										break;
									
									case 16: 
										System.out.println("\nTECLADOS\n");
										System.out.println("Ingrese Tipo de teclado: ");
										String tecladoProducto=teclado.nextLine();
										
										System.out.println("Ingrese formFactor: ");
										String formfactor=teclado.nextLine();
										
										System.out.println("Ingrese tipo de switch: ");
										String switcH=teclado.nextLine();
										
										miTienda.agregarTeclado(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tecladoProducto, formfactor,switcH);
										break;
									
									case 17: 
										System.out.println("\nWEBCAMS\n");
										System.out.println("Ingrese resolucion de video: ");
										String resolucionCam=teclado.nextLine();
										
										System.out.println("Ingrese tipo de lente: ");
										String tipoDeLente=teclado.nextLine();
										
										System.out.println("Ingrese tipo de resolucion: ");
										String tipoDeResolucion=teclado.nextLine();
										
										System.out.println("Ingrese 1 si tiene microfono: ");
										int microfono= teclado.nextInt();
										
										boolean isMicrofonoCam=false;
										if(microfono==1) {
											isMicrofonoCam=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, resolucionCam, tipoDeLente,tipoDeResolucion,isMicrofonoCam);

										break;

									}
									}

									break;
								case 2:
									//quitar producto
									System.out.println("\nDigite el codigo de producto:\n");
									teclado.nextLine();
									String aBorrar= teclado.nextLine();
									miTienda.borrarProducto(aBorrar);
									break;
								case 3:
									//Listar Productos
									System.out.println("\n1.Almacenamiento.");
									System.out.println("\n2.Auriculares.");
									System.out.println("\n3.Computadora:");
									System.out.println("\n4.Coolers:");
									System.out.println("\n5.Fuente:");
									System.out.println("\n6.Gabinete:");
									System.out.println("\n7.MemoriaRAM:");
									System.out.println("\n8.Microfono:");
									System.out.println("\n9.Monitor.");
									System.out.println("\n10.MotherBoard:");
									System.out.println("\n11.Mouse:");
									System.out.println("\n12.Parlante:");
									System.out.println("\n13.Placa de video:");
									System.out.println("\n14.Procesador:");
									System.out.println("\n15.Teclado:");
									System.out.println("\n16.Webcam:");
									System.out.println("\n17.Todos.");
									System.out.println("\n0 para salir.");

									int opcionListar;
									opcionListar=teclado.nextInt();

									switch(opcionListar) {

										case 1:
											System.out.println(miTienda.mostrarAlmacenamiento());
											break;
										case 2:
											System.out.println(miTienda.mostrarAuriculares());

											break;
										case 3:
											System.out.println(miTienda.mostrarComputadora());
											break;
										case 4:
											System.out.println(miTienda.mostrarCooler());
											break;
										case 5:
											System.out.println(miTienda.mostrarFuentes());
											break;
										case 6:
											System.out.println(miTienda.mostrarGabinetes());
											break;
										case 7:
											System.out.println(miTienda.mostrarMemorias());
											break;
										case 8:
											System.out.println(miTienda.mostrarMicrofonos());
											break;
										case 9:
											System.out.println(miTienda.mostrarMonitores());
											break;
										case 10:
											System.out.println(miTienda.mostrarMothers());
											break;
										case 11:
											System.out.println(miTienda.mostrarMouses());
											break;
										case 12:
											System.out.println(miTienda.mostrarParlantes());
											break;
										case 13:
											System.out.println(miTienda.mostrarPlacas());
											break;
										case 14:
											System.out.println(miTienda.mostrarProcesadores());
											break;
										case 15:
											System.out.println(miTienda.mostrarTeclados());
											break;
										case 16:
											System.out.println(miTienda.mostrarWebcams());
											break;
										case 17:
											System.out.println(miTienda.mostrarTodo());
											break;
									}
									break;
									case 4:
									//Consultar Producto
									System.out.println("\nDigite el codigo de producto:\n");
									teclado.nextLine();
									String aMostrar= teclado.nextLine();
									System.out.println(miTienda.buscarProducto(aMostrar));
									break;
									
									case 5:
										System.out.println("\nIngrese el codigo del producto: ");
										teclado.nextLine();
										String codigoMP=teclado.nextLine();
										int stock=0;
										if(miTienda.checkProducto(codigoMP)) {
											
											System.out.println("1.Modificar precio. \n2.Aumentar stock de producto. \n3.Reducir stock. ");
											int opModificarProducto=teclado.nextInt();
											
											switch(opModificarProducto) 
											{
											case 1:
												System.out.println("\nIngrese nuevo precio: ");
												double nuevoPrecio=teclado.nextDouble();
												miTienda.actualizarPrecioProducto(codigoMP,nuevoPrecio);
												break;
											case 2:
												System.out.println("Ingrese cantidad a agregar: ");
												stock= teclado.nextInt();
												System.out.println("Se actualizo el stock a: "+miTienda.aumentarStockDeProducto(codigoMP,stock));
												break;
											case 3:
												System.out.println("Ingrese cantidad a reducir: ");
												stock=teclado.nextInt();
												try {
													System.out.println("Se actualizo el stock a: "+miTienda.reducirStockDeProducto(codigoMP,stock));
												} catch (NoHayStockExcepcion e) {
													// TODO Auto-generated catch block
													System.out.println(e.getMessage()); 
												}
												break;
											
											}
										}
										break;
							}
							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont == 1);
						break;
					case 2:
						//MENU DE VENTAS
						System.out.println("1.Agregar productos al carrito");
						System.out.println("2.Agregar Servicio al carrito");
						System.out.println("3.Ver carrito");
						System.out.println("4.Proceder a checkout");
						System.out.println("0.SALIR");
						int opcionVentas= teclado.nextInt();
						int ventas=1;
						do{
					
							switch (opcionVentas){
								case 1:
									System.out.println("\nCargar productos en el carrito.");
									int opcionCargar;
									System.out.println("\n1.Almacenamiento.");
									System.out.println("\n2.Auriculares.");
									System.out.println("\n3.Computadora:");
									System.out.println("\n4.Coolers:");
									System.out.println("\n5.Fuente:");
									System.out.println("\n6.Gabinete:");
									System.out.println("\n7.MemoriaRAM:");
									System.out.println("\n8.Microfono:");
									System.out.println("\n9.Monitor.");
									System.out.println("\n10.MotherBoard:");
									System.out.println("\n11.Mouse:");
									System.out.println("\n12.Parlante:");
									System.out.println("\n13.Placa de video:");
									System.out.println("\n14.Procesador:");
									System.out.println("\n15.Teclado:");
									System.out.println("\n16.Webcam:");
									System.out.println("\n17.Todos.");
									System.out.println("\n0 para salir.");
									System.out.println("\nDigite la opcion deseada:");
									opcionCargar= teclado.nextInt();
									switch(opcionCargar) {
										case 1:
											System.out.println("\nAlmacenamientos:");
											System.out.println(miTienda.mostrarAlmacenamiento());
											break;
										case 2:
											System.out.println("\nAuriculares:\n");
											System.out.println(miTienda.mostrarAuriculares());
											break;
										case 3:
											System.out.println("\nComputadoras:\n");
											System.out.println(miTienda.mostrarComputadora());
											break;
										case 4:
											System.out.println("\nAlmacenamientos:");
											System.out.println(miTienda.mostrarCooler());
											break;
										case 5:
											System.out.println("\nFuente:\n");
											System.out.println(miTienda.mostrarFuentes());
											break;
										case 6:
											System.out.println("\nGabinetes:\n");
											System.out.println(miTienda.mostrarGabinetes());
											break;
										case 7:
											System.out.println("\nMemorias Ram:\n");
											System.out.println(miTienda.mostrarMemorias());
											break;
										case 8:
											System.out.println("\nMicrofonos:\n");
											System.out.println(miTienda.mostrarMicrofonos());
											break;
										case 9:
											System.out.println("\nMonitores:\n");
											System.out.println(miTienda.mostrarMonitores());
											break;
										case 10:
											System.out.println("\nMotherboards:\n");
											System.out.println(miTienda.mostrarMothers());
											break;
										case 11:
											System.out.println("\nMouses:\n");
											System.out.println(miTienda.mostrarMouses());
											break;
										case 12:
											System.out.println("\nAudio:\n");
											System.out.println(miTienda.mostrarParlantes());
											break;
										case 13:
											System.out.println("\nPlacas de video:\n");
											System.out.println(miTienda.mostrarPlacas());
											break;
										case 14:
											System.out.println("\nProcesadores:\n");
											System.out.println(miTienda.mostrarProcesadores());
											break;
										case 15:
											System.out.println("\nTeclados:\n");
											System.out.println(miTienda.mostrarTeclados());
											break;
										case 16:
											System.out.println("\nWebcams\n:");
											System.out.println(miTienda.mostrarWebcams());
											break;
										case 17:
											System.out.println("\nCatalogo completo:");
											System.out.println(miTienda.mostrarTodo());
											break;

									}
									if(opcionCargar!=0) {
										System.out.println("ingrese el codigo a agregar\n");
										teclado.nextLine();
										String codigo= teclado.nextLine();
										System.out.println("Ingrese Cantidad\n");
										int cant=teclado.nextInt();
										if(miTienda.checkProducto(codigo)){
											Producto nuevo=miTienda.productoAcarrito(codigo);

											try{
												nuevo.reducirStock(cant);
												miTienda.agregarAlCarrito(nuevo,cant);
											} catch (NoHayStockExcepcion e) {
												System.out.println(e.getMessage());
											}
										}
										else
										{
											System.out.println("codigo equivocado");
										}
										System.out.println("Desea continuar? digite 1, otro valor para salir");
										ventas=teclado.nextInt();
									}else
									{
										ventas=0;
									}


									break;
								case 2:
									System.out.println("1.Armado de PC.");
									System.out.println("2.Instalacion de SO.");
									System.out.println("3.Limpieza de pc.");
									System.out.println("\nDigite la opcion deseada...");
									int opcionService= teclado.nextInt();
									System.out.println(opcionService);
									miTienda.agregarServiceAlCarrito(opcionService);
									ventas=0;
									break;
								case 3:
									if(miTienda.tamanioDeCarro()>0) 
									{
										System.out.println("Carrito de compras:\n");
										System.out.println(miTienda.listarCarrito());
									}else 
									{
										System.out.println("EL CARRITO NO CONTIENE PRODUCTOS");
									}
									ventas=0;
									break;
								case 4:
									
									System.out.println("\n¿Desea generar una factura? 1 para continuar otro valor para salir\n");
									int rta= teclado.nextInt();
									if(miTienda.tamanioDeCarro()>0 && rta==1) {
									System.out.println("Ingrese DNI cliente:\n");
									teclado.nextLine();
									String DNICliente=teclado.nextLine();
									if(!miTienda.getListaDeClientes().existe(DNICliente)) 
									{
										System.out.println("\nIngrese nombre");
										teclado.nextLine();
										String nombre= teclado.nextLine();
										System.out.println("\nIngrese Apellido");
										String apellido= teclado.nextLine();
										
										String dni= DNICliente;
										System.out.println("\nIngrese correo");
										String correo= teclado.nextLine();
										System.out.println("\nIngrese telefono");
										String telefono= teclado.nextLine();
										System.out.println("\nIngrese direccion");
										String direccion= teclado.nextLine();

										miTienda.agregarCliente(nombre,apellido,dni, telefono, direccion,correo);

									}
									
									Cliente comprador=miTienda.retornarCliente(DNICliente);
									
									System.out.println(miTienda.ticket(comprador,miTienda.getCarroDeCompras(),vendedorActivo));
									miTienda.getCarroDeCompras().vaciarCarro();
								 }else{
										if(miTienda.tamanioDeCarro()>0){
											miTienda.restablecerStock();
										}
										miTienda.getCarroDeCompras().vaciarCarro();
									}
									ventas=0;
									break;
								default:
									ventas=0;
									break;
									
							}

							
						}while(ventas==1);
					
						break;
					case 3:
						do{
						System.out.println("Taller\nDiginte la opcion deseada:\n");
						System.out.println("\n1.Ver cola de servicios");
						System.out.println("\n2.Conformar Servicio");
						int opcionTaller = teclado.nextInt();
						switch (opcionTaller) {
							case 1:
								//Ver cola de servicios
								System.out.println("TAREAS TALLER: \n");
								System.out.println(miTienda.listarTaller()); 
								break;
							case 2:
								//Conformar Servicio
								miTienda.conformarServicio();
								System.out.println("Lista servicios pendientes: ");
								System.out.println(miTienda.listarTaller());
								break;
						}

							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont == 1);

						break;
					case 4:
						do{
						System.out.println("\nMenu Clientes\nDiginte la opcion deseada:\n");
						System.out.println("1.Cargar Clientes");
						System.out.println("2.Editar Clientes");
						System.out.println("3.Buscar Cliente");
						System.out.println("4.Listar Clientes");
						int opcionCliente = teclado.nextInt();


						switch (opcionCliente) {
							case 1:
								//Cargar un cliente
								System.out.println("\nIngrese nombre");
								teclado.nextLine();
								String nombre= teclado.nextLine();
								System.out.println("\nIngrese Apellido");
								String apellido= teclado.nextLine();
								System.out.println("\nIngrese dni");
								String dni= teclado.nextLine();
								System.out.println("\nIngrese correo");
								String correo= teclado.nextLine();
								System.out.println("\nIngrese telefono");
								String telefono= teclado.nextLine();
								System.out.println("\nIngrese direccion");
								String direccion= teclado.nextLine();

								miTienda.agregarCliente(nombre,apellido,dni, telefono, direccion,correo);

								break;
							case 2:
								System.out.println("\nIngrese DNI del cliente a buscar:\n");
								teclado.nextLine();
								String id= teclado.nextLine();
								System.out.println(miTienda.buscarCliente(id));
								System.out.println("\nCliente correcto?\n1.Ok\n2.Incorrecto\n");
								int correcto= teclado.nextInt();
								if(correcto==1) {
									System.out.println("\nQue desea cambiar?");
									System.out.println("\n1.Direccion.");
									System.out.println("\n2.Telefono.");
									System.out.println("\n3.Correo Electronico.");
									int opcionEdit= teclado.nextInt();
									System.out.println("\nIngrese el nuevo dato a reemplazar:\n");
									teclado.nextLine();
									String nuevoDato= teclado.nextLine();
									miTienda.editarCliente(id,nuevoDato,opcionEdit);
									System.out.println(miTienda.buscarCliente(id));
								}
								break;
							case 3:
								System.out.println("\nIngrese DNI del cliente:\n");
								teclado.nextLine();
								String idAbuscar= teclado.nextLine();
								if(miTienda.existeCliente(idAbuscar)) 
								{
									System.out.println(miTienda.buscarCliente(idAbuscar));
									System.out.println("Desea ver las facturas del cliente? \n1.Si \nOtro numero.No ");
									int opMostrarFacturas= teclado.nextInt();
									if(opMostrarFacturas==1) 
									{
										System.out.println(miTienda.mostrarFacturasDeCliente(idAbuscar)); 
									}
								}else 
								{
									System.out.println("No Existe cliente");
								}
								break;
							case 4:
								System.out.println("\nCLIENTES: \n"+miTienda.listarClientes());
								break;
						}
							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();

						}while(cont == 1);
						break;
					case 5:
						do {
							System.out.println("\nAdministrador\nDiginte la opcion deseada:\n");
							System.out.println("\n1.Cargar Vendedor");
							System.out.println("\n2.Editar Vendedor");
							System.out.println("\n3.Remover Vendedor");
							System.out.println("\n4.Ver vendedor");
							System.out.println("\n5.Listar vendedores");
							System.out.println("\n6.Listar facturas");
							System.out.println("\n7.Bucar factura por ID");
							int opcionADM = teclado.nextInt();

							switch (opcionADM) {
								case 1:
									////Cargar un vendedor
									System.out.println("\nIngrese nombre");
									teclado.nextLine();
									String nombre= teclado.nextLine();
									System.out.println("\nIngrese Apellido");
									String apellido= teclado.nextLine();
									System.out.println("\nIngrese dni");
									String dni= teclado.nextLine();
									System.out.println("\nIngrese correo");
									String correo= teclado.nextLine();
									System.out.println("\nIngrese telefono");
									String telefono= teclado.nextLine();
									System.out.println("\nIngrese direccion");
									String direccion= teclado.nextLine();
									
								
									System.out.println("\nIngrese contraseña: ");
									String contrasenia= teclado.nextLine();
									
									miTienda.agregarVendedor(nombre, apellido, dni, telefono, direccion, correo,contrasenia);

									break;
								case 2:
									System.out.println("\nIngrese DNI del vendedor a buscar:\n");
									teclado.nextLine();
									String idVendedor= teclado.nextLine();
									System.out.println(miTienda.buscarVendedor(idVendedor));
									System.out.println("\nVendedor correcto?\n1.Ok\n2.Incorrecto\n");
									int correcto= teclado.nextInt();
									if(correcto==1) {
										System.out.println("\nQue desea cambiar?");
										System.out.println("\n1.Direccion.");
										System.out.println("\n2.Telefono.");
										System.out.println("\n3.Correo Electronico.");
										int opcionEdit= teclado.nextInt();
										System.out.println("\nIngrese el nuevo dato a reemplazar:\n");
										teclado.nextLine();
										String nuevoDato= teclado.nextLine();
										miTienda.editarVendedor(idVendedor,nuevoDato,opcionEdit);
										System.out.println(miTienda.buscarVendedor(idVendedor));
									}
									break;
								case 3:
									//remover vendedor
									System.out.println("\nIngrese DNI del vendedor a remover:\n");
									teclado.nextLine();
									String idEliminar= teclado.nextLine();
									System.out.println(miTienda.buscarVendedor(idEliminar));
									System.out.println("\nVendedor a eliminar correcto?\n1.Ok\n2.Incorrecto\n");
									int correctoElminar= teclado.nextInt();
									if(correctoElminar==1) 
									{
										miTienda.removerVendedor(idEliminar);
									}
									break;
								case 4:
									//ver vendedor
									System.out.println("\nIngrese DNI del vendedor:\n");
									teclado.nextLine();
									String idAbuscar= teclado.nextLine();
									System.out.println(miTienda.buscarVendedor(idAbuscar));
									break;
								case 5:
									//listar vendedores
									System.out.println("\nVENDEDORES: \n"+miTienda.listarVendedores());
									break;
								
								case 6: 
									System.out.println("FACTURAS DE LA TIENDA: \n");
									System.out.println(miTienda.listarFacturas()); 
									break;
								
								case 7:
									System.out.println("Ingrese ID de factura: \n");
									int idFactura= teclado.nextInt();
									
									System.out.println(miTienda.buscarFactura(idFactura));
									break;
							}

							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont==1);
						break;

				}
			} while (opcion < 6 && opcion > -1);
			if(miTienda.tamanioDeCarro()>0){
				miTienda.restablecerStock();
			}
			miTienda.pasarTiendaAArchivo();
			}
		System.out.println(nuevoJSON.javaAJSON(miTienda.getCatalogo()));
		
		
		}

}
