package anudeep.org;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctors {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hid;
	private int fee;
	private String dName;
	
	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@ManyToMany(mappedBy="doctors")
	
	Set<Hospital> doctorsset=new HashSet<Hospital>();

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	
}