package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;

public class FilterDistinct {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mark", "Mark", "Mark","Monica", "John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Filtering by first letter equals 'M' using lambda expression, removing repeated ones using distinct and forEach:");
		list.stream()
			.filter(name -> name.startsWith("M"))
			.distinct()
			.forEach(name -> System.out.println(name));

	}
}
