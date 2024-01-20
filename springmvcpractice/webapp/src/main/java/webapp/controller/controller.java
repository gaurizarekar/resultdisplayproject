package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class controller {
	//passing view(passing request to controller to view)
	@GetMapping("/demo")
	public String dislay()
	{
		return "demo";
	}
	
	//getting data from html form (passing request to view to controller)
	@PostMapping("/form")
	public ModelAndView formdata(@RequestParam("name")String name,@RequestParam("lname")String lname)
	{
		ModelAndView m=new ModelAndView();
		if(name.equals("gauri"))
		{
			m.addObject("name",name);
			m.addObject("lastname",lname);
			m.setViewName("display");
			return m;
		}
		else
		{
			m.setViewName("demo");
			return m;
		}
	}
}
