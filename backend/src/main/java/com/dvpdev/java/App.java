package com.dvpdev.java;

import java.util.ArrayList;
import java.util.List;

import com.dvpdev.java.entities.Account;
import com.dvpdev.java.entities.CheckingAccount;
import com.dvpdev.java.entities.Client;
import com.dvpdev.java.entities.SavingAccount;

public class App {
	public static void main(String[] args) {
		Client client = new Client();
		client.setName("Diego");

		Account account = new Account(client, 200.0);
		account.withdraw(100.0);

		Account account2 = new CheckingAccount(client, 200.0);
		account2.withdraw(200.0);
		account2.deposit(50.0);

		Account account3 = new SavingAccount(client, 0.0);
		account.transfer(80, account3);

		List<Account> accounts = new ArrayList<>();
		accounts.add(account);
		accounts.add(account2);
		accounts.add(account3);

		for (Account x : accounts) {
			System.out.println(x.printExtract());
		}

	}
}
