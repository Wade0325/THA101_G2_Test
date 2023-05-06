package user;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

public class User implements Serializable {
	/**
	 * 右鍵->Source->Generate Getters and Setters可自動建立方法。 右鍵->Source->Generate
	 * Constructor using fields可自動建立建構子。 記得要手動新增一個空的建構子。
	 */
	private Integer userId;
	private String userAccount;
	private String userPassword;
	private String userName;
	private String userGender;
	private Date userBirth;
	private String userTel;
	private String userAddr;
	private String userEmail;
	private Blob userPic;
	private String userRep;
	private String userBan;
	private Date userCreateTime;
	private Date userUpdateTime;
	private String userStatus;

	public User() {

	}

	public User(Integer userId, String userAccount, String userPassword, String userName, String userGender,
			Date userBirth, String userTel, String userAddr, String userEmail, Blob userPic, String userRep,
			String userBan, Date userCreateTime, Date userUpdateTime, String userStatus) {
		this.userId = userId;
		this.userAccount = userAccount;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userGender = userGender;
		this.userBirth = userBirth;
		this.userTel = userTel;
		this.userAddr = userAddr;
		this.userEmail = userEmail;
		this.userPic = userPic;
		this.userRep = userRep;
		this.userBan = userBan;
		this.userCreateTime = userCreateTime;
		this.userUpdateTime = userUpdateTime;
		this.userStatus = userStatus;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Date getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Blob getUserPic() {
		return userPic;
	}

	public void setUserPic(Blob userPic) {
		this.userPic = userPic;
	}

	public String getUserRep() {
		return userRep;
	}

	public void setUserRep(String userRep) {
		this.userRep = userRep;
	}

	public String getUserBan() {
		return userBan;
	}

	public void setUserBan(String userBan) {
		this.userBan = userBan;
	}

	public Date getUserCreateTime() {
		return userCreateTime;
	}

	public void setUserCreateTime(Date userCreateTime) {
		this.userCreateTime = userCreateTime;
	}

	public Date getUserUpdateTime() {
		return userUpdateTime;
	}

	public void setUserUpdateTime(Date userUpdateTime) {
		this.userUpdateTime = userUpdateTime;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

}
