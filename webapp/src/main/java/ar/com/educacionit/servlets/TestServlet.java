package ar.com.educacionit.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ProductoServiceImpl;

@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends HttpServlet {

	private ProductoService ps = new ProductoServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			Producto p =  ps.getProductoByCodigo("0001");
			req.getSession().setAttribute("producto", p);
			getServletContext().getRequestDispatcher("/test.jsp").forward(req, resp);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
