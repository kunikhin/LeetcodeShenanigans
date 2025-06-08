package me.zhenique.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDeletionsToMakeStringBalancedTest {

    MinimumDeletionsToMakeStringBalanced actual = new MinimumDeletionsToMakeStringBalanced();

    @Test
    public void testExample1() {
        assertEquals(2, actual.minimumDeletions("aababbab"));
    }

    @Test
    public void testExample2() {
        assertEquals(2, actual.minimumDeletions("bbaaaaabb"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, actual.minimumDeletions(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(0, actual.minimumDeletions("a"));
        assertEquals(0, actual.minimumDeletions("b"));
    }

    @Test
    public void testAlreadyBalanced() {
        assertEquals(0, actual.minimumDeletions("ab"));
        assertEquals(0, actual.minimumDeletions("aabb"));
        assertEquals(0, actual.minimumDeletions("aaabbb"));
    }

    @Test
    public void testSimpleImbalance() {
        assertEquals(1, actual.minimumDeletions("ba"));
    }

    @Test
    public void testTwoDeletionsRequired() {
        assertEquals(2, actual.minimumDeletions("baba"));
    }

    @Test
    public void testComplexCase1() {
        assertEquals(1, actual.minimumDeletions("aba"));
    }

    @Test
    public void testComplexCase2() {
        assertEquals(1, actual.minimumDeletions("abba"));
    }

    @Test
    public void testComplexCase3() {
        assertEquals(3, actual.minimumDeletions("abababa"));
    }

    @Test
    public void testAllAThenAllB() {
        assertEquals(0, actual.minimumDeletions("aaaaabbbbb"));
    }

    @Test
    public void testAllBThenAllA() {
        assertEquals(5, actual.minimumDeletions("bbbbbaaaaa"));
    }
}

