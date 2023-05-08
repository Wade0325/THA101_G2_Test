package clinic_appointment;

import java.sql.Date;

public class Clinic_appointment {
	private Integer reservation_number;
	private Integer card_id;
	private Integer clinic_id;
	private String vet_name;
	private Date appoint_date;
	private Integer appoint_time;
	private String owner_mobile;
	private String pet_type;
	private String pet_name;
	private Integer service_item;
	private Integer user_id;
	private String pet_situation;

	public Clinic_appointment() {

	}

	public Clinic_appointment(Integer reservation_number, Integer card_id, Integer clinic_id, String vet_name,
			Date appoint_date, Integer appoint_time, String owner_mobile, String pet_type, String pet_name,
			Integer service_item, Integer user_id, String pet_situation) {
		super();
		this.reservation_number = reservation_number;
		this.card_id = card_id;
		this.clinic_id = clinic_id;
		this.vet_name = vet_name;
		this.appoint_date = appoint_date;
		this.appoint_time = appoint_time;
		this.owner_mobile = owner_mobile;
		this.pet_type = pet_type;
		this.pet_name = pet_name;
		this.service_item = service_item;
		this.user_id = user_id;
		this.pet_situation = pet_situation;
	}

	public Integer getReservation_number() {
		return reservation_number;
	}

	public void setReservation_number(Integer reservation_number) {
		this.reservation_number = reservation_number;
	}

	public Integer getCard_id() {
		return card_id;
	}

	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
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

	public Date getAppoint_date() {
		return appoint_date;
	}

	public void setAppoint_date(Date appoint_date) {
		this.appoint_date = appoint_date;
	}

	public Integer getAppoint_time() {
		return appoint_time;
	}

	public void setAppoint_time(Integer appoint_time) {
		this.appoint_time = appoint_time;
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

	public Integer getService_item() {
		return service_item;
	}

	public void setService_item(Integer service_item) {
		this.service_item = service_item;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getPet_situation() {
		return pet_situation;
	}

	public void setPet_situation(String pet_situation) {
		this.pet_situation = pet_situation;
	}

}
