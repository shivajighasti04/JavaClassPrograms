package com.bl.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static void main(String[] args) {
		List<Integer> element = new ArrayList<>();
		//Add Elements 
		element.add(20);
		element.add(5);
		element.add(30);
		element.add(15);
		element.add(7);
		System.out.println(element);
		
		//Remove Third Element
		element.remove(2);
		System.out.println(element);
	}
}


