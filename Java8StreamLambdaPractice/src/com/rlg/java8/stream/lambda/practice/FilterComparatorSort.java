package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class FilterComparatorSort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mark","Monica", "John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Filtering by first letter equals 'M' using lambda expression, sorting names by length using Comparator and forEach:");
		list.stream()
			.filter(name -> name.startsWith("M"))
			.sorted(Comparator.comparing(name -> name.length()))
			.forEach(name -> System.out.println(name));

		System.out.println("\nFiltering by first letter equals 'M' using lambda expression, sorting reversed names by length using Comparator using instance method reference and forEach:");
		list.stream()
			.filter(name -> name.startsWith("M"))
			.sorted(Comparator.comparing(String :: length).reversed())
			.forEach(name -> System.out.println(name));
	}

}
