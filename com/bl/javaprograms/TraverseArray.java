package com.bl.javaprograms;

public class TraverseArray {
	public static void main(String[] args) {
		int arr [] = {32,75,93,98,65,64};
		TraverseArray traverseArray = new TraverseArray();
		traverseArray.transversArray(arr);
	    }

	    public void transversArray(int [] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
        }
}
