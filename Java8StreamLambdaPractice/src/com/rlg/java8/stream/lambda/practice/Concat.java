package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Printing all names using lambda expression:");
		list.forEach(x -> System.out.println(x));

		Stream<String> listConcat = Stream.concat(	list.stream(),
													list.stream()
														.filter(name -> name.startsWith("M"))
														.map(fName -> fName + " de Niro")
												);
		System.out.println("\nPrinting all names after adding a new list with a filter applied (changing the names starting with 'M') using lambda expression:");
		listConcat.forEach(x -> System.out.println(x));

	}
}
