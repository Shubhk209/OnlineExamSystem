package model;

public class UserMarks {
	
	
	private int mark_ob;
	private int total_mk;
	private String username;
	private int user_id;
	
	//Setter and getter of mark obtained
	public int getMark_ob() {
		return mark_ob;
	}
	public void setMark_ob(int mark_ob) {
		this.mark_ob = mark_ob;
		System.out.println("mark obtained avlue in model: "+this.mark_ob);
	}
	
	//setter getter of total marks
	public int getTotal_mk() {
		return total_mk;
	}
	public void setTotal_mk(int total_mk) {
		this.total_mk = total_mk;
		System.out.println("total mark value in usermarks model: "+this.total_mk);
	}
	
	// setter and getter of username
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		System.out.println("username value in usermarks model: "+this.username);
	}
	
	//setter and getter of userid
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
		System.out.println("userid value in usermarks model: "+this.user_id);
	}
	

}
