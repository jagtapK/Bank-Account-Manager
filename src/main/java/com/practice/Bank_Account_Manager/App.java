package com.practice.Bank_Account_Manager;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("Welcome to Bank Account Management ");
        
        System.out.println("Choose an option:" + 
				"\n1. Create New Account" + 
				"\n2. Update Account Balance "+ 
				"\n3. view Account By Id" + 
				"\n4. Close Your Account" +
				"\n5. Exit");
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {

		case 1:
			CreateNewAccount c = new CreateNewAccount();
			c.NewAccount();
			break;
			
		case 2:
			UpdateBalance u = new UpdateBalance();
			u.updateB();
			break;
			
		case 3:
			VeiwAccountById v = new VeiwAccountById();
			v.ById();
			break;
			
		case 4:
			CloseAccount cl = new CloseAccount();
			cl.Close();
			break;
			
		case 5:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Enter valid Choice ");
		}
    }
}
