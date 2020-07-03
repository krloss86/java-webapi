package ar.com.eduacionit.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.educacionit.app.ws.meli.client.CategoriaRestExecutor;
import ar.com.educionit.app.ws.meli.client.dto.cetegory.Categoria;

@Controller
public class MeliController {

	@RequestMapping("/meli/categorias")
	public String meliCategorias(Model model) {
		
		CategoriaRestExecutor cre = new CategoriaRestExecutor("https://api.mercadolibre.com/sites/MLA/categories");
		
		try {
			List<Categoria> categorias =  cre.executeRestCall();
			model.addAttribute("categorias", categorias);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("categorias", new ArrayList<>());
		}
		return "meli_categorias";
	}
}
