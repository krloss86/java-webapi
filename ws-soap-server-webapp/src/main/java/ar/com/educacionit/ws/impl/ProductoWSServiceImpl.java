package ar.com.educacionit.ws.impl;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.ProductoWSService;
import ar.com.educacionit.ws.dto.CreateProductoDTO;
import ar.com.educacionit.ws.faults.InternalServerError;

@WebService(endpointInterface = "ar.com.educacionit.ws.ProductoWSService")
@BindingType(
		value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class ProductoWSServiceImpl implements ProductoWSService {

	public Producto getProducto(String codigoProducto) throws InternalServerError {

		ProductoService productoService = new ProductoServiceImpl();

		try {
			return productoService.getProducto(codigoProducto);
		} catch (ServiceException e) {
			throw new InternalServerError(e);
		}
	}

	public List<Producto> findProductos() throws InternalServerError {

		ProductoService productoService = new ProductoServiceImpl();

		try {
			return productoService.findProductos();
		} catch (Exception e) {
			throw new InternalServerError(e);
		}
	}

	public Producto createProducto(CreateProductoDTO request) throws InternalServerError {
		ProductoService productoService = new ProductoServiceImpl();

		Producto producto = new Producto();
		producto.setCodigo(request.getCodigo());
		producto.setDescripcion(request.getDescripcion());
		producto.setPrecio(request.getPrecio());
		try {
			return productoService.createProducto(producto);
		} catch (ServiceException e) {
			throw new InternalServerError(e);
		}
	}
}
