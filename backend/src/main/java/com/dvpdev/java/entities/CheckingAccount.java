package com.dvpdev.java.entities;

public class CheckingAccount extends Account {
	private static final long serialVersionUID = 1L;

	public CheckingAccount(Client client, Double balance) {
		super(client, balance);
	}

	@Override
	public String printExtract() {
		return "\n=== Extrato Conta Corrente ===\n" + super.printExtract();

	}

}
