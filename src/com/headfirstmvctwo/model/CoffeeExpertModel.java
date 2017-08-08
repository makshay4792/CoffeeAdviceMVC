package com.headfirstmvctwo.model;

import java.util.ArrayList;
import java.util.List;

public class CoffeeExpertModel {
	public List<String> getAdvice(String color){
		List<String> advice=new ArrayList<String>();
		if(color.equalsIgnoreCase("brown")){
			advice.add("Capachino");
			advice.add("Choco Latte");
		}else{
			advice.add("Expresso");
			advice.add("Irish Coffee");
		}
		return advice;
	}
}
