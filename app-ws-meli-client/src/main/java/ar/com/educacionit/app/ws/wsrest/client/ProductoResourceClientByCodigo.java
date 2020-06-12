package ar.com.educacionit.app.ws.wsrest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.logging.LoggingFeature;

import ar.com.eduacionit.app.domain.Producto;

public class ProductoResourceClientByCodigo {

	public static void main(String[] args) {
		
		String codigo  = "a042";
		//Client
		Client client = ClientBuilder.newClient( new ClientConfig().register(LoggingFeature.class));
		
		//WebTarget							 http://localhost:8080/ws-rest-server/api/productos
		WebTarget webTarget = client.target("http://localhost:8080/ws-rest-server/api/").path("productos/"+codigo);
				
		//invocation.Builder
		Invocation.Builder iv = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get/post/put
		Response response = iv.get();
		
		Producto producto = response.readEntity(Producto.class);
		
		System.out.println(producto);
	}
}
