package part_02.chapter_29_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example01 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(7,18,10,24,17,5);
        List<Integer> myList = new ArrayList<>(numberList);

        System.out.println("original list "+myList);



        //minimum value in the list
        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()){
            System.out.println("min value: "+minVal.get());
        }

        //maximum value in the list
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()){
            System.out.println("max value: "+maxVal.get());
        }

        //display the sorted stream
        System.out.print("sorted stream: ");
        Stream<Integer> sortedStream = myList.stream().sorted();
        sortedStream.forEach(element -> System.out.print(element+" "));

        //display the odd number greater than 5
        System.out.println();
        System.out.print("odd numbers: ");
        myList.stream().filter(element -> element%2==1).filter(element -> element>5).forEach(element -> System.out.print(element+" "));
    }
}
