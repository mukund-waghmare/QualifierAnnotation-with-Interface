package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile {

	public void getMobile() {
		
		System.out.println("From Nokia");
	}

}
