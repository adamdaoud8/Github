package calculator;

import Calculator.MyClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyClassTest {


    @Test
    public void testAdd() {
        MyClass myClass = new MyClass();
        assertEquals(3, myClass.add(1, 2));
        assertEquals(0, myClass.add(-1, 1));
        assertEquals(0, myClass.add(0, 0));

    }
    @Test
    public void testSub() {
        MyClass myClass = new MyClass();
        assertEquals(1, myClass.sub(3 , 2));
        assertEquals(0, myClass.sub(2, 2));
        assertEquals(2, myClass.sub(5, 3));
    }
}