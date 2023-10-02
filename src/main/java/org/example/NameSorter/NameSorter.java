package org.example.NameSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameSorter{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Peter");
        names.add("Robert");
        names.add("Attila");
        names.add("Joseph");
        names.add("Milan");
        names.add("Ferenc");

        List<String> sorted = names.stream()
                .sorted((n1, n2) -> n2.toUpperCase().compareTo(n1.toUpperCase()))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("sorted = " + sorted);
    }

}
