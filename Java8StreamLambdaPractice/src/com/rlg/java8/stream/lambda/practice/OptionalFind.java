package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalFind {

	public static void main(String[] args) {
		
		OptionalFind.find("Victoria");
		OptionalFind.find("Rafael");
		OptionalFind.find("Ana");
		OptionalFind.find("Mike");
	}
	
	public static void find(String name) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("\nFinding and getting '"+name+"' name using lambda expression, optional and filter:");
		
		Optional<String> result = list.stream()
										.filter(x -> name.equals(x))
										.findFirst();

		System.out.println(result.isPresent() ? result.get() + " found": "***Not found***");
		
	}

}
