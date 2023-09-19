package anudeep.org;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Hospital{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int hid;
		private String hname;
		
		@ManyToMany
		@JoinTable(name = "Hospital_Doctors", joinColumns = @JoinColumn(name = "hid"), inverseJoinColumns = @JoinColumn(name = "Did"))

		private Set<Doctors> doctors = new HashSet<Doctors>();

		public Hospital() {
			super();
			// TODO Auto-generated constructor stub

		}

		public int getHid() {
			return hid;
		}

		public void setHid(int hid) {
			this.hid = hid;
		}

		public String getHname() {
			return hname;
		}

		public void setHname(String hname) {
			this.hname = hname;
		}

		public Set<Doctors> getOrders() {
			return doctors;
		}

		public void setdoctors(Set<Doctors>doctors) {
			this.doctors = doctors;
		}
}