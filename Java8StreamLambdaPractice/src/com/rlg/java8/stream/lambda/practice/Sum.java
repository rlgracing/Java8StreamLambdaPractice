package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;

public class Sum {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Returning names total length using lambda expression, returning long:");
		long sum = list.stream()
						.peek(name -> System.out.println(name + ": " + name.length())) //Debugging method to trace the values, remove it when it is not needed anymore
						.mapToLong(name -> name.length())
						.sum();

		System.out.println("Names total length: " + sum);
	}

}
