package com.burakkutbay.controller;

import com.burakkutbay.model.User;
import com.burakkutbay.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private UserValidator userValidator;


    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(userValidator);
    }

    @GetMapping("/")
    public String userForm(Locale locale, Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    /*
     * Save user object
     */
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") @Validated User user, BindingResult result,
                           Model model) {

        if (result.hasErrors()) {
            return "userForm";
        }
        return "success";
    }

}
