package com.dvpdev.java.entities;

import java.io.Serializable;

import com.dvpdev.java.entities.exceptions.InsufficientFundsException;
import com.dvpdev.java.impl.AccountImpl;

public class Account implements Serializable, AccountImpl {

	private static final long serialVersionUID = 1L;

	private static final int AGENCY = 1;
	private static int SEQ = 1;

	private Integer agency;
	private Integer number;
	private Double balance;

	private Client client;

	public Account() {
	}

	public Account(Client client, Double balance) {
		this.agency = Account.AGENCY;
		this.number = SEQ++;
		this.client = client;
		this.balance = balance;
	}

	public Integer getAgency() {
		return agency;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public Double withdraw(double value) {

		try {
			if (balance < value || balance <= 0) {
				throw new InsufficientFundsException("Saldo insuficiente!");
			}

			return balance -= value;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public Double deposit(double value) {
		try {
			if (value <= 0) {
				throw new InsufficientFundsException("Valor precisa ser positivo!");
			}

			return balance += value;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Double transfer(double value, AccountImpl account) {
		try {
			if (value <= 0 || balance < value) {
				throw new InsufficientFundsException("Valor de transferência precisa ser positivo!");
			}
			return account.deposit(value);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public String printExtract() {
		return "Titular: " + this.client.getName() + "\nAgencia: " + this.agency + "\nNúmero: " + this.number
				+ String.format("\nSaldo: %.2f", this.balance);

	}

}
