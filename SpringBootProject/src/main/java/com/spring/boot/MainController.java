package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	UserDetailsRepo repo;
	
	@GetMapping("Login")
	public String Login()
	{
		return "Login";
	}
	@PostMapping("fetchDetails")
	public String InsertDB(UserDetails userdetail)
	{
		repo.save(userdetail);
		return "Login";
		
	}
	@RequestMapping("/getDetails")
	public String RetriveDB()
	{
		return "WelcomePage";
		
	}
	
	@PostMapping("/getDetails")
	@ResponseBody
	public ModelAndView getDetails(@RequestParam("id") int id)
	{
		ModelAndView mv =new ModelAndView("Retrieve");
		UserDetails userdetail =repo.findById(id).orElse(null);
				mv.addObject(userdetail);
				System.out.println(userdetail);
		        return mv;
	   
	}
}
