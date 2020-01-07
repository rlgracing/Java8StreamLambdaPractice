package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;

public class SimpleSort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Sorting names using lambda expression and forEach:");
		list.stream()
			.sorted()
			.forEach(name -> System.out.println(name));

		System.out.println("\nSorting names using instance method reference and forEach:");
		list.stream()
			.sorted()
			.forEach(System.out :: println);
	}
}
