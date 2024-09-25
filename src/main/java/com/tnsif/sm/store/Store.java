package com.tnsif.sm.store;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Store {
	private Integer id;
	private String name;
	private String category;
	private String contactInfo;
	private String location;
	private Integer operatingHours;
	
	public Store()
	{
		
	}
	public Store(Integer id, String name, String category, String contactInfo, String location,
			Integer operatingHours) {
		
		this.id = id;
		this.name = name;
		this.category = category;
		this.contactInfo = contactInfo;
		this.location = location;
		this.operatingHours = operatingHours;
	}
	//Getter and setter
	@Id
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getOperatingHours() {
		return operatingHours;
	}
	public void setOperatingHours(Integer operatingHours) {
		this.operatingHours = operatingHours;
	}
	
}
