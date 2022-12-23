package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table (name="users")
@Entity
public class User {
	@Id
	@SequenceGenerator(name="usuario_id_seq" , allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "usuario_id_seq")
	@OneToMany
	private Integer id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "email")
	private String email;
	
}
