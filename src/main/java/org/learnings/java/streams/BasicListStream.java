package org.learnings.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import org.learnings.java.utils.DummyListData;

public class BasicListStream {

	public static void main(String[] args) {
		List<String> names = DummyListData.getNames();
		
		String fullName = names.stream()
		.filter(n -> n.equalsIgnoreCase("suresh"))
		.map(n -> (n + " Devaraj"))
		.findAny()
		.toString();
		
		System.out.println(fullName);
		
		String fName = names.stream()
		.filter(n -> n.equalsIgnoreCase("lokesh"))
		.map(n -> (n + " M"))
		.collect(Collectors.joining());
		
		System.out.println(fName);
		
		List<String> newNames = names.stream()
		.map(name -> (name = name + ", Software Engg.,"))
		.collect(Collectors.toList());
		
		newNames.forEach(System.out::println);
	}

}
