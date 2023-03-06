package org.example.n3exercici1.Dependency;

public class Dirham implements Convertidor{

    private final double dirhamValue = 3.67;

    public Dirham() {
    }

    @Override
    public void convert(double money) {
        System.out.println(money + " dollars exchange to " + money * dirhamValue + " dirhams.");
    }
}
