package part_02.chapter_29_stream;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        List<Double> numbers = List.of(7.0,18.0,10.0,24.0,17.0,5.0);
        List<Double> myList = new ArrayList<>(numbers);

        double squareRootProducts = myList.parallelStream().reduce(1.0,(a,b)->a*Math.sqrt(b),(a,b)->a*b);
        System.out.println(squareRootProducts);

        double squareRootProducts2 = myList.stream().parallel().reduce(1.0,(a,b)-> a*Math.sqrt(b),(a,b)->a*b);
        System.out.println(squareRootProducts2);
    }
}
