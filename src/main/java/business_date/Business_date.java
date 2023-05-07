package business_date;

public class Business_date {
	private Integer businessSn;
    private Integer clinicId;
    private Integer vetSn;
    private Integer weekDate;
    private Integer morningBusiness;
    private Integer morningAppoIntegerMax;
    private Integer afternoonBusiness;
    private Integer afternoonAppoIntegerMax;
    private Integer nightBusiness;
    private Integer nightAppoIntegerMax;
	
    public Business_date() {
  
	}

	public Business_date(Integer businessSn, Integer clinicId, Integer vetSn, Integer weekDate, Integer morningBusiness,
			Integer morningAppoIntegerMax, Integer afternoonBusiness, Integer afternoonAppoIntegerMax,
			Integer nightBusiness, Integer nightAppoIntegerMax) {
		super();
		this.businessSn = businessSn;
		this.clinicId = clinicId;
		this.vetSn = vetSn;
		this.weekDate = weekDate;
		this.morningBusiness = morningBusiness;
		this.morningAppoIntegerMax = morningAppoIntegerMax;
		this.afternoonBusiness = afternoonBusiness;
		this.afternoonAppoIntegerMax = afternoonAppoIntegerMax;
		this.nightBusiness = nightBusiness;
		this.nightAppoIntegerMax = nightAppoIntegerMax;
	}

	public Integer getBusinessSn() {
		return businessSn;
	}

	public void setBusinessSn(Integer businessSn) {
		this.businessSn = businessSn;
	}

	public Integer getClinicId() {
		return clinicId;
	}

	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}

	public Integer getVetSn() {
		return vetSn;
	}

	public void setVetSn(Integer vetSn) {
		this.vetSn = vetSn;
	}

	public Integer getWeekDate() {
		return weekDate;
	}

	public void setWeekDate(Integer weekDate) {
		this.weekDate = weekDate;
	}

	public Integer getMorningBusiness() {
		return morningBusiness;
	}

	public void setMorningBusiness(Integer morningBusiness) {
		this.morningBusiness = morningBusiness;
	}

	public Integer getMorningAppoIntegerMax() {
		return morningAppoIntegerMax;
	}

	public void setMorningAppoIntegerMax(Integer morningAppoIntegerMax) {
		this.morningAppoIntegerMax = morningAppoIntegerMax;
	}

	public Integer getAfternoonBusiness() {
		return afternoonBusiness;
	}

	public void setAfternoonBusiness(Integer afternoonBusiness) {
		this.afternoonBusiness = afternoonBusiness;
	}

	public Integer getAfternoonAppoIntegerMax() {
		return afternoonAppoIntegerMax;
	}

	public void setAfternoonAppoIntegerMax(Integer afternoonAppoIntegerMax) {
		this.afternoonAppoIntegerMax = afternoonAppoIntegerMax;
	}

	public Integer getNightBusiness() {
		return nightBusiness;
	}

	public void setNightBusiness(Integer nightBusiness) {
		this.nightBusiness = nightBusiness;
	}

	public Integer getNightAppoIntegerMax() {
		return nightAppoIntegerMax;
	}

	public void setNightAppoIntegerMax(Integer nightAppoIntegerMax) {
		this.nightAppoIntegerMax = nightAppoIntegerMax;
	}

}
