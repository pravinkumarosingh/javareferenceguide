package part_02.chapter_29_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Example05 {
    public static void main(String[] args) {
      List<Double> numbers = List.of(1.1,3.6,9.2,4.7,12.1,5.0);
      List<Double> myList = new ArrayList<>(numbers);

      System.out.print("Original Values: ");
      myList.stream(). forEach(element -> System.out.print(element+" "));

      System.out.println();

      IntStream cstrm = myList.stream().mapToInt(element -> (int) Math.ceil(element));
      System.out.print("Mapped to integer: ");
      cstrm.forEach(element -> System.out.print(element+" "));






    }
}
