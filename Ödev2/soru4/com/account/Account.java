package com.account;

import java.util.Date;
import java.util.List;

import com.address.Address;
import com.address.AddressManager;
import com.authentication.AuthenticationStatus;
import com.exception.InvalidAuthenticationException;
import com.insurance.Insurance;
import com.user.User;



public abstract class Account {

	private User user;
	private List<Insurance> insuranceList;
	private AuthenticationStatus authenticationStatus ;
	
	
	
	public Account(User user, List<Insurance> insuranceList) {
		super();
		this.user = user;
		this.insuranceList = insuranceList;
	}

	final public void showUserInfo() {
		System.out.println(user.showUserInfo());
		
	}
	
	public void login(String mail, String password) throws InvalidAuthenticationException {
		
		if(user.getEmail().equals(mail) && user.getPassword().equals(password)) {
			authenticationStatus = AuthenticationStatus.SUCCESS;
			user.setLastLogin(new Date());
			return;
		}
		authenticationStatus = AuthenticationStatus.FAIL;
		throw new InvalidAuthenticationException("email veya þifre hatalý");
	}
	
	protected abstract void addInsurance(Insurance insurance);
	public void addAddress(Address address){
        if(!isAuthenticated())
            return;

        AddressManager.addAddress(user, address);
    }

    public void removeAddress(Address address){
        if(!isAuthenticated())
            return;

        AddressManager.removeAddress(user, address);
    }
    
    public List<Insurance> getInsurances() {
        return insuranceList;
    }


    public boolean isAuthenticated(){
        return AuthenticationStatus.SUCCESS.equals(authenticationStatus);
    }
	
}
