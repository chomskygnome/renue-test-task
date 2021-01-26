package io.renue.airports;

public class Airport {
	
	private String  id, title, city, country, abb_0, abb_1, latitude, longitude, type, location, name, group;
	
	public Airport(String  id, String title, String city, String country, String abb_0, String abb_1, String  latitude,
			String  longitude, String type, String location, String name, String group) {
		super();
		this.id = id;
		this.title = title;
		this.city = city;
		this.country = country;
		this.abb_0 = abb_0;
		this.abb_1 = abb_1;
		this.latitude = latitude;
		this.longitude = longitude;
		this.type = type;
		this.location = location;
		this.name = name;
		this.group = group;
	}
	
	
	public String  getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getAbb_0() {
		return abb_0;
	}
	public void setAbb_0(String abb_0) {
		this.abb_0 = abb_0;
	}
	
	public String getAbb_1() {
		return abb_1;
	}
	public void setAbb_1(String abb_1) {
		this.abb_1 = abb_1;
	}
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String  longitude) {
		this.longitude = longitude;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
}
