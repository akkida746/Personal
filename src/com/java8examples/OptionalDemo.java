package com.java8examples;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<String> optional = Optional.empty();
		
		System.out.println(optional.of(1));
		System.out.println(optional.of(1).get());
		
		Optional<String> op = optional.ofNullable(null);
		
		System.out.println(op);
		System.out.println(optional);

	}
}
