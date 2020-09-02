package crime.model;

public class Reportmodel {
	    private String rpt_id;
		private int date_rpt;
		private String rpt_det;
		private String rep_auty;
		
		public Reportmodel()
		{
			
		}
		
		public Reportmodel(String rpt_id, int date_rpt, String rpt_det, String rep_auty)
		{
			this.rpt_id=rpt_id;
			this.date_rpt=date_rpt;
		    this.rpt_det=rpt_det;
		    this.rep_auty=rep_auty;
		}

		public String getRpt_id() {
			return rpt_id;
		}

		public void setRpt_id(String rpt_id) {
			this.rpt_id = rpt_id;
		}

		public int getDate_rpt() {
			return date_rpt;
		}

		public void setDate_rpt(int date_rpt) {
			this.date_rpt = date_rpt;
		}

		public String getRpt_det() {
			return rpt_det;
		}

		public void setRpt_det(String rpt_det) {
			this.rpt_det = rpt_det;
		}

		public String getRep_auty() {
			return rep_auty;
		}

		public void setRep_auty(String rep_auty) {
			this.rep_auty = rep_auty;
		}
		
}
