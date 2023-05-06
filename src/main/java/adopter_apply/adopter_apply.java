package adopter_apply;
import java.sql.Blob;
import java.sql.Date;

public class adopter_apply {


	    private Integer applyId;
	    private Integer userId;
	    private Integer adopterId;
	    private String adopterName;
	    private String adopterEmail;
	    private Date adopterBirth;
	    private String adopterPhone;
	    private String adopterContactTime;
	    private String adopterAddress;
	    private String adopterCareer;
	    private String adopterMarried;
	    private Integer income;
	    private String homeType;
	    private Integer homeSize;
	    private String homeAnimal;
	    private String plan;
	    private String question;
	    private Blob lifePicture1;
	    private Blob lifePicture2;
	    private Blob lifePicture3;
	    private Date adopterApplyDate;
	    private boolean adopterChecked;
	    
	    
	    
		public adopter_apply(Integer applyId, Integer userId, Integer adopterId, String adopterName, String adopterEmail,
				Date adopterBirth, String adopterPhone, String adopterContactTime, String adopterAddress,
				String adopterCareer, String adopterMarried, Integer income, String homeType, Integer homeSize,
				String homeAnimal, String plan, String question, Blob lifePicture1, Blob lifePicture2, Blob lifePicture3,
				Date adopterApplyDate, boolean adopterChecked) {
			super();
			this.applyId = applyId;
			this.userId = userId;
			this.adopterId = adopterId;
			this.adopterName = adopterName;
			this.adopterEmail = adopterEmail;
			this.adopterBirth = adopterBirth;
			this.adopterPhone = adopterPhone;
			this.adopterContactTime = adopterContactTime;
			this.adopterAddress = adopterAddress;
			this.adopterCareer = adopterCareer;
			this.adopterMarried = adopterMarried;
			this.income = income;
			this.homeType = homeType;
			this.homeSize = homeSize;
			this.homeAnimal = homeAnimal;
			this.plan = plan;
			this.question = question;
			this.lifePicture1 = lifePicture1;
			this.lifePicture2 = lifePicture2;
			this.lifePicture3 = lifePicture3;
			this.adopterApplyDate = adopterApplyDate;
			this.adopterChecked = adopterChecked;
		}
		public Integer getApplyId() {
			return applyId;
		}
		public void setApplyId(Integer applyId) {
			this.applyId = applyId;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public Integer getAdopterId() {
			return adopterId;
		}
		public void setAdopterId(Integer adopterId) {
			this.adopterId = adopterId;
		}
		public String getAdopterName() {
			return adopterName;
		}
		public void setAdopterName(String adopterName) {
			this.adopterName = adopterName;
		}
		public String getAdopterEmail() {
			return adopterEmail;
		}
		public void setAdopterEmail(String adopterEmail) {
			this.adopterEmail = adopterEmail;
		}
		public Date getAdopterBirth() {
			return adopterBirth;
		}
		public void setAdopterBirth(Date adopterBirth) {
			this.adopterBirth = adopterBirth;
		}
		public String getAdopterPhone() {
			return adopterPhone;
		}
		public void setAdopterPhone(String adopterPhone) {
			this.adopterPhone = adopterPhone;
		}
		public String getAdopterContactTime() {
			return adopterContactTime;
		}
		public void setAdopterContactTime(String adopterContactTime) {
			this.adopterContactTime = adopterContactTime;
		}
		public String getAdopterAddress() {
			return adopterAddress;
		}
		public void setAdopterAddress(String adopterAddress) {
			this.adopterAddress = adopterAddress;
		}
		public String getAdopterCareer() {
			return adopterCareer;
		}
		public void setAdopterCareer(String adopterCareer) {
			this.adopterCareer = adopterCareer;
		}
		public String getAdopterMarried() {
			return adopterMarried;
		}
		public void setAdopterMarried(String adopterMarried) {
			this.adopterMarried = adopterMarried;
		}
		public Integer getIncome() {
			return income;
		}
		public void setIncome(Integer income) {
			this.income = income;
		}
		public String getHomeType() {
			return homeType;
		}
		public void setHomeType(String homeType) {
			this.homeType = homeType;
		}
		public Integer getHomeSize() {
			return homeSize;
		}
		public void setHomeSize(Integer homeSize) {
			this.homeSize = homeSize;
		}
		public String getHomeAnimal() {
			return homeAnimal;
		}
		public void setHomeAnimal(String homeAnimal) {
			this.homeAnimal = homeAnimal;
		}
		public String getPlan() {
			return plan;
		}
		public void setPlan(String plan) {
			this.plan = plan;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public Blob getLifePicture1() {
			return lifePicture1;
		}
		public void setLifePicture1(Blob lifePicture1) {
			this.lifePicture1 = lifePicture1;
		}
		public Blob getLifePicture2() {
			return lifePicture2;
		}
		public void setLifePicture2(Blob lifePicture2) {
			this.lifePicture2 = lifePicture2;
		}
		public Blob getLifePicture3() {
			return lifePicture3;
		}
		public void setLifePicture3(Blob lifePicture3) {
			this.lifePicture3 = lifePicture3;
		}
		public Date getAdopterApplyDate() {
			return adopterApplyDate;
		}
		public void setAdopterApplyDate(Date adopterApplyDate) {
			this.adopterApplyDate = adopterApplyDate;
		}
		public boolean isAdopterChecked() {
			return adopterChecked;
		}
		public void setAdopterChecked(boolean adopterChecked) {
			this.adopterChecked = adopterChecked;
		}

	

}
