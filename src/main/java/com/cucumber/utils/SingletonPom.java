package com.cucumber.utils;

import com.cucumber.pom.Login;

public class SingletonPom {

	private Login lp;
	
	public Login getLp() {
		if(lp==null) {
			lp=new Login();
		}
		return lp;
	}
}
