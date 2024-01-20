package webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class admin {
	@Id
	@GeneratedValue
	private int aid;
	private String aname;
	private String psd;
	public admin(int aid, String aname, String psd) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.psd = psd;
	}
	public admin() {
		// TODO Auto-generated constructor stub
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	
}
