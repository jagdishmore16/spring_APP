package fi.thirdspringapp;

import org.springframework.stereotype.Component;

@Component
public class User {

		String userName;
		String passsword;
		String name;
		String email;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPasssword() {
			return passsword;
		}
		public void setPasssword(String passsword) {
			this.passsword = passsword;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
