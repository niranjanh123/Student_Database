package student_assist_database2;

public class Studentblood {
	  String empid;
	  String empbranc;
	  String empname;
	  String empsem;
	  String empsec;
	  String empgender;
	  String empho;
	  public Studentblood() {}
	  public Studentblood(String empid, String empbranc,String empname,  String empsem,String empsec, String empgender,  String empho) {
		  this.empid=empid;
		  this.empbranc=empbranc;
		  this.empname=empname;
		  this.empsem=empsem;
		  this.empsec=empsec;
		  this.empgender=empgender;
		  this.empho=empho;
	  }
	public String getEmpho() {
		return empho;
	}
	public void setEmpho(String empho) {
		this.empho = empho;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpbranc() {
		return empbranc;
	}
	public void setEmpbranc(String empbranc) {
		this.empbranc = empbranc;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpsem() {
		return empsem;
	}
	public void setEmpsem(String empsem) {
		this.empsem = empsem;
	}
	public String getEmpsec() {
		return empsec;
	}
	public void setEmpsec(String empsec) {
		this.empsec = empsec;
	}
	public String getEmpgender() {
		return empgender;
	}
	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}
}
