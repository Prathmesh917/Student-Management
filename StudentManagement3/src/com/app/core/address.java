package com.app.core;

import java.io.Serializable;

public class address implements Serializable {
private String city,state,PhoneNumber;

public address(String city, String state, String phoneNumber) {
	super();
	this.city = city;
	this.state = state;
	PhoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "address [city=" + city + ", state=" + state + ", PhoneNumber=" + PhoneNumber + "]";
}

}
