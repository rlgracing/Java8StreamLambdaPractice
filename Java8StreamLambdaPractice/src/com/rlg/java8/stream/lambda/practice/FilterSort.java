package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;

public class FilterSort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Monica", "John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Filtering by length and sorting names using lambda expression and forEach:");
		list.stream()
			.filter(name -> name.length() < 7)
			.sorted()
			.forEach(name -> System.out.println(name));

		System.out.println("\nFiltering by length and sorting names using instance method reference and forEach:");
		list.stream()
			.filter(name -> name.length() < 7)
			.sorted()
			.forEach(System.out :: println);
	}

}
