package excepciones;

public class ContraseniaIncorrectaExcepcion extends Exception{

	public ContraseniaIncorrectaExcepcion (String mensaje) 
	{
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
