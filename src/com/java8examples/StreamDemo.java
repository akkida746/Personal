package com.java8examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		System.out.println(LongStream.rangeClosed(1, 5).reduce((long a, long b) -> a*b));
		
		int[] arr1 = new int[]{1,2,3};
		int[] arr2 = new int[]{4,5,6};
		
		List<int[]> arrList = new ArrayList<int[]>();
		arrList.add(arr1);
		arrList.add(arr2);
        
		System.out.println(arrList.stream().flatMapToInt(a -> Arrays.stream(a).map(Integer::valueOf)).sum());
		
		arrList.stream().mapToInt(a -> Arrays.stream(a).sum()).forEach(x -> System.out.println(x));
		
		
	}

}
