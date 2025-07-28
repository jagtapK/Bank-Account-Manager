package com.practice.Bank_Account_Manager;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bankAccount.Entity.Accounts;
import bankAccount.Utility.bankUtility;

public class UpdateBalance {

	public void updateB() {
		
		SessionFactory factory = bankUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id ");
		int id = sc.nextInt();
		
		Accounts f = session.find(Accounts.class, id);
		System.out.println("Enter Updated Balance");
		
		int balance = sc.nextInt();
		f.setBalance(balance);
		
		transaction.commit();

		session.close();
	}

}
