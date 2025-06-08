package me.zhenique.medium;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = customers[0][0] + customers[0][1], sumTime = customers[0][1];
        for (int i = 1; i < customers.length; i++) {
            if (currentTime > customers[i][0])
                sumTime += currentTime - customers[i][0];
            else
                currentTime = customers[i][0];
            currentTime += customers[i][1];
            sumTime += customers[i][1];
        }
        return (double) sumTime / customers.length;
    }
}
