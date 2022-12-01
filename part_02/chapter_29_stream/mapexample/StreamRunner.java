package part_02.chapter_29_stream.mapexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> details = new ArrayList<>();
        details.add(new NamePhoneEmail("ranga","7568945632","ranga@email.com"));
        details.add(new NamePhoneEmail("pravin","89754653213","pravin@email.com"));

        System.out.println("original values: ");
        details.stream().forEach((element) -> System.out.println(element.name+" "+element.phone+" "+element.email));

        Stream<NamePhone> namePhoneStream = details.stream().map((element) -> new NamePhone(element.name,element.phone));

        System.out.println("name and phone");
        namePhoneStream.forEach((element)-> System.out.println(element.name+" "+element.phone));
    }
}
