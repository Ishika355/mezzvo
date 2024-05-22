package emailValidation.emailValidation;

import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// The EmailValidationService class is a Spring service
//  that provides a method for validating email addresses using 
//  regular expressions.
@Service
public class EmailValidationService {
    public boolean isValidEmail(String email) {
        // Regular expression for validating an email address
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);  //This field is an instance of the Pattern class from the java.util.regex package. It is used to compile the regular expression pattern.
        Matcher matcher = pattern.matcher(email); //This field is an instance of the Matcher class from the java.util.regex package. It is used to match the email address against the compiled pattern.
        return matcher.matches();
    }
}
