package com.springcore.auto.wire.annotation;



public class Emp {
    @Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
    
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
