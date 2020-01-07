package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConditionalFilterFlagSort {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Monica", "Mark", "John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Before sorting:");
		list.forEach(name -> System.out.println(name));

		boolean applySort = true;
		System.out.println("\nApply sort: "+applySort);
		
		Stream<String> conditionalFilterResult = list.stream()
													.filter(name -> name.startsWith("M"));

		if(applySort) {
			conditionalFilterResult = conditionalFilterResult.sorted();
		}
		
		List<String> filteredList = conditionalFilterResult.collect(Collectors.toList());
		
		System.out.println("\nAfter filter and conditional sorting:");
		filteredList.forEach(name -> System.out.println(name));
	}

}
