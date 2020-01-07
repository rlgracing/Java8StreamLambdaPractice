package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;

public class PrintAllFormatted {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Printing all using lambda expression and formatting inside System.out.println:");
		list.forEach(x -> System.out.println("Name: " + x + ";"));

		System.out.println("\nPrinting all using lambda expression calling a helper method:");
		list.forEach(x -> formatHelper(x));

		System.out.println("\nPrinting all using instance method reference calling a helper method:");
		list.forEach(PrintAllFormatted :: formatHelper);

	}
	
	public static void formatHelper(String name) {
		System.out.println("Name: [" + name + "];");
	}
}
