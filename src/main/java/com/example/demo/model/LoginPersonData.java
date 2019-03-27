/**
 * 
 */
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author mohitku
 *
 */

@Data
@Entity
@Table(name="person")
public class LoginPersonData {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String email;
	private String password;

	public LoginPersonData(String email, String password)
	{
		this.email = email;
		this.password = password;
	}
}
