package bankAccount.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class bankUtility {
	
	private static SessionFactory factory;
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory = new Configuration().configure("BankAccount.cfg.xml")
					.buildSessionFactory();
		}
		return factory;
	}
}
