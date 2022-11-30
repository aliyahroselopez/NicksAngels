package com.csb.appadvc.finalproject.NicksAngelsParsells.dto;

import com.csb.appadvc.finalproject.NicksAngelsParsells.model.User;


public class UserDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String emailAddress;

    public UserDTO() {}

    public UserDTO(Long id, String firstName, String lastName, String userName, String password, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.emailAddress = user.getEmailAddress();
    }

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {return userName;}

    public void setUsername(String username) {this.userName = username;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {this.password = password;}

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }



}
