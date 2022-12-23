package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table (name="bill")
@Entity
public class Bill {
	@Id
	@SequenceGenerator(name="usuario_id_seq" , allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "usuario_id_seq")
	
	private Integer id;
	
	@Column(name = "date_bill")
	private Date username;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Integer user_id;
	
	@Column(name = "value")
	private Integer value;
	
	@Column(name = "type")
	private Integer type;
	
	@Column(name = "observation")
	private String observation;
}
