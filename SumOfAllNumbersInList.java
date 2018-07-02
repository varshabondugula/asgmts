package com.CollectionFrameworkExamples.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class SumOfAllNumbersInList {


	static ArrayList<Integer> list = new ArrayList<>();

	public void sumOfNumbers() {
		
		int sum = 0;

		for (Integer i : list) {

			sum = sum + i;
			
		}
		System.out.println("Sum of numbers in list is:   "+sum);
	}

	public static void main(String args[]) {

		list.add(5);
		list.add(15);
		list.add(85);
		list.add(65);
		list.remove(3);//removes number at index 3; will throw Exception if given index more than size of list.

		SumOfAllNumbersInList s = new SumOfAllNumbersInList();
		s.sumOfNumbers();

		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println("the elements in the list are:  "+itr.next());
		}
		
	}
}
