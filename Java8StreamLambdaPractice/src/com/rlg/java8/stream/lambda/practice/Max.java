package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Max {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Returning longer name using lambda expression:");
		String longerName = list.stream()
								.peek(name -> System.out.println(name + ": " + name.length())) //Debugging method to trace the values, remove it when it is not needed anymore
								.max(Comparator.comparingInt(name -> name.length()))
								.get();

		System.out.println("Longer name: " + longerName);
		
		System.out.println("\nReturning longer name using lambda expression and collect:");
		longerName = list.stream()
						.collect(Collectors.maxBy(Comparator.comparingInt(name -> name.length())))
						.get();

		System.out.println("Longer name: " + longerName);
	}

}
