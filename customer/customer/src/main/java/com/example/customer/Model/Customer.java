package com.example.customer.Model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String custfname;
	@Column
	private String custlname;
	@Column
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustfname() {
		return custfname;
	}
	public void setCustfname(String custfname) {
		this.custfname = custfname;
	}
	public String getCustlname() {
		return custlname;
	}
	public void setCustlname(String custlname) {
		this.custlname = custlname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
