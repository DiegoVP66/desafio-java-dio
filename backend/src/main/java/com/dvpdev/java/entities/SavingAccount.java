package com.dvpdev.java.entities;

public class SavingAccount extends Account {
	private static final long serialVersionUID = 1L;

	public SavingAccount(Client client, Double balance) {
		super(client, balance);
	}

	@Override
	public String printExtract() {
		return "\n=== Extrato Conta poupança ===\n" + super.printExtract();

	}

}
