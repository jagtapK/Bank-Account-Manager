package com.practice.Bank_Account_Manager;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bankAccount.Entity.Accounts;
import bankAccount.Utility.bankUtility;

public class CreateNewAccount {

	public void NewAccount() {
		
		SessionFactory factory = bankUtility.getSessionFactory();

		// 2. session from session factory
		Session session = factory.openSession();

		// 3.Transaction from session
		Transaction transaction = session.beginTransaction();

		Accounts a = new Accounts();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID: ");

		a.setId(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter your Name: ");
		a.setAccountHolder(sc.nextLine());

		System.out.println("Enter your Account Type: ");
		a.setAccountType(sc.nextLine());

		System.out.println("Enter Account Opened Date: ");
		a.setOpenDate(sc.nextLine());

		System.out.println("Enter your Account Balance");
		a.setBalance(sc.nextInt());

		// 4.save process
		session.persist(a);

		System.out.println("Updated Successfully " + a);
		// 5.pass to database
		transaction.commit();

	}

}
