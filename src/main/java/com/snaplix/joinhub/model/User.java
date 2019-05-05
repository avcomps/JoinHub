package com.snaplix.joinhub.model;

import java.awt.Image;
import java.util.Date;

import javax.persistence.*;

/* The next line defines a new entity called User in the main database */
@Entity
public class User {
	/* The next two lines define the "userID" variable as the main table id, 
	and generate an automatic value for that identifier */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long userID;

	/* The next line defines a new column called "email" assigned to the
	"email" variable, with the mentioned properties */
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	private String name;
	private String surname;
	private String password;
	private Date birthDate;
	private Date subscriptionDate;

	@Transient
	private Image picture;

	private int numLinksShared;
	private float balance;

	public long getID(){
		return this.userID;
	}

	public void setID(long id){
		this.userID = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getSurname(){
		return this.surname;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getSubscriptionDate() {
		return this.subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public Image getPicture() {
		return this.picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}

	public int getNumLinksShared() {
		return this.numLinksShared;
	}

	public void setNumLinksShared(int numLinksShared) {
		this.numLinksShared = numLinksShared;
	}

	public float getBalance() {
		return this.balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString(){
		return "Name: " + this.name + "\nSurname: " + this.surname + 
			"\nE-mail: " + this.email + "\nNum. links shared: " + this.numLinksShared;
	}

	@Override
	public int hashCode() {
		try {
			return (Integer.parseInt(Long.toString(this.userID)) * 2) / 50;
		} catch (Exception e) {
			return 0;
		}
	}
}