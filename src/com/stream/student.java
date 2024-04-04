package com.stream;

import java.util.Objects;

public class student implements Comparable<student>{


	private Integer id;
	private String name;
	private String role;
	private Double sal;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, role, sal);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(role, other.role)
				&& Objects.equals(sal, other.sal);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", role=" + role + ", sal=" + sal + "]";
	}
	public student(Integer id, String name, String role, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sal = sal;
	}
	public student() {
		super();
	}

	@Override
	public int compareTo(student o) {
		return o.getName().compareTo(name);
	}
	
	


}
