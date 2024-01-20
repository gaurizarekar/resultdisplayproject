package webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.controller.admincontroller;
import webapp.dao.admindao;
import webapp.model.admin;
import webapp.model.studentresult;

@Service
public class adminservice {
	@Autowired
	admindao ad;
@Autowired
admincontroller ac;
	public List insertadmin(admin a)
	{
		List<admin>l=ad.insertadmin(a);
		return l;
	}
	public int rstudentadd(studentresult sr) {
		// TODO Auto-generated method stub
		int id=ad.rstudent(sr);
		return id;
	}
	
	

}
