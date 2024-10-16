package com.bptn.course._3_4;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator1 = new SumCalculator(1, 50);
        SumCalculator sumCalculator2 = new SumCalculator(51, 100);

        sumCalculator1.start();
        sumCalculator2.start();

        try {
            sumCalculator1.join();
            sumCalculator2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
        System.out.println("Total sum: " + totalSum);
    }
}

