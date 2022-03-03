package fi.thirdspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfigurator.class);
        
        FacebookAccount account = (FacebookAccount)context.getBean("newFacebookAccount");
        
        User objUser = account.getUserDetails();
        System.out.println(objUser.getUserName());
        System.out.println(objUser.getName());
        System.out.println(objUser.getEmail());
        
    }
}
