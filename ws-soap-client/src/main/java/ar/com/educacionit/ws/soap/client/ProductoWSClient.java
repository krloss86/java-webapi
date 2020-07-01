package ar.com.educacionit.ws.soap.client;

import java.util.List;

import ar.com.educacionit.ws.Producto;
import ar.com.educacionit.ws.impl.InternalServerError;
import ar.com.educacionit.ws.impl.ProductoWSService;
import ar.com.educacionit.ws.impl.ProductoWSServiceImplService;

public class ProductoWSClient {

	public static void main(String[] args) {
		
		ProductoWSServiceImplService cliente = new ProductoWSServiceImplService();
		ProductoWSService service =  cliente.getProductoWSServiceImplPort();
		try {
			List<Producto> productos = service.findAllProductos();
			System.out.println(productos);
		} catch (InternalServerError e) {
			e.printStackTrace();
		}
	}

}
