package org.example.n3exercici1.Dependency;

public class PoundStarling implements Convertidor{

    private final double poundValue = 0.83;

    public PoundStarling() {
    }

    @Override
    public void convert(double money) {
        System.out.printf("%s dollars exchange to %s pounds%n", money, money * poundValue);
    }
}
