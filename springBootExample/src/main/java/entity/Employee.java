/**
 * 
 */
package entity;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
*/
/**
 * Created by abhik
 * on 06-Nov-2017
 */
//@Entity
//@Table(name = "employee")
public class Employee {

	private long empNo;
	private String empName;
	private String empCity;
	
//	@Column(name = "emp_no")
	public long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

//	@Column(name = "emp_name")
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

//	@Column(name = "emp_city")
	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
}
