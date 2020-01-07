package com.rlg.java8.stream.lambda.practice;
import java.util.List;
import java.util.Arrays;

public class PrintAll {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Printing all using lambda expression:");
		list.forEach(x -> System.out.println(x));

		System.out.println("\nPrinting all using instance method reference:");
		list.forEach(System.out :: println);

	}

}
