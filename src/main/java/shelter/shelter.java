package shelter;

public class shelter {
		private String shelterName;
		private String shelterAddress;
		private String shelterPhone;
		private String shelterEmail;
		private String shelterPassword;
		private String shelterContact;
		private String contactPhone;

		public shelter(String shelterName, String shelterAddress, String shelterPhone, String shelterEmail,
				String shelterPassword, String shelterContact, String contactPhone) {
			this.shelterName = shelterName;
			this.shelterAddress = shelterAddress;
			this.shelterPhone = shelterPhone;
			this.shelterEmail = shelterEmail;
			this.shelterPassword = shelterPassword;
			this.shelterContact = shelterContact;
			this.contactPhone = contactPhone;
		}
		public String getShelterName() {
			return shelterName;
		}

		public void setShelterName(String shelterName) {
			this.shelterName = shelterName;
		}

		public String getShelterAddress() {
			return shelterAddress;
		}

		public void setShelterAddress(String shelterAddress) {
			this.shelterAddress = shelterAddress;
		}

		public String getShelterPhone() {
			return shelterPhone;
		}

		public void setShelterPhone(String shelterPhone) {
			this.shelterPhone = shelterPhone;
		}

		public String getShelterEmail() {
			return shelterEmail;
		}

		public void setShelterEmail(String shelterEmail) {
			this.shelterEmail = shelterEmail;
		}

		public String getShelterPassword() {
			return shelterPassword;
		}

		public void setShelterPassword(String shelterPassword) {
			this.shelterPassword = shelterPassword;
		}

		public String getShelterContact() {
			return shelterContact;
		}

		public void setShelterContact(String shelterContact) {
			this.shelterContact = shelterContact;
		}

		public String getContactPhone() {
			return contactPhone;
		}

		public void setContactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
		}


	

}
