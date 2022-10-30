package clases;

import java.io.Serializable;

import excepciones.ContraseniaIncorrectaExcepcion;
import excepciones.DNIIncorrectoExcepcion;

public class Vendedor extends Persona implements Serializable{
 
    private String contrasenia;//alfanumerica;
    private double totalVentas;

    public Vendedor() {
     
        this.contrasenia = "0";
        this.totalVentas=0;
    }
    public Vendedor(String nombre, String apellido, String dni, String telefono, String direccion, String correo, String contrasenia) {
        super(nombre,apellido,dni,telefono,direccion,correo);
      
        this.contrasenia = contrasenia;
        this.totalVentas=0;
    }

 

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getTotalVentas() {
        return totalVentas;
    }
    public void sumarVenta(double venta){
        this.totalVentas=totalVentas+venta;
    }

    
    @Override
    public String toString() {
        return "\nVendedor="  + super.toString() + "Total de ventas acumuladas: " + totalVentas;
    }
    
    
	@Override
    public void editarPersona(String dato, int opcion){
		if(opcion==1){
			setDireccion(dato);
		}
		else if(opcion==2){
			setTelefono(dato);
		}else{
			setCorreo(dato);
		}
	}
	
	public boolean comprobarContrasenia(String contrasenia) throws ContraseniaIncorrectaExcepcion 
	{
		boolean correcto=false;
		if(this.contrasenia.equals(contrasenia)) 
		{
			correcto=true;
		}else 
		{
			throw new ContraseniaIncorrectaExcepcion("CONTRASENIA INCORRECTA");
		}
		return correcto;
	}
	
	public boolean comprobarDNI(String dni_Id) throws DNIIncorrectoExcepcion 
	{
		boolean correcto=false;
		if(getDni().equals(dni_Id)) 
		{
			correcto=true;
		}else
		{
			throw new DNIIncorrectoExcepcion("DNI INCORRECTO");
		}
		return correcto;
	}
}
