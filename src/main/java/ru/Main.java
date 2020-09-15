package ru;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    private static List<Integer> getRandomList() {
        List<Integer> list = new ArrayList<>();
        int size = new Random().nextInt(15);
        for(int i=0;i<size;i++){
            list.add(new Random().nextInt(10));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> randomList = getRandomList();
        System.out.println(randomList);

        randomList.sort(Integer::compareTo);
        System.out.println(randomList);

        List<Integer> newList = new ArrayList<>();
        for(Integer value : randomList) {
            if (value > 3 && !newList.contains(value -2)) {
                newList.add(value - 2);
            }
        }

        List<Integer> newList2 = randomList
                .stream()
                .filter(value -> value > 3)
                .map(value -> value -2)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(newList);
        System.out.println(newList2);
        System.out.println();
    }
}
