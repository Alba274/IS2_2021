package es.unican.is2.seguros.model;



public class Cliente {

	private String nombre;
	private String DNI;
	private boolean minusvalia = false;
	
	public Cliente(String nombre, String DNI, boolean minusvalia) {
		this.DNI = DNI;
		this.minusvalia = minusvalia;
		this.nombre = nombre;
		
	}
	
	public boolean minusvalia() {
		return minusvalia;
	}

	public String nombre() {
		return nombre;
	}
	
	public String DNI() {
		return DNI;
	}
}
