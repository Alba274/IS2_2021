package es.unican.is2.seguros.model;

import java.time.LocalDate;


public class Seguro {

	private int potencia;
	private Cliente cliente;
	private Cobertura cobertura;
	private LocalDate fechaUltimoSiniestro;


	public Seguro(int potencia, Cliente cliente, Cobertura cobertura) {
		this.cliente = cliente;
		this.cobertura = cobertura;
		this.potencia = potencia;
	}

	public double precio() throws DatoIncorrectoException {
		double precio = 0;
		LocalDate date = LocalDate.now(); //Hoy

		//COBERTURA
		switch(cobertura) {
		case TODORIESGO: 
			precio += 1000;
			break;
		case TERCEROSLUNAS:
			precio += 600;
			break;
		case TERCEROS:
			precio += 400;
			break;
		}
		
		//POTENCIA
		if(potencia >= 90 && potencia <= 110) {
			double p = precio * 0.05;
			precio += p;
		} else if (potencia > 110) {
			double p = precio * 0.2;
			precio += p;
		}
		
		//SINIESTRO
		if(date.minusYears(1).isAfter(fechaUltimoSiniestro)) {
			precio += 200;
		} else if (date.minusYears(1).minusDays(1).isBefore(fechaUltimoSiniestro)&& date.minusYears(3).isAfter(fechaUltimoSiniestro)) {
			precio += 50;
		}
			
			
		//MINUSVALIA
		if(cliente.minusvalia() == true) {
			double p = precio * 0.25;
			precio -= p;
			
		}
		
		

		return precio;
	}

}
