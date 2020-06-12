package ar.com.educacionit.dao;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.educacionit.dao.exceptions.GenericExeption;

public interface ProductoDAO {

	public Producto getProducto(String codigo) throws GenericExeption;
}
