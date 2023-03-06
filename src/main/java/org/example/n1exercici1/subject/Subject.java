package org.example.n1exercici1.subject;

import org.example.n1exercici1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList;
    private double newStockValue;

    public Subject() {
        this.observerList = new ArrayList<>();
    }

    public double getNewStockValue() {
        return newStockValue;
    }

    public void setNewStockValue(int newStockValue) {
        this.newStockValue = newStockValue;
        notifyAllObservers();
    }

    public void attach (Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observerList){
            observer.update();
        }
    }
}
