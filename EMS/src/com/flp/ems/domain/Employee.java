package com.flp.ems.domain;

import com.flp.ems.util.Validate;



public class Employee 
{
 String name;
 String kinid;
 String emailid;
 String phoneno;
 String addr;
 String dob;
 String doj;
 String deptid;
 String projid;
 String roleid;
 Validate v=new Validate();
 //int ctr=0;
// private int n;
/* Scanner sc=new Scanner(System.in);
 {
	 System.out.println("Enter no of employees ");
	 int n=sc.nextInt();
  
for(int i=0;i<=n;i++)
{
 System.out.println("Generated employee id is:");
}
 }*/

 
 
	 public String getName() {
		 System.out.println("Validated"+ v.isvalidname(name));
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getKinid() {
	return kinid;
}
public void setKinid(String kinid) {
	this.kinid = kinid;
}
public String getEmailid() {
	System.out.println("Validated"+ v.isvalidEmail(emailid));
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPhoneno() {
	System.out.println("Validated"+ v.  isvalidPhone(phoneno));
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getDob() {
	System.out.println("Validated"+ v.isvalidDate("17") );
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDoj() {
		System.out.println("Validated"+ v.isvalidDate("30") );
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public String getDeptid() {
	System.out.println("Validated"+v.isInt(deptid));
	return deptid;
}
public void setDeptid(String deptid) {
	this.deptid = deptid;
}
public String getProjid() {
	System.out.println("Validated"+v.isInt(projid));
	return projid;
}
public void setProjid(String projid) {
	this.projid = projid;
}
public String getRoleid() {
	System.out.println("Validated"+v.isInt(roleid));
	return roleid;
}
public void setRoleid(String roleid) {
	this.roleid = roleid;
}
/*public int getCtr() {
	return ctr;
}
public void setCtr(int ctr) {
	this.ctr = ctr;
}
public Scanner getSc() {
	return sc;
}
public void setSc(Scanner sc) {
	this.sc = sc;
}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}*/
	
 
/* System.out.println("Enter employee name");
 String name=sc.next();
 }

 {
    System.out.println("Enter employee kinid");
     String kinid=sc.next();
 }

 {
       System.out.println("Enter employee emailid");
        String email=sc.next();
 }
 
 {
      System.out.println("Enter employee phone number");
       int phoneno=sc.nextInt();
 }
 
 {
   System.out.println("Enter employee address");
    String addr=sc.next();
 }
 
 {
      System.out.println("Enter employee date of birth");
	 int dob=sc.nextInt();
	 }
 
 {
     System.out.println("Enter employee date of joining");
	 int doj=sc.nextInt();
	 }
 

 {
     System.out.println("Enter employee dept");
	 int deptid=sc.nextInt();
	 }
 

 {
     System.out.println("Enter employee project");
	 int projid=sc.nextInt();
	 }
 
 {
     System.out.println("Enter employee role");
	 int roleid=sc.nextInt();
	 }*/
 }

