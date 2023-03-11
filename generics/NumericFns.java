package generics;

public class NumericFns<T extends Number> {
    T ob;

    NumericFns(T o){
        ob = o;
    }

    double reciprocal(){
        return 1 / ob.doubleValue();
    }

    double fractional(){
        return ob.doubleValue() - ob.intValue();
    }
}
