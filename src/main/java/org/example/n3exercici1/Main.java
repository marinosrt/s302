package org.example.n3exercici1;

import org.example.n3exercici1.Class.CanviDivisa;
import org.example.n3exercici1.Class.Keyboard;
import org.example.n3exercici1.Class.Keyboard.*;
import org.example.n3exercici1.Dependency.Dirham;
import org.example.n3exercici1.Dependency.Euro;
import org.example.n3exercici1.Dependency.PoundStarling;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {

        int option;

        do {
            System.out.println("""
                Get a division exchange from dollars to:
                0. Exit.
                1. Euros.
                2. Starlin Pounds.
                3. Dirhams.""");
            option = Keyboard.getInt("Choose an option");

            switch (option){
                case 0 -> System.out.println("Bye!");
                case 1 -> {
                    CanviDivisa exchangeEuros = new CanviDivisa(new Euro());
                    exchangeEuros.convertMoney(Keyboard.getDouble("Enter the amount of dollars you want to exchange"));
                }
                case 2 -> {
                    CanviDivisa exchangeEuros = new CanviDivisa(new PoundStarling());
                    exchangeEuros.convertMoney(Keyboard.getDouble("Enter the amount of dollars you want to exchange"));
                }
                case 3 -> {
                    CanviDivisa exchangeEuros = new CanviDivisa(new Dirham());
                    exchangeEuros.convertMoney(Keyboard.getDouble("Enter the amount of dollars you want to exchange"));
                }
                default -> System.out.println("We can only exchange Euros, Starlin Pounds or Dirhams. Choose again.");
            }
        } while (option != 0);



    }

}
