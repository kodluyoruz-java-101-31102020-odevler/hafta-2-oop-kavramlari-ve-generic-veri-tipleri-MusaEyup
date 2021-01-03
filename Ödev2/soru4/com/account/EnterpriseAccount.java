package com.account;

import java.util.List;

import com.insurance.Insurance;
import com.user.User;

public class EnterpriseAccount extends Account{
	
	
	public EnterpriseAccount(User user, List<Insurance> insurance) {
        super(user, insurance);
    }

    @Override
    void addInsurance(Insurance insurance) {
        super.getInsurances().add(insurance);
    }

	@Override
	public int compareTo(Account o) {
		if (this.hashCode() < o.hashCode()) return -1;
		else if(this.hashCode() > o.hashCode()) return 1;
		return 0;
	}

	
}
