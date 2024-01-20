package webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class studentresult {
	@Id
private int rid;
private double sub1;
private double sub2;
private double sub3;
private double sub4;
private double sub5;
private int sid;
public studentresult()
{
	
}
public studentresult(int rid, double sub1, double sub2, double sub3, double sub4, double sub5, int sid) {
	super();
	this.rid = rid;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	this.sub4 = sub4;
	this.sub5 = sub5;
	this.sid = sid;
}
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public double getSub1() {
	return sub1;
}
public void setSub1(double sub1) {
	this.sub1 = sub1;
}
public double getSub2() {
	return sub2;
}
public void setSub2(double sub2) {
	this.sub2 = sub2;
}
public double getSub3() {
	return sub3;
}
public void setSub3(double sub3) {
	this.sub3 = sub3;
}
public double getSub4() {
	return sub4;
}
public void setSub4(double sub4) {
	this.sub4 = sub4;
}
public double getSub5() {
	return sub5;
}
public void setSub5(double sub5) {
	this.sub5 = sub5;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}

}
