package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Convert {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Converting a List to String");
		String names = list.stream()
							.collect(Collectors.joining(", ", "Begin {", "} End"));

		System.out.println("Names: " + names);

		System.out.println("\nConverting a List to Map");
		Map<String, String> namesMap = list.stream()
							.collect(Collectors.toMap(name -> name.toString() + "Key", name -> name.toUpperCase()));

		System.out.println("Map Names: " + namesMap);

		List<String> list2 = Arrays.asList("John", "Marcus", "Marcus", "Ana", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("\nList 2: " + list2);

		System.out.println("\nConverting a List to Set, duplicated elements removed");
		Set<String> namesSet = list2.stream()
									.collect(Collectors.toSet());

		System.out.println("Set Names: " + namesSet);
	}
}
