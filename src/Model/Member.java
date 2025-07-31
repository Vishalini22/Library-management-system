/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class Member {
    

    
    private String name;
    private String address;
    private String contact;
    private String pass;
     private String membership;
     private Date expiry;
    

    // Constructor
    public Member(String name, String address, String contact, String pass,String membership,Date expiry) {
       
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.pass = pass;
        this.membership = membership;
        this.expiry=expiry;
        
    }

    public Member( String name, String address, String contact, String pass, String membership, String expiry) {
       
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact =contact;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
     public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    
    
    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

   
    
}



