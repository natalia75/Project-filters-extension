package pl.roomate.run.model;

import javax.persistence.*;

@Entity
@Table(name="UserProfile")
public class UserProfile {
		@Id 
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		private String firstName;
	    private String lastName;
	    private String sex;
	    private int age;
	    private String nationality;

	    private int phone;
		private String email;
	    private String address;
		
		private String aboutMe;
		
		private long userPreferenceId;
		private long flatPropertiesId;

		public long getUserPreferenceId() {
			return userPreferenceId;
		}

		public long getFlatPropertiesId() {
			return flatPropertiesId;
		}

		public void setFlatPropertiesId(long flatPropertiesId) {
			this.flatPropertiesId = flatPropertiesId;
		}

		public void setUserPreferenceId(long userPreferenceId) {
			this.userPreferenceId = userPreferenceId;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAboutMe() {
			return aboutMe;
		}

		public void setAboutMe(String aboutMe) {
			this.aboutMe = aboutMe;
		}

		@Override
		public String toString() {
			return "UserProfile [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex
					+ ", age=" + age + ", nationality=" + nationality + ", phone=" + phone + ", email=" + email
					+ ", address=" + address + ", aboutMe=" + aboutMe + ", userPreferenceId=" + userPreferenceId
					+ ", flatPropertiesId=" + flatPropertiesId + "]";
		}
}
