package emailValidation.emailValidation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailValidationController {

    private final EmailValidationService emailValidationService;

    public EmailValidationController(EmailValidationService emailValidationService) {
        this.emailValidationService = emailValidationService; //// Create an instance of EmailValidationService
    }
// Method that handles the POST request to validate an email address. It calls the isValidEmail method of the
    @PostMapping("/validateEmail/{email}")
    public String validateEmail(@PathVariable String email) {
        if (emailValidationService.isValidEmail(email)) {
            return "Valid email address";
        } else {
            return "Invalid email address";
        }
    }
}
