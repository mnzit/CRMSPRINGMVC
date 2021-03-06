/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.entity;

import com.mnzit.crm.entity.master.FollowUpStatus;
import java.util.Date;

/**
 *
 * @author Mnzit
 */
public class FollowUp {

    private int id;
    private String message;
    private Enquiry enquiry;
    private FollowUpStatus followUpStatus;
    private Date createdDate;
    private boolean deleted;
    private Date deletedDate;

    public FollowUp() {
    }

    public FollowUp(int id) {
        this.id = id;
    }


    public FollowUp(int id, String message, Enquiry enquiry, FollowUpStatus followUpStatus) {
        this.id = id;
        this.message = message;
        this.enquiry = enquiry;
        this.followUpStatus = followUpStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Enquiry getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(Enquiry enquiry) {
        this.enquiry = enquiry;
    }

    public FollowUpStatus getFollowUpStatus() {
        return followUpStatus;
    }

    public void setFollowUpStatus(FollowUpStatus followUpStatus) {
        this.followUpStatus = followUpStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

}
