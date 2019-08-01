package com.heroku.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    
	@NotEmpty
    private String userName;
    
    @NotEmpty
    private String passoword;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getPassoword() {
		return passoword;
	}

	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}

	
    
    

}
