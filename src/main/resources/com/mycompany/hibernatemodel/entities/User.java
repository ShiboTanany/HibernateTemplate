package com.mycompany.hibernatemodel.entities;
// Generated Apr 22, 2017 12:48:04 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */

public class User  implements java.io.Serializable {


     private Integer userId;
     private Set<ContactsInfo> contactsInfos = new HashSet<ContactsInfo>(0);
     private String userEmail;
     private String userPhone;
     private String username;
     private String userpass;

    public User() {
    }

	
    public User(String userEmail, String userPhone, String username, String userpass) {
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.username = username;
        this.userpass = userpass;
    }
    public User(Set<ContactsInfo> contactsInfos, String userEmail, String userPhone, String username, String userpass) {
       this.contactsInfos = contactsInfos;
       this.userEmail = userEmail;
       this.userPhone = userPhone;
       this.username = username;
       this.userpass = userpass;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Set<ContactsInfo> getContactsInfos() {
        return contactsInfos;
    }

    public void setContactsInfos(Set<ContactsInfo> contactsInfos) {
        this.contactsInfos = contactsInfos;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
   
   


}


