package ar.com.educacionit.ws.impl;

import java.util.List;

import javax.jws.WebService;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.eduacionit.app.domain.TipoProducto;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ProductoServiceImpl;
import ar.com.educacionit.ws.ProductoWSService;
import ar.com.educacionit.ws.dto.CreateProductoDTO;
import ar.com.educacionit.ws.faults.InternalServerError;

@WebService(endpointInterface = "ar.com.educacionit.ws.ProductoWSService")
public class ProductoWSServiceImpl implements ProductoWSService {

	@Override
	public Producto getProducto(String codigo) {
		
		ProductoService productoService = new ProductoServiceImpl();
		
		try {
			return productoService.getProducto(codigo);
		} catch (ServiceException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}


	@Override
	public List<Producto> findAllProductos() throws InternalServerError {
		
		//acceso a nuetra capa core
		ProductoService productoService = new ProductoServiceImpl();
		
		try {
			return productoService.findProductos();
		} catch (ServiceException e) {
			throw new InternalServerError(e);
		}
	}


	@Override
	public Producto createProducto(CreateProductoDTO productoRequest) throws InternalServerError {
		ProductoService ps = new ProductoServiceImpl();
		
		//Producto de domain
		Producto producto = new Producto();
		producto.setCodigo(productoRequest.getCodigo());
		producto.setDescripcion(productoRequest.getDescripcion());
		producto.setPrecio(productoRequest.getPrecio());
		
		TipoProducto tp = new TipoProducto();
		tp.setId(productoRequest.getTipoProducto());
		producto.setTipoProducto(tp);
		
		try {
			return ps.createProducto(producto);
		} catch (ServiceException e) {
			throw new InternalServerError(e);
		}
	}


	@Override
	public Producto deleteProducto(String codigo) throws InternalServerError {
		ProductoService ps = new ProductoServiceImpl();
		try {
			return ps.eliminarProducto(codigo);
		} catch (ServiceException e) {
			throw new InternalServerError(e);
		}
	}


	@Override
	public Producto updateProducto(CreateProductoDTO updateProductoRequest) throws InternalServerError {
		// TODO Auto-generated method stub
		return null;
	}

}
