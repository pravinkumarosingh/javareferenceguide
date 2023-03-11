package generics;

public class NumericFnsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iob = new NumericFns<>(5);
        System.out.println(iob.reciprocal());
        System.out.println(iob.fractional());

        System.out.println();

        NumericFns<Double> dob = new NumericFns<>(5.25);
        System.out.println(dob.reciprocal());
        System.out.println(dob.fractional());
    }
}
