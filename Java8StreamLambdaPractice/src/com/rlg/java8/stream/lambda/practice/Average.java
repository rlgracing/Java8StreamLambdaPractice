package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;

public class Average {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Returning names average length using lambda expression, returning long:");
		double average = list.stream()
							.peek(name -> System.out.println(name + ": " + name.length())) //Debugging method to trace the values, remove it when it is not needed anymore
							.mapToLong(name -> name.length())
							.average()
							.getAsDouble();

		System.out.println("Names average length: " + average);
	}

}
