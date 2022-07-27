package com.bl.javaprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
        list.add(55);
        list.add(66);
        list.add(89);
        list.add(36);
        list.add(29);
        list.add(11);
        list.add(9);
        System.out.println(list);
        SortArrayList array = new SortArrayList();
        array.sortArray();
    }
	public void sortArray() {
        list.sort(Comparator.naturalOrder());
        System.out.println("ArrayList sorted: " + list);
    }
}

