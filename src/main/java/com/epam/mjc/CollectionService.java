package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> resultList = list.stream()
        		.filter(numberFromList -> numberFromList % 2 == 0)
        		.collect(Collectors.toList());
        return resultList;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> resultList = list.stream()
        		.map(String::toUpperCase)
        		.collect(Collectors.toList());
        return resultList;
    }

    public Optional<Integer> findMax(List<Integer> list) {
        Optional<Integer> resultOptional = list
        		.stream()
        		.max(Comparator.naturalOrder());
        return resultOptional;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        Optional<Integer> findMinOptional = list
        		.stream()
        		.flatMap(listElement -> listElement.stream())
        		.min(Comparator.naturalOrder());
        return findMinOptional;
    }

    public Integer sum(List<Integer> list) {
        int sum = list.stream().mapToInt(x -> x).sum();
        return sum;
    }
}
