package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="t_roles")
public class Roles {
	
	@Id
	@GeneratedValue
	@Column(name="c_role_id")
	private int roleId;
	
	@Column(name="c_role_description")
	private String role;
	
	@Column(name="c_created_by")
	private String RolecreatedBY;
	
	@Column(name="c_date_of_creation")
	private String RoleDateCreation;

}
