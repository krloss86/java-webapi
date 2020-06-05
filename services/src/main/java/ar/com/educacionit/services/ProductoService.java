package ar.com.educacionit.services;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.educacionit.services.exceptions.ServiceException;

public interface ProductoService {

	public Producto getProductoByCodigo(String codigoProducto) throws ServiceException;
}
