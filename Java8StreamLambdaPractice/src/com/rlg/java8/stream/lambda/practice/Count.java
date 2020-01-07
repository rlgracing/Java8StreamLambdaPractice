package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Finding and counting names containing 'ha' using lambda expression and filter, returning long:");
		long qtdy = list.stream()
				.filter(x -> x.contains("ha"))
				.collect(Collectors.counting());

		System.out.println("Names containing 'ha': " + qtdy);
	}
}
