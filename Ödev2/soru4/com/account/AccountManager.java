package com.account;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.address.Address;
import com.exception.InvalidAuthenticationException;
import com.user.User;


public class AccountManager {
	
	
	private static Set<Account> accounts = new TreeSet<>();
   
	public static void addAccounts() {
		 User user = new User("ali", "veli", "ali@gmail.com", "123", "worker", 21, new Date(), new ArrayList<Address>()) ;
		 User user1 = new User("can", "kara", "can@gmail.com", "234", "docktor", 30, new Date(), new ArrayList<Address>()) ;
		 User user2= new User("mehmet", "yılmaz", "mehmet@gmail.com", "345", "engineer", 27, new Date(), new ArrayList<Address>()) ;
		 IndividualAccount account = new IndividualAccount(user, new ArrayList<>());
		 EnterpriseAccount account1 = new EnterpriseAccount(user1, new ArrayList<>());
		 IndividualAccount account2 = new IndividualAccount(user2, new ArrayList<>());
		 
		accounts.add(account);
		accounts.add(account1);
		accounts.add(account2);
		System.out.println(accounts.size());
		
		
	 }
	 
	
	

    public static Account login(String email, String password){
    	
       Iterator<Account> iterator = accounts.iterator();
       
       while(iterator.hasNext()) {
    	   
    	   Account account = iterator.next();
           try{
                account.login(email,password);
                return account;
            }
           catch (InvalidAuthenticationException e){
        	   	
           }
        } 
        return null;
    }
}
