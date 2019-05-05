package com.snaplix.joinhub.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ReferralCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codeID;

    private String codeURI;

    @Transient
    private User publisher;

    private String title;
    private String category;
    private String description;
    private Date publicationDate;
    private Date expDate;
    private int views;

    public ReferralCode(){
        
    }
    
    public long getCodeID() {
        return this.codeID;
    }

    public void setCodeID(long codeID) {
        this.codeID = codeID;
    }

    public String getCodeURI() {
        return this.codeURI;
    }

    public void setCodeURI(String codeURI) {
        this.codeURI = codeURI;
    }

    public User getPublisher() {
        return this.publisher;
    }

    public void setPublisher(User publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Date getExpDate() {
        return this.expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    
}