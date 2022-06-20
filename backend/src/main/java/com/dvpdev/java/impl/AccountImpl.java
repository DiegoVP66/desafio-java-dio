package com.dvpdev.java.impl;

public interface AccountImpl {
	
	Double withdraw(double value);

	Double deposit(double value);

	Double transfer(double value, AccountImpl account);

	String printExtract();

}
