package es.jcyl.colapp.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrincipalCtrl {
	
	
	
	@RequestMapping(value = { "/", "/inicio" }, method = RequestMethod.GET)
	public String welcomePage(Model modelo) {
        modelo.addAttribute("titulo", "ColApp - la aplicación coladero");
        //model.addAttribute("mensaje", "Bienvenid@s a ColApp");
        return "PaginaInicio";
    }
	
	
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String login(Model modelo) {
       
		
       return "login";
   }
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String inicioSession (Model modelo) {
       
		
       return "login";
   }
	

}
