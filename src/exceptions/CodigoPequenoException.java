package exceptions;

public class CodigoPequenoException extends Exception{
	
	public CodigoPequenoException()
	{
		super("O c�digo deve ter pelo menos dois caracteres!");
	}

}
