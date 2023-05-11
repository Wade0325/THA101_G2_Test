package vet;

public class Vet {
	private Integer vet_sn;
	private Integer clinic_id;
	private String vet_name;
	private Integer vet_gender;
	private String specialty;
	private Integer seniority;

	public Vet() {

	}

	public Vet(Integer vet_sn, Integer clinic_id, String vet_name, Integer vet_gender, String specialty,
			Integer seniority) {
		super();
		this.vet_sn = vet_sn;
		this.clinic_id = clinic_id;
		this.vet_name = vet_name;
		this.vet_gender = vet_gender;
		this.specialty = specialty;
		this.seniority = seniority;
	}

	public Integer getVet_sn() {
		return vet_sn;
	}

	public void setVet_sn(Integer vet_sn) {
		this.vet_sn = vet_sn;
	}

	public Integer getClinic_id() {
		return clinic_id;
	}

	public void setClinic_id(Integer clinic_id) {
		this.clinic_id = clinic_id;
	}

	public String getVet_name() {
		return vet_name;
	}

	public void setVet_name(String vet_name) {
		this.vet_name = vet_name;
	}

	public Integer getVet_gender() {
		return vet_gender;
	}

	public void setVet_gender(Integer vet_gender) {
		this.vet_gender = vet_gender;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Integer getSeniority() {
		return seniority;
	}

	public void setSeniority(Integer seniority) {
		this.seniority = seniority;
	}

}
