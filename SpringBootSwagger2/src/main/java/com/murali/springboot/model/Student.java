package com.murali.springboot.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 6:55:19 PM
 * @version:2.0
 */
public class Student {

    @ApiModelProperty(notes = "Name of the Student", name = "name", required = true, value = "test name")
    private String name;
    @ApiModelProperty(notes = "Class of the Student", name = "cls", required = true, value = "test class")
    private String cls;
    @ApiModelProperty(notes = "Country of the Student", name = "country", required = true, value = "test country")
    private String country;

    /**
     * @param name
     * @param cls
     * @param country
     */
    public Student(String name, String cls, String country) {
	super();
	this.name = name;
	this.cls = cls;
	this.country = country;
    }

    public String getName() {
	return name;
    }

    public String getCls() {
	return cls;
    }

    public String getCountry() {
	return country;
    }

    @Override
    public String toString() {
	return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
    }
}
