import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import es.unican.is2.practica04.lista.ListaOrdenada;

public class ListaOrdenadaTest {

	private ListaOrdenada<Integer> listaElementos;
	private ListaOrdenada<Integer> listaElem;
	private ListaOrdenada<Integer> listaVacia;

	@Before
	public void setUp() throws Exception {
		//lista con mas de un elemento
		listaElementos = new ListaOrdenada<Integer>;
		listaElementos.add(4);
		listaElementos.add(3);
		//lista con 1 elemento
		listaElem = new ListaOrdenada<Integer>;
		listaElem.add(1);
		//lista vacia
		listaVacia = new ListaOrdenada<Integer>();

	}

	@Test
	public void testGet() {
		//casos validos
		try {
			assertTrue(listaElementos.get(1)==4);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

		try {
			assertTrue(listaElem.get(0)==1);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}


		//casos no validos

		try {
			listaVacia.get(0);
			fail("Fallo->Deberia lanzar la excepcion al acceder a una lista vacia");
		} catch (IndexOutOfBoundsException e) {
		}

		try {
			listaElementos.get(-2);
			fail("Fallo->Deberia lanzar la excepcion al acceder a un valor fuera de los limites (<0)");
		} catch (IndexOutOfBoundsException e) {
		}

		try {
			listaElementos.get(5);
			fail("Fallo->Deberia lanzar la excepcion al acceder a un valor fuera de los limites (>max)");
		} catch (IndexOutOfBoundsException e) {
		}
	}


	@Test
	public void testAdd() {
		//casos validos
		try {
			listaVacia.add(3);
			assertTrue(listaVacia.get(0)==3 && listaVacia.size()==1);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

		try {
			listaElementos.add(5);
			assertTrue(listaConElem.get(0)==5 && listaConElem.get(1)==3 && listaConElem.get(2)==4 && listaConElem.size()==3);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

		try {
			listaElem.add(2);
			assertTrue(listaCon1Elem.get(0)==2 && listaCon1Elem.get(1)==1 && listaCon1Elem.size()==2);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

		//casos no validos
		try {
			listaVacia.add(null);
			fail("Fallo->Se ha añadido un elem null ");
		} catch (NullPointerException e) {
		}


	}

	@Test
	public void testRemove() {
		int r;
		//casos validos
		try {
			r = listaElementos.remove(1);
			assertTrue(listaElementos.get(0)==3 && listaElementos.size()==1 && r==4);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

		try {
			r = listaElem.remove(0);
			assertTrue(listaElem.size()==0 && r==1);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}


		//casos no validos
		try {
			listaVacia.remove(0);
			fail("Fallo->Se ha eliminado un elem de una lista vacia");
		} catch (IndexOutOfBoundsException e) {
		}

		try {
			listaElementos.remove(-2);
			fail("Fallo->Se ha eliminado un elem de una posicion fuera de los limites (<0)");
		} catch (IndexOutOfBoundsException e) {
		}

		try {
			listaElementos.remove(5);
			fail("Fallo->Se ha eliminado un elem de una posicion fuera de los limites (>max)");
		} catch (IndexOutOfBoundsException e) {
		}
	}

	@Test
	public void testSize() {
		//casos validos
		try {
			assertTrue(listaElementos.size()==2);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}
		try {
			assertTrue(listaElem.size()==1);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

		try {
			assertTrue(listaVacia.size()==0);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

	}

	@Test
	public void testClear() {
		//casos validos
		try {
			listaElementos.clear();
			assertTrue(listaElementos.size()==0);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}
		try {
			listaElem.clear();
			assertTrue(listaElem.size()==0);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}

		try {
			listaVacia.clear();
			assertTrue(listaVacia.size()==0);
		} catch (Exception e) {
			fail("No deberia lanzar la excepcion");
		}



	}

}
