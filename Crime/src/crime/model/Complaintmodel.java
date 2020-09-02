package crime.model;

public class Complaintmodel {
	    private int com_id;
		private String com_type;
		private String date;
		private String victim_det;
		private String location;
		private String det_com;
		private String asgd_po;
		private String adm_rmk;
		private String usr_rmk;
		private String status;
	public  Complaintmodel()
	{
		
	}
	
	public  Complaintmodel(int com_id, String com_type, String date, String victim_det, String location, String det_com, String asgd_po, String adm_remk,  String usr_remk, String status)
	{
		this.com_id=com_id;
		this.com_type=com_type;
		this.date=date;
		this.victim_det=victim_det;
		this.location=location;
		this.det_com=det_com;
		this.asgd_po=asgd_po;
		this.adm_rmk=adm_rmk;
		this.usr_rmk=usr_rmk;
		this.status=status;
		
	}

	public  Complaintmodel(int com_id, String com_type, String date, String victim_det, String location, String det_com)
	{
		this.com_id=com_id;
		this.com_type=com_type;
		this.date=date;
		this.victim_det=victim_det;
		this.location=location;
		this.det_com=det_com;
		
		
	}


	public int getCom_id() {
		return com_id;
	}

	public void setCom_id(int n) {
		this.com_id = com_id+n;
	}

	public String getCom_type() {
		return com_type;
	}

	public void setCom_type(String com_type) {
		this.com_type = com_type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVictim_det() {
		return victim_det;
	}

	public void setVictim_det(String victim_det) {
		this.victim_det = victim_det;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDet_com() {
		return det_com;
	}

	public void setDet_com(String det_com) {
		this.det_com = det_com;
	}

	public String getAsgd_po() {
		return asgd_po;
	}

	public void setAsgd_po(String asgd_po) {
		this.asgd_po = asgd_po;
	}

	public String getAdm_rmk() {
		return adm_rmk;
	}

	public void setAdm_rmk(String adm_rmk) {
		this.adm_rmk = adm_rmk;
	}

	public String getUsr_rmk() {
		return usr_rmk;
	}

	public void setUsr_rmk(String usr_rmk) {
		this.usr_rmk = usr_rmk;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
	}
