package ar.com.educacionit.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.educacionit.ws.dto.CreateProductoDTO;
import ar.com.educacionit.ws.faults.InternalServerError;

@WebService
public interface ProductoWSService {
 
	@WebMethod(operationName = "getProductoByCodigo")
	public Producto getProducto(@WebParam(name="codigo") String codigo) throws InternalServerError;
	
	@WebMethod
	public List<Producto> findAllProductos() throws InternalServerError;
	
	@WebMethod()
	public Producto createProducto(CreateProductoDTO productoRequest) throws InternalServerError;
	
	@WebMethod
	public Producto deleteProducto(@WebParam(name = "codigo") String codigo) throws InternalServerError;
	
	@WebMethod
	public Producto updateProducto(CreateProductoDTO updateProductoRequest) throws InternalServerError;
}
