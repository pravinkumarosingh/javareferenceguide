package part_02.chapter_29_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example02 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(7,18,10,24,17,5);
        List<Integer> myList = new ArrayList<>(numberList);

        Optional<Integer> productObj = myList.stream().reduce((a,b) -> a*b);
        System.out.println("Product as optional "+productObj.get());

        int product = myList.stream().reduce(1,(a,b)->a*b);
        System.out.println("Product as int "+product);
    }
}
