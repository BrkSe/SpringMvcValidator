package com.burakkutbay.validator;

import com.burakkutbay.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {


    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {

        ValidationUtils.rejectIfEmpty(errors, "name", "empty.name");
        ValidationUtils.rejectIfEmpty(errors, "surname", "empty.surname");
        ValidationUtils.rejectIfEmpty(errors, "email", "empty.email");
        ValidationUtils.rejectIfEmpty(errors, "ability", "empty.ability");

        User user = (User) o;

    }


}
