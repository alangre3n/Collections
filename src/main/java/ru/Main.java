package ru;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Integer> getRandomList(){
        List<Integer> list = new ArrayList<>();
        int size = new Random().nextInt(15);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(10));
        }
        return list;
    }

    public static void main(String[] args){
        List<Integer> randomList = getRandomList();
        System.out.println(randomList);

        randomList.sort(Integer::compareTo);
        System.out.println(randomList);

        //оставить все числа больше 3
        //вычесть из каждого 2
        //удалить все дубликаты

        List<Integer> newList = new ArrayList<>();
        for (Integer integer : randomList) {
            if (integer > 3 && !newList.contains(integer - 2)) {
                newList.add(integer - 2);
            }
        }

        List<Integer> newList2 = new ArrayList<>();
        for(Integer i : randomList){
            if(i > 3 && !newList2.contains(i - 2)){
                newList2.add(i - 2);
            }
        }

        System.out.println(newList);
        System.out.println(newList2);
    }
}