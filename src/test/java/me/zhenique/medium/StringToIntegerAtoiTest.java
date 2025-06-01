package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerAtoiTest {

    StringToIntegerAtoi actual = new StringToIntegerAtoi();
    @Test
    public void test1() {
        assertEquals(42, actual.myAtoi("42"));
    }
    @Test
    public void test2() {
        assertEquals(-42, actual.myAtoi("   -042"));
    }
    @Test
    public void test3() {
        assertEquals(1337, actual.myAtoi("1337c0d3"));
    }
    @Test
    public void test4() {
        assertEquals(0, actual.myAtoi("0-1"));
    }
    @Test
    public void test5() {
        assertEquals(0, actual.myAtoi("words and 987"));
    }
    @Test
    public void test6() {
        assertEquals(0, actual.myAtoi(" "));
    }
    @Test
    public void test7() {
        assertEquals(-2147483648, actual.myAtoi("-2147483649"));
    }
    @Test
    public void test8() {
        assertEquals(2147483647, actual.myAtoi("2147483647"));
    }
}
