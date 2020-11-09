package exceptions;

public class VoceNaoTemPermissaoException extends Exception{
	
	private String nome;
	
	public VoceNaoTemPermissaoException(String nome)
	{
		super("Voc� n�o tem permiss�o para " + nome);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
