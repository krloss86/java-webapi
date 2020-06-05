package ar.com.educacionit.services;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.exceptions.GenericExeption;
import ar.com.educacionit.dao.hibernate.impl.ProductoDAOHibernateImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//CTRL+SHIFT+O
    	//INTERFACE I = NEW CLASE()
        ProductoDAO pdao = new ProductoDAOHibernateImpl();
        
        Producto producto;
		try {
			producto = pdao.getProducto("0001");
			System.out.println(producto);
		} catch (GenericExeption e) {
			e.printStackTrace();
		}
        
    }
}
