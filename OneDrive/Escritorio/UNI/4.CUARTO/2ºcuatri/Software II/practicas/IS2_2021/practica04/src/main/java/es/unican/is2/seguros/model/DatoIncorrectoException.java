package es.unican.is2.seguros.model;

@SuppressWarnings("serial")
public class DatoIncorrectoException extends Exception{

	@SuppressWarnings("unused")
	private String msj;
	
	public DatoIncorrectoException(String msj) {
		this.msj=msj;
	}
}
