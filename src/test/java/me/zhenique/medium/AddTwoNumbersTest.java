package me.zhenique.medium;

import me.zhenique.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    AddTwoNumbers actual = new AddTwoNumbers();
    ListNode node = new ListNode();
    
    @Test
    void testExample1() {
        ListNode l1 = node.createList(new int[]{2, 4, 3});
        ListNode l2 = node.createList(new int[]{5, 6, 4});
        ListNode expected = node.createList(new int[]{7, 0, 8});
        ListNode result = actual.addTwoNumbers(l1, l2);
        node.assertListEquals(expected, result);
    }

    @Test
    void testExample2() {
        ListNode l1 = node.createList(new int[]{0});
        ListNode l2 = node.createList(new int[]{0});
        ListNode expected = node.createList(new int[]{0});
        ListNode result = actual.addTwoNumbers(l1, l2);
        node.assertListEquals(expected, result);
    }

    @Test
    void testExample3() {
        ListNode l1 = node.createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = node.createList(new int[]{9, 9, 9, 9});
        ListNode expected = node.createList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        ListNode result = actual.addTwoNumbers(l1, l2);
        node.assertListEquals(expected, result);
    }

    @Test
    void testDifferentLengthNoCarry() {
        ListNode l1 = node.createList(new int[]{1, 2});
        ListNode l2 = node.createList(new int[]{3, 4, 5});
        ListNode expected = node.createList(new int[]{4, 6, 5});
        ListNode result = actual.addTwoNumbers(l1, l2);
        node.assertListEquals(expected, result);
    }

    @Test
    void testCarryAtEnd() {
        ListNode l1 = node.createList(new int[]{9, 9});
        ListNode l2 = node.createList(new int[]{1});
        ListNode expected = node.createList(new int[]{0, 0, 1});
        ListNode result = actual.addTwoNumbers(l1, l2);
        node.assertListEquals(expected, result);
    }

    @Test
    void testOneListLongerWithCarry() {
        ListNode l1 = node.createList(new int[]{9, 9, 9});
        ListNode l2 = node.createList(new int[]{9, 9});
        ListNode expected = node.createList(new int[]{8, 9, 0, 1});
        ListNode result = actual.addTwoNumbers(l1, l2);
        node.assertListEquals(expected, result);
    }
    
}
