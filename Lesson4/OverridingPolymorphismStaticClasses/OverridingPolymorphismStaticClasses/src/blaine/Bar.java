package blaine;

import com.courtney.Foo;

public class Bar extends Foo {
    private int sum = 10;
    public void reportSum() {
        sum += result;
        sum += num;         //compiler error
    }
}
