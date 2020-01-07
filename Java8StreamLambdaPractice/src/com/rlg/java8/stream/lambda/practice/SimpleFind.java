package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFind {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Finding 'Victoria' name using lambda expression and forEach:");
		list.forEach(x -> System.out.println("Name: " + x + " - " + ("Victoria".equals(x) ? "***Found***" : "Not found")));

		System.out.println("\nFinding and getting 'Victoria' name using lambda expression and filter:");
		
		String name = list.stream()
							.filter(x -> "Victoria".equals(x))
							.collect(Collectors.joining());

		System.out.println("Name: " + name);

		System.out.println("\nFinding and getting names starting with 'M' using lambda expression and filter, returning string:");
		name = list.stream()
				.filter(x -> x.startsWith("M"))
				.collect(Collectors.joining(", "));

		System.out.println("Name: " + name);

		System.out.println("\nFinding and getting names starting with 'M' using lambda expression and filter, returning List:");
		List<String> mNames = list.stream()
								.filter(x -> x.startsWith("M"))
								.collect(Collectors.toList());

		System.out.println(mNames);

		System.out.println("\nFinding and getting names with length greater than 5 using lambda expression and filter, returning List:");
		mNames = list.stream()
								.filter(x -> x.length() > 5)
								.collect(Collectors.toList());

		System.out.println(mNames);
	}
}
