package ar.com.educacionit.services.impl;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.dao.hibernate.impl.ProductoDAOHibernateImpl;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ProductoServiceImpl implements ProductoService {

	private ProductoDAO productoDao;
	
	public ProductoServiceImpl() {
		this.productoDao = new ProductoDAOHibernateImpl();
		// this.productoDao = new ProductoJDCBImpl();
	}
	
	@Override
	public Producto getProductoByCodigo(String codigoProducto) throws ServiceException {
		try {
			return this.productoDao.getProducto(codigoProducto);
		} catch (GenericExeption e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
