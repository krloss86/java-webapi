package ar.com.educacionit.app.ws.meli.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import ar.com.educionit.app.ws.meli.client.dto.cetegory.Categoria;

public class CategoriaRestExecutorTestCase {

	@Test
	public void whenGetCategoriaEndpoint_thenShowObject() throws Exception {
		
		CategoriaRestExecutor rest = new CategoriaRestExecutor("https://api.mercadolibre.com/sites/MLA/categories");
		
		List<Categoria> categorias = rest.executeRestCall();

		assertNotNull(categorias);
	}
}
