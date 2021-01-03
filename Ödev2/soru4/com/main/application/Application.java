package com.main.application;

import java.util.Scanner;

import com.account.Account;
import com.account.AccountManager;
import com.user.User;



public class Application {

	public static void main(String[] args) {
		
		AccountManager.addAccounts();
		
        Account account = loginMenu();
        if(account == null){
            System.out.println("Wrong email or password\nUser NOT Found");
            return;
        }
        
        System.out.println("Welcom Back Mr." + account.getUser().getName());
        account.showUserInfo();
	}
	
	
	private static Account loginMenu() {
		Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        scanner.close();
        Account account = AccountManager.login(email, password);
        return account;
		
	}

}
