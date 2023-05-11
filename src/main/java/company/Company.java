package company;

public class Company {
	public class CompanyVO {
		private int companyId;
		private String companyName;
		private String companyPw;
		private String companyMan;
		private String companyPhone;
		private String companyAddr;

		public CompanyVO(int companyId, String companyName, String companyPw, String companyMan, String companyPhone,
				String companyAddr) {
			this.companyId = companyId;
			this.companyName = companyName;
			this.companyPw = companyPw;
			this.companyMan = companyMan;
			this.companyPhone = companyPhone;
			this.companyAddr = companyAddr;
		}

		// Constructor without companyId, for use when inserting a new Company row into
		// the table
		public CompanyVO(String companyName, String companyPw, String companyMan, String companyPhone,
				String companyAddr) {
			this.companyName = companyName;
			this.companyPw = companyPw;
			this.companyMan = companyMan;
			this.companyPhone = companyPhone;
			this.companyAddr = companyAddr;
		}
		public int getCompanyId() {
			return companyId;
		}

		public void setCompanyId(int companyId) {
			this.companyId = companyId;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getCompanyPw() {
			return companyPw;
		}

		public void setCompanyPw(String companyPw) {
			this.companyPw = companyPw;
		}

		public String getCompanyMan() {
			return companyMan;
		}

		public void setCompanyMan(String companyMan) {
			this.companyMan = companyMan;
		}

		public String getCompanyPhone() {
			return companyPhone;
		}

		public void setCompanyPhone(String companyPhone) {
			this.companyPhone = companyPhone;
		}

		public String getCompanyAddr() {
			return companyAddr;
		}

		public void setCompanyAddr(String companyAddr) {
			this.companyAddr = companyAddr;
		}
	}

}
