package excepciones;

public class NoHayStockExcepcion extends Exception{

	public NoHayStockExcepcion (String mensaje) 
	{
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
