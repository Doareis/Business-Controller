package br.com.bsctrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.bsctrl.dao.UserDAO;
import br.com.bsctrl.entity.User;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(method=RequestMethod.GET, value="/newUser")
	public String newUser() {
		return "newUser";
	}

	@RequestMapping(method=RequestMethod.POST, value="/login")
	public ModelAndView login(String email, String password){
		ModelAndView mav;
		User user = userDAO.getUserByEmail(email);
		if(user != null && user.getPassword().equalsIgnoreCase(password)){
			// TODO colocar usuaria na sessao			
			mav = new ModelAndView("home");
			mav.addObject("loggedUser", user.getName());
		}
		else{
			mav = new ModelAndView("index");
			mav.addObject("message", "User or passoword incorrect");
		}
		return mav;
		
	}
	
	@RequestMapping
	public String index(){
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/addUser")
	public ModelAndView addUser(User user) {
		userDAO.save(user);
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("user", user);
		return mav;
	}
	
}
