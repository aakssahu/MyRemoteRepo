package com.flp.ems.domain;

public class Project {
 int Projectid;
 String name;
 String desc;
 int deptid;
public int getProjectid() {
	return Projectid;
}
public void setProjectid(int projectid) {
	Projectid = projectid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
 
}
