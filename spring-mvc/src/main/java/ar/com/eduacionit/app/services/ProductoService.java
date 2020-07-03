package ar.com.eduacionit.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.eduacionit.app.repository.ProductoRepository;

@Service
@Transactional(timeout = 1000)
public class ProductoService {

	//inyectar un repositorio 
	@Autowired
	private ProductoRepository productoRepository;

	public List<Producto> findAll() {
		return this.productoRepository.findAll();
	}

	public void save(Producto producto) {
		this.productoRepository.save(producto);
	}
}
