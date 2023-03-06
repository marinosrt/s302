package org.example.n1exercici1.observer;

import org.example.n1exercici1.subject.Subject;

public class PepitoFlores extends Observer{

    private final String brokerName = "Pepito Flores";
    private long stock = 43245;

    public PepitoFlores(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public String getBrokerName() {
        return brokerName;
    }

    public double getStock() {
        return stock;
    }

    @Override
    public void update() {
        double newValue = (subject.getNewStockValue() / 100 + 1) * this.getStock();
        System.out.println("- Brokerage House " + getBrokerName() + ", updated value after last changes:\n" +
                String.format("%.2f", newValue));
    }
}
