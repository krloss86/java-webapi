package ar.com.educacionit.ws.main;

import javax.xml.ws.Endpoint;

import ar.com.educacionit.ws.impl.ProductoWSServiceImpl;

public class ProducroServiceWSMain {

	public static void main(String[] args) {
		
		System.out.println("Publicando ws soap en el puerto 8082");
		
		Endpoint.publish("http://localhost:8082/", new ProductoWSServiceImpl());
		
		System.out.println("Se ha iniciado el ws ProductoWSService en http://localhost:8082/");
		
		System.out.println("La direccion de wsdl es : http://localhost:8082/?wsdl");
	}

}
