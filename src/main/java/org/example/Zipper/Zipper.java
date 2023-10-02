package org.example.Zipper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstStreamIterator = first.iterator();
        Iterator<T> secondStreamIterator = second.iterator();
        List<T> result = new ArrayList<>();
        while (firstStreamIterator.hasNext() && secondStreamIterator.hasNext()){
            result.add(firstStreamIterator.next());
            result.add(secondStreamIterator.next());
        }
        return result.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 3, 5, 7 , 9, 11, 13, 15, 17);
        Stream<Integer> second = Stream.of(2, 4, 6, 8, 10, 12);
        Stream<Integer> zipped = zip(first, second);
        System.out.println(zipped.collect(Collectors.toList()));
    }
}
