package manejoArchivo;

import Facturacion.Factura;
import ProductosYServicios.ItemServicio;
import ProductosYServicios.ServicioTaller;
import clases.Cliente;
import clases.Taller;
import clases.Vendedor;
import colecciones.Contenedora;
import colecciones.ContenedoraDeFacturas;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class ArchivoHerramientas<K> {

	public ArchivoHerramientas() {}
	
	public void guardarVendedorEnArchivo(Contenedora vendedores) 
	{
		FileOutputStream archi= null;
		
		try {
			archi = new FileOutputStream("vendedores.bin");
			ObjectOutputStream vendedorArchi = new ObjectOutputStream(archi);
			Iterator<Entry<K,Vendedor>> it = vendedores.devolverIterator();
			while(it.hasNext()) 
	        {
	        	Entry<K,Vendedor>entry=  (Entry<K,Vendedor>)it.next();
	        	vendedorArchi.writeObject(entry.getValue());
	        }
			vendedorArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
            try {
            	archi.close();
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
	}
	
	public Contenedora cargarVendedoresDesdeArchivo() 
	{
		FileInputStream archi=null;
		Contenedora contenedoraVendedores= new Contenedora();
		try {
			archi = new FileInputStream("vendedores.bin");
			ObjectInputStream vendedorArchi = new ObjectInputStream(archi);
			Vendedor vendedorAux;
			
			while((vendedorAux=(Vendedor)vendedorArchi.readObject())!=null)
			{
				contenedoraVendedores.agregarObjetoColeccion(vendedorAux.getDni(), vendedorAux);
			}
			vendedorArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
                archi.close();
                return contenedoraVendedores;
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
		
		return contenedoraVendedores;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void guardarClienteEnArchivo(Contenedora clientes) 
	{
		FileOutputStream archi= null;
		
		try {
			archi = new FileOutputStream("clientes.bin");
			ObjectOutputStream clienteArchi = new ObjectOutputStream(archi);
			Iterator it = clientes.devolverIterator();
			while(it.hasNext()) 
	        {
	        	Entry<K,Cliente>entry=  (Entry<K,Cliente>)it.next();
	        	clienteArchi.writeObject(entry.getValue());
	        }
			clienteArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
            try {
            	archi.close();
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
	}
	
	public Contenedora cargarClientesDesdeArchivo() 
	{
		FileInputStream archi=null;
		Contenedora contenedoraClientes= new Contenedora();
		try {
			archi = new FileInputStream("clientes.bin");
			ObjectInputStream clienteArchi = new ObjectInputStream(archi);
			Cliente clienteAux;
			
			while((clienteAux=(Cliente)clienteArchi.readObject())!=null)
			{
				contenedoraClientes.agregarObjetoColeccion(clienteAux.getDni(), clienteAux);
			}
			clienteArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
                archi.close();
                return  contenedoraClientes;
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
		
		return contenedoraClientes;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void guardarFacturasEnArchivo(ContenedoraDeFacturas facturas) 
	{
		FileOutputStream archi= null;
		
		try {
			archi = new FileOutputStream("facturas.bin");
			ObjectOutputStream facturaArchi = new ObjectOutputStream(archi);
			Iterator it = facturas.devolverIterator();
			while(it.hasNext()) 
	        {
	        	Entry<K,Factura>entry=  (Entry<K,Factura>)it.next();
	        	facturaArchi.writeObject(entry.getValue());
	        }
			facturaArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
            try {
            	archi.close();
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
	}
	
	public ContenedoraDeFacturas cargarFacturasDesdeArchivo() 
	{
		FileInputStream archi=null;
		ContenedoraDeFacturas contenedoraFacturas= new ContenedoraDeFacturas<>();
		try {
			archi = new FileInputStream("facturas.bin");
			ObjectInputStream facturaArchi = new ObjectInputStream(archi);
			Factura facturaAux;
			
			while((facturaAux=(Factura)facturaArchi.readObject())!=null)
			{
				contenedoraFacturas.agregarObjetoColeccion((Integer)facturaAux.getId(), facturaAux);
			}
			facturaArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
                archi.close();
                return contenedoraFacturas;
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
		
		return contenedoraFacturas;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void guardarTallerEnArchivo(Taller taller) 
	{
		FileOutputStream archi= null;
		
		try {
			archi = new FileOutputStream("taller.bin");
			ObjectOutputStream tallerArchi = new ObjectOutputStream(archi);
			
			while(!taller.estaVacio())
	        {
	        	
	        	tallerArchi.writeObject(taller.remover());
	        }
			
			tallerArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
            try {
            	archi.close();
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
	}
	
	public Taller cargarTallerDesdeArchivo() 
	{
		FileInputStream archi=null;
		Taller tallerAux= new Taller();
		try {
			archi = new FileInputStream("taller.bin");
			ObjectInputStream tallerArchi = new ObjectInputStream(archi);
			ServicioTaller servicioAux;
			
			while((servicioAux=(ServicioTaller)tallerArchi.readObject())!=null)
			{
				tallerAux.agregar(servicioAux);                   
			}
			tallerArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
                archi.close();
                return tallerAux;
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
		
		return tallerAux;
	}
	
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void guardarServicesEnArchivo(ArrayList<ItemServicio> servicio) 
	{
		FileOutputStream archi= null;
		
		try {
			archi = new FileOutputStream("servicios.bin");
			ObjectOutputStream serviciosArchi = new ObjectOutputStream(archi);
			
			for(int i=0;i<servicio.size();i++)
	        {
	        	
				serviciosArchi.writeObject(servicio.get(i));
	        }
			
			serviciosArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
            try {
            	archi.close();
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
	}
	
	public ArrayList<ItemServicio> cargarServicesDesdeArchivo() 
	{
		FileInputStream archi=null;
		ArrayList<ItemServicio> serviciosArray= new ArrayList<>();
		try {
			archi = new FileInputStream("servicios.bin");
			ObjectInputStream serviciosArchi = new ObjectInputStream(archi);
			ItemServicio servicioAux;
			
			while((servicioAux=(ItemServicio)serviciosArchi.readObject())!=null)
			{
				serviciosArray.add(servicioAux);                   
			}
			serviciosArchi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
                archi.close();
                return serviciosArray;
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
		
		return serviciosArray;
	}
	
}
