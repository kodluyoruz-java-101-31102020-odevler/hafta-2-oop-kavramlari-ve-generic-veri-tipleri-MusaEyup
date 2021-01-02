package com.account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.exception.InvalidAuthenticationException;
import com.user.User;

public class AccountManager {
	
	
	private static TreeSet<Account> accounts = new TreeSet<>();
    static {
        User enterpriseUser = new User();
        enterpriseUser.setEmail("selen.demir");
        enterpriseUser.setPassword("1234");
        enterpriseUser.setAddress(new ArrayList<>());
        enterpriseUser.setAge(21);
        enterpriseUser.setName("Selen");
        enterpriseUser.setLastName("Demir");
        enterpriseUser.setJob("student");

        EnterpriseAccount enterpriseAccount = new EnterpriseAccount(enterpriseUser, new ArrayList<>());

        User individualUser =  new User();
        individualUser.setEmail("demir.bakýr");
        individualUser.setPassword("121234");
        individualUser.setAddress(new ArrayList<>());
        individualUser.setAge(11);
        individualUser.setName("demir");
        individualUser.setLastName("bakýr");
        individualUser.setJob("student");
        IndividualAccount individualAccount = new IndividualAccount(individualUser, new ArrayList<>());

        accounts.add(enterpriseAccount);
        accounts.add(individualAccount);
    }

    public static Account login(String email, String password){
        for (Iterator<Account> it = accounts.iterator(); it.hasNext(); ) {
            Account account = it.next();
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
