package clinic_member;

import java.sql.Blob;
import java.sql.Timestamp;

public class Clinic_member {
	 private int clinicId;
	    private String clinicName;
	    private String clinicPrincipal;
	    private String clinicEmail;
	    private String clinicPassword;
	    private String clinicPhone;
	    private Timestamp clinicMemberDate;
	    private String clinicAddress;
	    private Blob clinicPhoto;
	    private String clinicService;
	    
	    public Clinic_member() {
		}

		public Clinic_member(int clinicId, String clinicName, String clinicPrincipal, String clinicEmail,
				String clinicPassword, String clinicPhone, Timestamp clinicMemberDate, String clinicAddress,
				Blob clinicPhoto, String clinicService) {
			super();
			this.clinicId = clinicId;
			this.clinicName = clinicName;
			this.clinicPrincipal = clinicPrincipal;
			this.clinicEmail = clinicEmail;
			this.clinicPassword = clinicPassword;
			this.clinicPhone = clinicPhone;
			this.clinicMemberDate = clinicMemberDate;
			this.clinicAddress = clinicAddress;
			this.clinicPhoto = clinicPhoto;
			this.clinicService = clinicService;
		}

		public int getClinicId() {
			return clinicId;
		}

		public void setClinicId(int clinicId) {
			this.clinicId = clinicId;
		}

		public String getClinicName() {
			return clinicName;
		}

		public void setClinicName(String clinicName) {
			this.clinicName = clinicName;
		}

		public String getClinicPrincipal() {
			return clinicPrincipal;
		}

		public void setClinicPrincipal(String clinicPrincipal) {
			this.clinicPrincipal = clinicPrincipal;
		}

		public String getClinicEmail() {
			return clinicEmail;
		}

		public void setClinicEmail(String clinicEmail) {
			this.clinicEmail = clinicEmail;
		}

		public String getClinicPassword() {
			return clinicPassword;
		}

		public void setClinicPassword(String clinicPassword) {
			this.clinicPassword = clinicPassword;
		}

		public String getClinicPhone() {
			return clinicPhone;
		}

		public void setClinicPhone(String clinicPhone) {
			this.clinicPhone = clinicPhone;
		}

		public Timestamp getClinicMemberDate() {
			return clinicMemberDate;
		}

		public void setClinicMemberDate(Timestamp clinicMemberDate) {
			this.clinicMemberDate = clinicMemberDate;
		}

		public String getClinicAddress() {
			return clinicAddress;
		}

		public void setClinicAddress(String clinicAddress) {
			this.clinicAddress = clinicAddress;
		}

		public Blob getClinicPhoto() {
			return clinicPhoto;
		}

		public void setClinicPhoto(Blob clinicPhoto) {
			this.clinicPhoto = clinicPhoto;
		}

		public String getClinicService() {
			return clinicService;
		}

		public void setClinicService(String clinicService) {
			this.clinicService = clinicService;
		}
 

}
