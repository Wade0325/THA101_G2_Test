package animal;
import java.util.Date;
import java.sql.Blob;

public class animal {

	
	    private Integer animalId;
	    private Integer userId;
	    private String animalName;
	    private String animalType;
	    private String animalCategory;
	    private String animalColor;
	    private String animalGender;
	    private Date animalDate;
	    private Integer animalAge;
	    private Blob animalPhoto1;
	    private Blob animalPhoto2;
	    private Blob animalPhoto3;
	    private String animalDescribe;
	    private boolean adopt;
	    private boolean ifAdopted;
	    
	    
		public animal(Integer animalId, Integer userId, String animalName, String animalType, String animalCategory,
				String animalColor, String animalGender, Date animalDate, Integer animalAge, Blob animalPhoto1,
				Blob animalPhoto2, Blob animalPhoto3, String animalDescribe, boolean adopt, boolean ifAdopted) {
			super();
			this.animalId = animalId;
			this.userId = userId;
			this.animalName = animalName;
			this.animalType = animalType;
			this.animalCategory = animalCategory;
			this.animalColor = animalColor;
			this.animalGender = animalGender;
			this.animalDate = animalDate;
			this.animalAge = animalAge;
			this.animalPhoto1 = animalPhoto1;
			this.animalPhoto2 = animalPhoto2;
			this.animalPhoto3 = animalPhoto3;
			this.animalDescribe = animalDescribe;
			this.adopt = adopt;
			this.ifAdopted = ifAdopted;
		}
		public Integer getAnimalId() {
			return animalId;
		}
		public void setAnimalId(Integer animalId) {
			this.animalId = animalId;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getAnimalName() {
			return animalName;
		}
		public void setAnimalName(String animalName) {
			this.animalName = animalName;
		}
		public String getAnimalType() {
			return animalType;
		}
		public void setAnimalType(String animalType) {
			this.animalType = animalType;
		}
		public String getAnimalCategory() {
			return animalCategory;
		}
		public void setAnimalCategory(String animalCategory) {
			this.animalCategory = animalCategory;
		}
		public String getAnimalColor() {
			return animalColor;
		}
		public void setAnimalColor(String animalColor) {
			this.animalColor = animalColor;
		}
		public String getAnimalGender() {
			return animalGender;
		}
		public void setAnimalGender(String animalGender) {
			this.animalGender = animalGender;
		}
		public Date getAnimalDate() {
			return animalDate;
		}
		public void setAnimalDate(Date animalDate) {
			this.animalDate = animalDate;
		}
		public Integer getAnimalAge() {
			return animalAge;
		}
		public void setAnimalAge(Integer animalAge) {
			this.animalAge = animalAge;
		}
		public Blob getAnimalPhoto1() {
			return animalPhoto1;
		}
		public void setAnimalPhoto1(Blob animalPhoto1) {
			this.animalPhoto1 = animalPhoto1;
		}
		public Blob getAnimalPhoto2() {
			return animalPhoto2;
		}
		public void setAnimalPhoto2(Blob animalPhoto2) {
			this.animalPhoto2 = animalPhoto2;
		}
		public Blob getAnimalPhoto3() {
			return animalPhoto3;
		}
		public void setAnimalPhoto3(Blob animalPhoto3) {
			this.animalPhoto3 = animalPhoto3;
		}
		public String getAnimalDescribe() {
			return animalDescribe;
		}
		public void setAnimalDescribe(String animalDescribe) {
			this.animalDescribe = animalDescribe;
		}
		public boolean isAdopt() {
			return adopt;
		}
		public void setAdopt(boolean adopt) {
			this.adopt = adopt;
		}
		public boolean isIfAdopted() {
			return ifAdopted;
		}
		public void setIfAdopted(boolean ifAdopted) {
			this.ifAdopted = ifAdopted;
		}

	
	    

}
