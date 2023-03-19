package metod_homework_test;

import org.example.MethodsHomework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMethod {
    MethodsHomework methodsHomework = new MethodsHomework();

    @Test
    void testNumber1Method() {
        Assertions.assertEquals(0, methodsHomework.number1(4, 6));
    }

    @Test
    void testBoolInputMethod() {
        String str = "Hello World!!!";
        Assertions.assertEquals(str, methodsHomework.boolInput(true));
    }

    @Test
    void testReturnCharMethod() {
        Assertions.assertEquals('5', methodsHomework.returnChar('5'));
    }

    @Test
    void testReturnFloatMethod() {
        Assertions.assertEquals(5, methodsHomework.returnFloat(5, 6));
    }

    @Test
    public void testRecursionExample() {
        int count = methodsHomework.recursionExample();
        Assertions.assertEquals(4, count);
    }
}
