package com.murali.springboot.web.model;

import java.util.Date;

import javax.validation.constraints.Size;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 7:39:36 PM
 * @version:2.0
 */

public class Todo {

    private int id;
    private String user;

    @Size(min = 10, message = "Enter at least 10 Characters...")
    private String desc;

    private Date targetDate;
    private boolean isDone;

    public Todo() {
	super();
    }

    /**
     * @param id
     * @param user
     * @param desc
     * @param targetDate
     * @param isDone
     */
    public Todo(int id, String user, @Size(min = 10, message = "Enter at least 10 Characters...") String desc,
	    Date targetDate, boolean isDone) {
	super();
	this.id = id;
	this.user = user;
	this.desc = desc;
	this.targetDate = targetDate;
	this.isDone = isDone;
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
     * @return the user
     */
    public String getUser() {
	return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
	this.user = user;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
	return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
	this.desc = desc;
    }

    /**
     * @return the targetDate
     */
    public Date getTargetDate() {
	return targetDate;
    }

    /**
     * @param targetDate the targetDate to set
     */
    public void setTargetDate(Date targetDate) {
	this.targetDate = targetDate;
    }

    /**
     * @return the isDone
     */
    public boolean isDone() {
	return isDone;
    }

    /**
     * @param isDone the isDone to set
     */
    public void setDone(boolean isDone) {
	this.isDone = isDone;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Todo other = (Todo) obj;
	if (id != other.id) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return String.format("Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id, user, desc, targetDate,
		isDone);
    }
}
