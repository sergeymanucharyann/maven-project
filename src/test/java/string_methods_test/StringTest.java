package string_methods_test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

/**
 * In StringTest class I test few methods of String class.
 */

public class StringTest {
    @Test
    public void testStringLengthMethod() {
        String str = "Hello";
        int strLength = 5;
        int originalLength = str.length();
        assertEquals(strLength, originalLength);
    }

    @Test
    public void testStringCharAtMethod() {
        String str ="Hello";
        char myChar = 'e';
        char originalChar = str.charAt(1);
        assertEquals(myChar, originalChar);
    }

    @Test
    public void testStringSubstringMethod() {
        String str = "Hello";
        String mySubstring = "ell";
        String oringinalSubstring = str.substring(1, 4);
        assertEquals(mySubstring, oringinalSubstring);
    }

    @Test
    public void testEquals() {
        String str1 ="Hello";
        String str2 ="Hello";
        boolean bool = true;
        boolean original = str1.equals(str2);
        assertEquals(bool, original);
    }

    @Test
    public void testConcat() {
        String str1 ="Hello";
        String str2 = " world";
        String pendingConcatString = "Hello world";
        String originalString = str1.concat(str2);
        assertEquals(pendingConcatString, originalString);
    }

}
