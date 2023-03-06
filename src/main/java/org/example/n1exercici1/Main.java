package org.example.n1exercici1;

import org.example.n1exercici1.observer.PepitoFlores;
import org.example.n1exercici1.observer.CarminaValencia;
import org.example.n1exercici1.subject.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new PepitoFlores(subject);
        new CarminaValencia(subject);

        System.out.println("Values rise up 15%. Update on the Brokerage Houses:");
        subject.setNewStockValue(15);
        System.out.println("Values drop 9%. Update on the Brokerage Houses:");
        subject.setNewStockValue(-9);


    }
}