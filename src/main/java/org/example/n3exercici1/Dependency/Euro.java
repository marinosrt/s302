package org.example.n3exercici1.Dependency;

public class Euro implements Convertidor{

    private final double euroValue = 0.94;

    public Euro() {
    }

    @Override
    public void convert(double money) {
        System.out.println(money + " dollars exchange to " + money * euroValue + " euros.");
    }
}
