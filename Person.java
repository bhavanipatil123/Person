package com.ty.project1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
    private int id;
	private String name;  
    private String add;
    private long phno;
@OneToOne
private PanCard pancards;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public PanCard getPancards() {
	return pancards;
}
public void setPancards(PanCard pancards) {
	this.pancards = pancards;
}

}
