package webapp.controller;


import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import webapp.model.admin;
import webapp.model.studentresult;
import webapp.service.adminservice;

@Controller
public class admincontroller {
@Autowired
adminservice as;
@GetMapping("/alogin")
 public  String adminlogin()
 {
	
	return "alogin";
	 
 }
@PostMapping("/admindata")
public  String getadmindata(@RequestParam("aname")String aname,@RequestParam("psd")String psd,Model m)
{
	int cnt=0;
	admin a=new admin();
	a.setAname(aname);
	a.setPsd(psd);
	List<admin> l=as.insertadmin(a);
	Iterator<admin> i=l.iterator();
	while(i.hasNext())
	{
		admin a2=i.next();
		//System.out.println(a2.getAid());
		if(a2.getAname().equals(a.getAname())&&a2.getPsd().equals(a.getPsd()))
		{
			System.out.println("login");
			cnt++;
			
			 return "adminpage";
			
		}
		
		
	}
	
   if(cnt==0)
   {
	   return "alogin";
   }
return "";
	 
}
@PostMapping("/adminpagedata")
public  String getadminpagedata(@ModelAttribute studentresult sr,Model m)
{
     int id=as.rstudentadd(sr);
     System.out.println(id);
	return "";
	 
}

/*public String homedisplay(int cnt) {
	// TODO Auto-generated method stub
	if(cnt==1)
	{
		return "adminpage";
	}
	else
	{
		return "";
	}
*/

}
