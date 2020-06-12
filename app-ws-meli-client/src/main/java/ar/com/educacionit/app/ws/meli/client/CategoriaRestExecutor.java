package ar.com.educacionit.app.ws.meli.client;

import java.util.List;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import ar.com.educionit.app.ws.meli.client.dto.cetegory.Categoria;

public class CategoriaRestExecutor extends RestRequestExecutor<List<Categoria>> {

	public CategoriaRestExecutor(String urlRestApi) {
		super(urlRestApi);
	}

	@Override
	protected List<Categoria> buildResponseDto(Response response) {

		GenericType<List<Categoria>> entity = new GenericType<List<Categoria>>() {
		};
		
		List<Categoria> productos = response.readEntity(entity);
		
		return productos;
	}

}
