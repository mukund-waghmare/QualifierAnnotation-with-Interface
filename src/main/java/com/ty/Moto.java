package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Mobile {

	public void getMobile() {
		
		System.out.println("From Moto");
	}
	

}
