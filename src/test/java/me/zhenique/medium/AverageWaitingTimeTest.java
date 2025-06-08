package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageWaitingTimeTest {
    AverageWaitingTime actual = new AverageWaitingTime();
    @Test
    void singleCustomer() {
        int[][] customers = {{5, 10}};
        assertEquals(10.0, actual.averageWaitingTime(customers));
    }

    @Test
    void noWaitingTime() {
        int[][] customers = {{1, 2}, {3, 4}};
        assertEquals(3.0, actual.averageWaitingTime(customers));
    }

    @Test
    void withWaitingTime() {
        int[][] customers = {{1, 5}, {2, 3}};
        assertEquals(6.0, actual.averageWaitingTime(customers));
    }

    @Test
    void mixedScenario() {
        int[][] customers = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        assertEquals(3.25, actual.averageWaitingTime(customers));
    }

    @Test
    void delayedArrivals() {
        int[][] customers = {{2, 3}, {10, 2}, {12, 5}, {15, 1}};
        assertEquals(3.25, actual.averageWaitingTime(customers));
    }

    @Test
    void zeroCookingTime() {
        int[][] customers = {{3, 0}, {5, 2}};
        assertEquals(1.0, actual.averageWaitingTime(customers));
    }
}
