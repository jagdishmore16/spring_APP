package fi.thirdspringapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfigurator {
		@Bean
		public User userDetails(@Value("testuser")String pUserName,
				@Value("testpwd")String pPasssword,
				@Value("Test User")String pName,
				@Value("test@test.com")String pEmail)
		{
			User objUser = new User();
			
			
			objUser.setUserName(pUserName);
			objUser.setPasssword(pPasssword);
			objUser.setName(pName);
			objUser.setEmail(pEmail);
			
//			objUser.setUserName("jagdish");
//			objUser.setPasssword("jp0316");
//			objUser.setName("jagdish");
//			objUser.setEmail("jagish@gmail.com");
			return objUser;
		}
		@Bean
		public FacebookAccount newFacebookAccount()
		{
			return new FacebookAccount();
		}
}
