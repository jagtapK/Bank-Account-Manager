package com.practice.Bank_Account_Manager;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bankAccount.Entity.Accounts;
import bankAccount.Utility.bankUtility;

public class CloseAccount {

	public static void main(String[] args) {
		SessionFactory factory = bankUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id: ");
		String Id = sc.nextLine();
		
		Accounts f1 = session.find(Accounts.class, Id);
		session.remove(f1);
		
		transaction.commit();
		session.close();
	}

}
