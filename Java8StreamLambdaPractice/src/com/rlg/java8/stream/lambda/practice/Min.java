package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Min {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Returning shorter name using lambda expression, returning long:");
		String longerName = list.stream()
								.peek(name -> System.out.println(name + ": " + name.length())) //Debugging method to trace the values, remove it when it is not needed anymore
								.min(Comparator.comparingInt(name -> name.length()))
								.get();

		System.out.println("Shorter name: " + longerName);
		
		System.out.println("\nReturning shorter name using lambda expression and collect:");
		longerName = list.stream()
						.collect(Collectors.minBy(Comparator.comparingInt(name -> name.length())))
						.get();

		System.out.println("Shorter name: " + longerName);
	}

}
