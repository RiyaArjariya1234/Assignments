package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("ob")
@Scope("prototype")
public class Student {
        @Value("Ria Arjaria")
	    private String StudentName;
        @Value("Lucknow")
	    private String city;
        
        @Value("#{temp}")
        private List<String> address;
		public String getStudentName() {
			return StudentName;
		}
		public void setStudentName(String studentName) {
			StudentName = studentName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public List<String> getAddress() {
			return address;
		}
		public void setAddress(List<String> address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [StudentName=" + StudentName + ", city=" + city + "]";
		}
	    
}
