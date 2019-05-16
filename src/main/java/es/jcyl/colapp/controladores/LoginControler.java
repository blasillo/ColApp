package es.jcyl.colapp.controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginControler {
	
	Logger logger = LoggerFactory.getLogger(LoginControler.class);
	
	@RequestMapping(value = { "/", "/inicio" }, method = RequestMethod.GET)
	public String welcomePage(Model modelo) {
        modelo.addAttribute("titulo", "ColApp - la aplicación coladero");
        //model.addAttribute("mensaje", "Bienvenid@s a Col-App-Dero");
        return "PaginaInicio";
    }
	
	
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String getLogin (HttpServletRequest request, Model modelo ) {
		
		
		logger.info ("Entrada login GET:" + request.getParameter("login")   );
		
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		modelo.addAttribute("login", login);		
		
		modelo.addAttribute("error" , login + " no válido.");
		
		return "login";
   }
	
	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String logout (Model modelo  ) {
		
		logger.info ("Entrada logout");
		
		return "redirect:/inicio";
	}
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String postLogin (HttpServletRequest request, Model modelo ) {
		
		
		
		logger.info ("Entrada login POST:" + request.getParameter("login")   );
		
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		modelo.addAttribute("login", login);		
		
		modelo.addAttribute("error" , login + " no válido.");
		 
		return "login";
	}
	
	

}
