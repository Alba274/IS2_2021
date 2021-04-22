package practica04;

import es.unican.is2.seguros.model.Cliente;
import es.unican.is2.seguros.model.Cobertura;
import es.unican.is2.seguros.model.DatoIncorrectoException;
import es.unican.is2.seguros.model.Seguro;
import junit.framework.TestCase;

public class SeguroTest extends TestCase {

	private Seguro seguro;
	
	public void setUp() {
		seguro = new Seguro(90, new Cliente("Pepe","767829377",true),Cobertura.TERCEROS);
	}

	public void testPrecio() {
		try {
			seguro.precio();
		} catch (DatoIncorrectoException e) {
			e.printStackTrace();
		}
	}
	
}
