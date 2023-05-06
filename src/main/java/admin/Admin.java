package admin;

public class Admin {
	private int adminId;
	private String adminName;
	private String adminAccount;
	private String adminPassword;

	public Admin() {
	}

	public Admin(int adminId, String adminName, String adminAccount, String adminPassword) {
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminAccount = adminAccount;
		this.adminPassword = adminPassword;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminAccount() {
		return adminAccount;
	}

	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
