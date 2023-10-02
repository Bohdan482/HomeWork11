package org.example.NameExceptor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameExceptor {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("1. Ivan");
        names.add("2. Peter");
        names.add("3. Robert");
        names.add("4. Attila");
        names.add("5. Joseph");
        names.add("6. Milan");
        names.add("7. Ferenc");

        List<String> oddNames =
                names.stream()
                .filter(n -> n.charAt(0) % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("oddNames are: " + oddNames);
    }
}