package ar.com.educacionit.app.ws.meli.client;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ar.com.eduacionit.app.domain.Producto;

public class ProductoByCodigoTestCase {

	@Test
	public void whenGetCodigoProducto_thenShowIt() throws Exception {
		
		RestRequestExecutor<Producto> rest = new ProductoByCodigoRestExecutor(
				"http://localhost:8080/ws-rest-server/api/", "abc001", "productos");
		
		Producto producto = rest.executeRestCall();
		
		assertNotNull(producto);
	}
	
}
