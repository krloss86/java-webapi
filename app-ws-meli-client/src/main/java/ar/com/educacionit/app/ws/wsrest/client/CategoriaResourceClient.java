package ar.com.educacionit.app.ws.wsrest.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.logging.LoggingFeature;

import ar.com.educionit.app.ws.meli.client.dto.cetegory.Categoria;

public class CategoriaResourceClient {

	public static void main(String[] args) {
		
		//jersey / cxf / spring rest template 
		
		//Client
		Client client = ClientBuilder.newClient( new ClientConfig().register(LoggingFeature.class));
		
		//WebTarget							 http://localhost:8080/ws-rest-server/api/productos
		WebTarget webTarget = client.target("https://api.mercadolibre.com/sites/MLA/categories");
				
		//invocation.Builder
		Invocation.Builder iv = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get/post/put
		Response response = iv.get();
		
		//Producto producto = response.readEntity(Producto.class);
		
		GenericType<List<Categoria>> entity = new GenericType<List<Categoria>>() {
		};
		
		List<Categoria> productos = response.readEntity(entity);
		
		for(Categoria p : productos) {
			System.out.println(p);
		}
		//List<Producto>
	}
}
