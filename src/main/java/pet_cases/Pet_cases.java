package pet_cases;

import java.sql.Date;

public class Pet_cases {
	private Integer cases_sn;
	private Integer vet_sn;
	private Integer user_id;
	private Date appoint_date;
	private String owner_mobile;
	private String pet_type;
	private String pet_name;
	private Integer pet_gender;
	private Integer pet_age;
	private String pet_situation;
	private String treatment;
	private Integer result;

	public Pet_cases() {

	}

	public Pet_cases(Integer cases_sn, Integer vet_sn, Integer user_id, Date appoint_date, String owner_mobile,
			String pet_type, String pet_name, Integer pet_gender, Integer pet_age, String pet_situation,
			String treatment, Integer result) {
		super();
		this.cases_sn = cases_sn;
		this.vet_sn = vet_sn;
		this.user_id = user_id;
		this.appoint_date = appoint_date;
		this.owner_mobile = owner_mobile;
		this.pet_type = pet_type;
		this.pet_name = pet_name;
		this.pet_gender = pet_gender;
		this.pet_age = pet_age;
		this.pet_situation = pet_situation;
		this.treatment = treatment;
		this.result = result;
	}

	public Integer getCases_sn() {
		return cases_sn;
	}

	public void setCases_sn(Integer cases_sn) {
		this.cases_sn = cases_sn;
	}

	public Integer getVet_sn() {
		return vet_sn;
	}

	public void setVet_sn(Integer vet_sn) {
		this.vet_sn = vet_sn;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Date getAppoint_date() {
		return appoint_date;
	}

	public void setAppoint_date(Date appoint_date) {
		this.appoint_date = appoint_date;
	}

	public String getOwner_mobile() {
		return owner_mobile;
	}

	public void setOwner_mobile(String owner_mobile) {
		this.owner_mobile = owner_mobile;
	}

	public String getPet_type() {
		return pet_type;
	}

	public void setPet_type(String pet_type) {
		this.pet_type = pet_type;
	}

	public String getPet_name() {
		return pet_name;
	}

	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}

	public Integer getPet_gender() {
		return pet_gender;
	}

	public void setPet_gender(Integer pet_gender) {
		this.pet_gender = pet_gender;
	}

	public Integer getPet_age() {
		return pet_age;
	}

	public void setPet_age(Integer pet_age) {
		this.pet_age = pet_age;
	}

	public String getPet_situation() {
		return pet_situation;
	}

	public void setPet_situation(String pet_situation) {
		this.pet_situation = pet_situation;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
}
