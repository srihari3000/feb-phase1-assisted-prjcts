import java.util.regex.*;    
import java.util.*;    
public class EmailValidation1{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("srihari@domain.co.in");  
        emails.add("jujjavarapu@domain.com");  
        emails.add("developer.name@domain.com");  
        emails.add("javaTpoint#@domain.co.in");  
        emails.add("need@domain.com");  
        emails.add("encouragement@domaincom");  
         
        emails.add("@yahoo.com");  
        emails.add("javaTpoint#domain.com");  
           
        String regex = "^(.+)@(.+)$";  
         
        Pattern pattern = Pattern.compile(regex);  
         
        for(String email : emails){  
               
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}
