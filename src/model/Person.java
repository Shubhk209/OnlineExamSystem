package model;

public class Person {

	private String Pname;
	private String Ppass;
	private String Pfname;
	private String Pemail;
	private String PCname;
	
	
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
		System.out.println("pname of person set-"+Pname);
	}
	public String getPpass() {
		return Ppass;
	}
	public void setPpass(String ppass) {
		Ppass = ppass;
		System.out.println("pwd of person set-"+Ppass);
	}
	public String getPfname() {
		return Pfname;
	
	}
	public void setPfname(String pfname) {
		Pfname = pfname;
		System.out.println("full name of person set-"+Pfname);
	}
	public String getPemail() {
		return Pemail;
	}
	public void setPemail(String pemail) {
		Pemail = pemail;
		System.out.println("email of person set-"+Pemail);
	}
	public String getPCname() {
		return PCname;
	}
	public void setPCname(String pCname) {
		PCname = pCname;
		System.out.println("collagename of person set-"+PCname);
	}	
	
	
		
}
