package com.bl.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class SumNumberStream {
	public static void main(String[] args) {
		SumNumberStream sumNumberStream = new SumNumberStream();
        sumNumberStream.add(10);
    }

    public void add(int numberInput) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= numberInput; i++ ) {
            list.add(i);
        }

        Integer sum = list.stream().reduce(0, (a,b) -> a + b);
        System.out.println("Sum of " + numberInput + " number = " + sum);
	}
}
