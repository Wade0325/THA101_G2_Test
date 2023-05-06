package report_firm;

import java.sql.Timestamp;

public class Report_firm {
	private Integer firm_sn;
	private Integer user_id;
	private Integer company_id;
	private String frim_content;
	private Timestamp firm_date;
	private String confrim_code;

	public Report_firm() {

	}

	public Report_firm(Integer firm_sn, Integer user_id, Integer company_id, String frim_content, String confrim_code) {
		super();
		this.firm_sn = firm_sn;
		this.user_id = user_id;
		this.company_id = company_id;
		this.frim_content = frim_content;
//		this.firm_date = firm_date;
		this.confrim_code = confrim_code;
	}

	@Override
	public String toString() {
		return "ReportFirmVO [firm_sn=" + firm_sn + ", user_id=" + user_id + ", company_id=" + company_id
				+ ", frim_content=" + frim_content + ", firm_date=" + firm_date + ", confrim_code=" + confrim_code
				+ "]";
	}

	public int getFirm_sn() {
		return firm_sn;
	}

	public void setFirm_sn(int firm_sn) {
		this.firm_sn = firm_sn;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getFrim_content() {
		return frim_content;
	}

	public void setFrim_content(String frim_content) {
		this.frim_content = frim_content;
	}

	public Timestamp getFirm_date() {
		return firm_date;
	}

	public void setFirm_date(Timestamp firm_date) {
		this.firm_date = firm_date;
	}

	public String getConfrim_code() {
		return confrim_code;
	}

	public void setConfrim_code(String confrim_code) {
		this.confrim_code = confrim_code;
	}
}
