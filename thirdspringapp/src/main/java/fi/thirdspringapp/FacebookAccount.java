package fi.thirdspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("objFacebookAccount")
public class FacebookAccount {
	@Autowired(required = true)
	User userDetails;
	
	boolean privateProfile;
	boolean businessAccount;
	public User getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}
	public boolean isPrivateProfile() {
		return privateProfile;
	}
	public void setPrivateProfile(boolean privateProfile) {
		this.privateProfile = privateProfile;
	}
	public boolean isBusinessAccount() {
		return businessAccount;
	}
	public void setBusinessAccount(boolean businessAccount) {
		this.businessAccount = businessAccount;
	}
	
	
}
