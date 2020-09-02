package crime.model;

public class Registermodel {
    private String name;
	private String email;
	private String pass;
	private String adds;
	private String ph_no;
	private String gender;
	private String sec_qn;
	private String sec_ans;
	private String utype;
	
	public Registermodel()
	{
		
    }
	
	public Registermodel(String name, String email, String pass, String adds,  String ph_no, String gender, String sec_qn, String sec_ans,String utype)
	{
		this.name=name;
		this.email=email;
		this.pass=pass;
		this.adds=adds;
		this.ph_no=ph_no;
		this.gender=gender;
		this.sec_qn=sec_qn;
		this.sec_ans=sec_ans;
		this.utype=utype;
	}
	public Registermodel(String name, String email,  String adds,  String ph_no, String pass)
	{
		this.name=name;
		this.email=email;
		this.adds=adds;
		this.ph_no=ph_no;
		this.pass=pass;
	}
	public Registermodel(String email, String sec_qn, String sec_ans)
	{
		this.email=email;
		this.sec_qn=sec_qn;
		this.sec_ans=sec_ans;

	}
	 public Registermodel(String email, String pass){
		 this.email=email;
		 this.pass=pass;
	 }
	
	

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAdds() {
		return adds;
	}

	public void setAdds(String adds) {
		this.adds = adds;
	}

	public String getPh_no() {
		return ph_no;
	}

	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSec_qn() {
		return sec_qn;
	}

	public void setSec_qn(String sec_qn) {
		this.sec_qn = sec_qn;
	}

	public String getSec_ans() {
		return sec_ans;
	}

	public void setSec_ans(String sec_ans) {
		this.sec_ans = sec_ans;
	}
	
}
