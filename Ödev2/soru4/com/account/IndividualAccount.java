package com.account;

import java.util.List;

import com.insurance.Insurance;
import com.user.User;

public class IndividualAccount extends Account{

	public IndividualAccount(User user, List<Insurance> insurance) {
        super(user, insurance);
    }
	@Override
	protected void addInsurance(Insurance insurance) {
		
		getInsurances().add(insurance);
		
	}

	
}
