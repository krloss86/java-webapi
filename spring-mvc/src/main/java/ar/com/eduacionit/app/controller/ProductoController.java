package ar.com.eduacionit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.com.eduacionit.app.domain.Producto;
import ar.com.eduacionit.app.domain.TipoProducto;
import ar.com.eduacionit.app.repository.ProductoRepository;
import ar.com.eduacionit.app.repository.TipoProductoRepository;
import ar.com.eduacionit.app.services.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@Autowired 
	ProductoRepository productoRepository;
	
	@Autowired
	private TipoProductoRepository tipoProductoRepository;
	
	@RequestMapping("/list")
	public String listado(Model model) {
		model.addAttribute("productos", productoService.findAll());
		return "listado";
	}
	
	@RequestMapping("/new")
	public ModelAndView newProduct() {
		
		ModelAndView modelAndView = new ModelAndView("new_product");
		
		Producto productoVacio = new Producto();
		
		modelAndView.addObject("producto", productoVacio);
		
		List<TipoProducto> tiposProductos = tipoProductoRepository.findAll();
		
		//cargar el combo de tipo de producto
		modelAndView.addObject("tiposProductos", tiposProductos);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(
			@ModelAttribute(name="producto")
			Producto producto
			) {
		
		productoService.save(producto);
		
		return "redirect:/list";
	}

	@RequestMapping(value="/edit/{id}")
	public ModelAndView edit(
			@PathVariable(name="id")
			Long id
			) {
		
		Producto productoAEditar = productoRepository.getOne(id);
		
		ModelAndView modelAndView = new ModelAndView("edit");
		modelAndView.addObject("producto", productoAEditar);
		
		List<TipoProducto> tiposProductos = tipoProductoRepository.findAll();
		
		//cargar el combo de tipo de producto
		modelAndView.addObject("tiposProductos", tiposProductos);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(
			@ModelAttribute(name = "producto")
			Producto producto
			) {
		
		productoRepository.save(producto);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(
			@PathVariable(name = "id")
			Long id
			) {
		
		Producto producto = new Producto();
		producto.setId(id);
		
		productoRepository.delete(producto);
		
		return "redirect:/list";
	}
}
