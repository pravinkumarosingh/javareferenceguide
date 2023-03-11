package generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        iob.showType();
        System.out.println(iob.getOb());

        System.out.println();

        Gen<String> sob = new Gen<>("Generics Test");
        sob.showType();
        System.out.println(sob.getOb());
    }
}
