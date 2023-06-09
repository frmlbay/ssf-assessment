package vttp2023.batch3.ssf.frontcontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import vttp2023.batch3.ssf.frontcontroller.model.Person;
import vttp2023.batch3.ssf.frontcontroller.services.AuthenticationService;

@Controller
@RequestMapping(path="/")
public class FrontController {

	// TODO: Task 2, Task 3, Task 4, Task 6

	@Autowired

	HttpSession session;
	int failcount = 0;

	@GetMapping("/{login}")
	public String user(Model user, HttpSession session){
		Person p = (Person)session.getAttribute("username");
		if(p==null){
			failcount++;
			return "login";
		}

	}

	// @GetMapping("/{username}")
	// public String 

	//@PostMapping(consumes="application/x-www-form-urlencoded", path="/user")


	@RequestMapping("/{logout}")
	public String logOut{
		if (session != null){
			session.invalidate();
		}

		return "login";

	}
	


	//garbage
	// (consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	// @PostMapping(path="/login")
	// public String postLogin(Model m, HttpSession session, @Valid AuthenticationService user, BindingResult result){
	// 	if(result.hasErrors()){
	// 		return "view0";
	// 	}
	// }
	
}
