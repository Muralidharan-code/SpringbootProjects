package com.murali.springboot.web.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 7:38:44 PM
 * @version:2.0
 */
@Controller
public class WelcomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model) {
	model.put("name", getLoggedinUserName());
	return "welcome";
    }

    private String getLoggedinUserName() {
	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	if (principal instanceof UserDetails) {
	    return ((UserDetails) principal).getUsername();
	}

	return principal.toString();
    }
}
