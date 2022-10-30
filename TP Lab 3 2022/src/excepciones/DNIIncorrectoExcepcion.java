package excepciones;

public class DNIIncorrectoExcepcion extends Exception {
	
	public DNIIncorrectoExcepcion (String mensaje) 
	{
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
