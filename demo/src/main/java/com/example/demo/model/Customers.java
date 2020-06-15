package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table
public class Customers {
	
	@Id
	@Column
	private int cid;
	@Column
	private String cfname;
	@Column
	private String clname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCfname() {
		return cfname;
	}
	public void setCfname(String cfname) {
		this.cfname = cfname;
	}
	public String getClname() {
		return clname;
	}
	public void setClname(String clname) {
		this.clname = clname;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cfname=" + cfname + ", clname=" + clname + "]";
	}
	
	

}
