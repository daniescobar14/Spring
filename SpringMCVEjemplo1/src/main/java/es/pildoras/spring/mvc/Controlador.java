package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	//encargado de especificar que vista es la que se va a mostrar en cada caso
	
	@RequestMapping //es el metodo encargado de decir cual es la vista que queremos ver, de esto se encarga la anotacion
	
	public String muestraPagina(){
		return "paginaEjemplo";
	}

}
