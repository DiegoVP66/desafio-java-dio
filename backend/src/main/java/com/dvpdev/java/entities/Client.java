package com.dvpdev.java.entities;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
