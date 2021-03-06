package com.revature.smp.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "USER_LOCATION")
public class Location implements Serializable {
	
	private static final long serialVersionUID = 6033234014682351342L;
	
	@Id
	@Column(name = "location_id")
	private int locationId;
	
	@Column(name = "location_name")
	private String location;
	
	public Location() {
	}
	
	public Location(int locationId, String location) {
		this.locationId = locationId;
		this.location = location;
	}
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Location [locationId="
				+ locationId
				+ ", location="
				+ location
				+ "]";
	}
	
}