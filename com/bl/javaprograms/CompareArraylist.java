package com.bl.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class CompareArraylist {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Orange");
        list1.add("Blue");
        list1.add("White");
        list1.add("Black");

        List<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Orange");
        list2.add("Blue");
        list2.add("White");
        list2.add("Black");

        CompareArraylist compareArrayList = new CompareArraylist();
        compareArrayList.equalityOfArraylist(list1, list2);
    }

    public void equalityOfArraylist(List list1, List list2) {
        if (list1.equals(list2)) {
            System.out.println("Both Arraylists are same");
        } else {
            System.out.println("Both Arraylists are not same");
        }
    }
}

