package com.murali.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 23, 2019 8:39:42 PM
 * @version:2.0
 */
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User {

    private int id;
    private String country;
    private String name;

    public User() {
	id = 0;
    }

    /**
     * @param id
     * @param country
     * @param name
     */
    public User(int id, String country, String name) {
	super();
	this.id = id;
	this.country = country;
	this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the country
     */
    public String getCountry() {
	return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
	this.country = country;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

}
