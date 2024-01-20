package webapp.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import webapp.model.admin;
import webapp.model.studentresult;
import webapp.service.adminservice;

@Repository
public class admindao {
@Autowired
HibernateTemplate ht;
@Autowired
adminservice as;
   @Transactional
	public List insertadmin(admin a) {
	 //  ModelAndView m=new ModelAndView();
		// TODO Auto-generated method stub
	   //Integer cnt=0;
      List<admin>l=ht.loadAll(admin.class);
	  return l;
	}
   @Transactional
public int rstudent(studentresult sr) {
	// TODO Auto-generated method stub
	int id=(int) ht.save(sr);
	return id;
}
  

}
