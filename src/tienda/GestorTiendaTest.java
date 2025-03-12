package tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {
	static GestorTienda tienda1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tienda1 = new GestorTienda();
	}

	@Test
	void testCalcularDescuento() {
		assertEquals(10.0, tienda1.calcularDescuento(100,11));
		assertEquals(5.0, tienda1.calcularDescuento(100, 6));
		assertEquals(0, tienda1.calcularDescuento(100, 3));
	}

	@Test
	void testCategorizarProducto() {
		assertEquals("Económico", tienda1.categorizarProducto(9));
		assertEquals("Estándar", tienda1.categorizarProducto(40));
		assertEquals("Premium", tienda1.categorizarProducto(199));
	}

	@Test
	void testBuscarProducto() {
		String[] prod = {"prod1","prod2"};
		assertNull(tienda1.buscarProducto(prod, null));
		assertEquals("prod1",tienda1.buscarProducto(prod,"prod1"));
	}

}
