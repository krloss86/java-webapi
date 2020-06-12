package ar.com.educacionit.app.ws.meli.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import ar.com.eduacionit.app.domain.Producto;

public class ProductoByCodigoRestExecutor extends RestRequestExecutor<Producto> {

	private String codigoProducto;
	private String path;
	
	public ProductoByCodigoRestExecutor(String urlRestApi, String codigoProducto, String path) {
		super(urlRestApi);
		this.codigoProducto = codigoProducto;
		this.path = path;
	}

	@Override
	protected Producto buildResponseDto(Response response) {
		
		Producto producto = response.readEntity(Producto.class);
		
		return producto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}
	
	@Override
	protected WebTarget buildWebTarget(Client client) {
		WebTarget webTarget = client.target(this.urlRestApi).path(this.path +"/"+this.codigoProducto);
		return webTarget;
	}
}
