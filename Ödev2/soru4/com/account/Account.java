package com.account;

import java.util.Date;
import java.util.List;

import com.address.Address;
import com.address.AddressManager;
import com.authentication.AuthenticationStatus;
import com.exception.InvalidAuthenticationException;
import com.insurance.Insurance;
import com.user.User;



public abstract class Account implements Comparable<Account>{

	private User user;
	private AuthenticationStatus authenticationStatus ;
	private List<Insurance> insuranceList;
	
	
	
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
	
	abstract void addInsurance(Insurance insurance);
	
	
	
    
    public List<Insurance> getInsurances() {
        return insuranceList;
    }


    public boolean isAuthenticated(){
        return AuthenticationStatus.SUCCESS.equals(authenticationStatus);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authenticationStatus == null) ? 0 : authenticationStatus.hashCode());
		result = prime * result + ((insuranceList == null) ? 0 : insuranceList.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (authenticationStatus != other.authenticationStatus)
			return false;
		if (insuranceList == null) {
			if (other.insuranceList != null)
				return false;
		} else if (!insuranceList.equals(other.insuranceList))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
    
}
