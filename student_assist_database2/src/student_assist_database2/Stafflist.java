package student_assist_database2;

public class Stafflist {
  String staffname;
  String dptname;
  String phone_no;
  public void Stafflist() {}
  public void Stafflist(String name,String dpt,String pho) {
	  staffname=name;
	  dptname=dpt;
	  phone_no=pho;
  }
public String getStaffname() {
	return staffname;
}
public void setStaffname(String staffname) {
	this.staffname = staffname;
}
public String getDptname() {
	return dptname;
}
public void setDptname(String dptname) {
	this.dptname = dptname;
}
public String getPhone_no() {
	return phone_no;
}
public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}
  
}
