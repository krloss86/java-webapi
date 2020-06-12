package ar.com.educacionit.app.ws.wsrest.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.logging.LoggingFeature;

import ar.com.eduacionit.app.domain.Producto;

public class ProductoResourceClient2 {

	public static void main(String[] args) {
		
		//jersey / cxf / spring rest template 
		
		//Client
		Client client = ClientBuilder.newClient( new ClientConfig().register(LoggingFeature.class));
		
		//WebTarget							 http://localhost:8080/ws-rest-server/api/productos
		WebTarget webTarget = client.target("http://localhost:8080/ws-rest-server/api/").path("productos/");
				
		//invocation.Builder
		Invocation.Builder iv = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get/post/put
		Producto producto = new Producto("test", 150f, "abc002");
		
		Response response = iv.post(Entity.entity(producto, MediaType.APPLICATION_JSON));
		
		System.out.println(response.getStatus());
		//List<Producto>
	}
}
