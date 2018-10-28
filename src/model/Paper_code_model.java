package model;

public class Paper_code_model {
	
	private String p_code;
	private String p_link;

	public String getP_link() {
		return p_link;
	}

	public void setP_link(String p_link) {
		this.p_link = p_link;
		System.out.println("set plink at model"+p_link);
		
	}

	public String getP_code() {
		return p_code;
	}

	public void setP_code(String p_code) {
		this.p_code = p_code;
		System.out.println("set pcode at model"+ p_code);
		
	}
	
	

}
