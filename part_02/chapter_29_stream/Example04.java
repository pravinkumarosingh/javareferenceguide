package part_02.chapter_29_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example04 {
    public static void main(String[] args) {
        List<Double> numbers = List.of(7.0,18.0,10.0,24.0,17.0,5.0);
        List<Double> myList = new ArrayList<>(numbers);

        Stream<Double> sqrtStream = myList.stream().map((a)->Math.sqrt(a));
        double sqrtProduct = sqrtStream.reduce(1.0,(a,b)->a*b);

        System.out.println(sqrtProduct);
    }
}
