package com.murali.springboot.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 7:41:00 PM
 * @version:2.0
 */
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // Create User - in28Minutes/dummy
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("in28Minutes").password("dummy").roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests().antMatchers("/login").permitAll().antMatchers("/", "/*todo*/**")
		.access("hasRole('USER')").and().formLogin();
    }
}
