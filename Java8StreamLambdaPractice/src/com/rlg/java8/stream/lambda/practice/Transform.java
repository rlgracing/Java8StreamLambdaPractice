package com.rlg.java8.stream.lambda.practice;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Transform {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Marcus", "Ana", "Victoria", "Charles", "Michael");

		System.out.println("Printing all names using lambda expression:");
		list.forEach(x -> System.out.println(x));
		
		List<Person> personList = list.stream()
										.map(name -> new Person(name, "email"+new Random().nextInt(100) +name+"@test.com", "Address " + name + " " + new Random().nextInt(100)))
										.collect(Collectors.toList());

		System.out.println("\nPrinting all transformed from String names to Person objects using lambda expression:");
		personList.forEach(x -> System.out.println(x));

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
