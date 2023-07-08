package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {


    @Test
    public void testReverse1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"dog", "lazy", "the", "over", "jumps", "fox", "brown", "quick", "the"};
        String[] actual = StringArrayUtils.reverse(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverse2() {
        String[] array  = {"dog", "lazy", "the", "over", "jumps", "fox", "brown", "quick", "the"};
        String[] expected = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.reverse(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverse3() {
        String[] expected = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.reverse(StringArrayUtils.reverse(expected));
        Assert.assertEquals(expected, actual);
    }
/* //testing if array reverses correctly
    @Test
    public void testReverse4() {
        String[] array = {"Is this a plaindrome?", "This is not a plaindrome", "Is this a palindrome?", "This is not a palindrome"};
        String[] expected = {"a"};
        String[] actual = StringArrayUtils.reverse(array);
        for (String element : actual) { System.out.println(element);}



        //Assert.assertEquals(expected, actual);
    }
*/
}
