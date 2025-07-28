package com.practice.Bank_Account_Manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bankAccount.Entity.Accounts;
import bankAccount.Utility.bankUtility;

public class VeiwAccountById {

	public void ById() {

		SessionFactory factory = bankUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		List<Accounts> feedback = session.createQuery("Select s from Accounts s", Accounts.class).getResultList();
		feedback.stream().forEach(k -> System.out.println(k.toString()));

		transaction.commit();
		session.close();

	}

}
