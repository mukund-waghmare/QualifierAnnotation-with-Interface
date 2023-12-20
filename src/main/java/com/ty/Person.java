package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired 
	@Qualifier(value = "nokia")
	Mobile mobile;
	
	public void personMethod()
	{
		System.out.println("This From Person Class");
		mobile.getMobile();
	}

}
