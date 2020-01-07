package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComplexObjectFind {
	
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(	new Person("John", "john@test.com", "Street A"),
											new Person("Marcus", "marcus@test.com", "Street B"),
											new Person("Ana", "ana@test.com", "Street C"),
											new Person("Victoria", "victoria@test.com", "Street B"),
											new Person("Charles", "charles@test.com", "Street C"),
											new Person("Michael", "michael@test.com", "Street A"));

		System.out.println("Printing everybody using lambda expression:");
		list.forEach(x -> System.out.println(x));
		
		System.out.println("\nPrinting people with address equals 'Street B' using filter and lambda expression:");
		list.stream()
			.filter(p -> p.getAddress().contains("Street B"))
			.forEach(x -> System.out.println(x));

		System.out.println("\nCollecting people in a different list with address equals 'Street C' using filter, collect and lambda expression:");
		List<Person> filtered = list.stream()
									.filter(p -> p.getAddress().contains("Street C"))
									.collect(Collectors.toList());

		filtered.forEach(x -> System.out.println(x));

	}

	private static class Person {
		
		private String name;
		private String email;
		private String address;
		
		public Person(String name, String email, String address) {
			this.name = name;
			this.email = email;
			this.address = address;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", email=" + email + ", address=" + address + "]";
		}
		
		
	}

}
