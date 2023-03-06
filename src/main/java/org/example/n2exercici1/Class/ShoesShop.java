package org.example.n2exercici1.Class;

import org.example.n2exercici1.callback.Execute;

public class ShoesShop {

    static Execute execute = new Execute();

    public void getCash(int option){

        switch (option){
            case 1 -> execute.executeWith(() -> System.out.println("Paying through CC."));
            case 2 -> execute.executeWith(() -> System.out.println("Paying through PayPal"));
            case 3 -> execute.executeWith(() -> System.out.println("Paying through the bank account"));
            default -> System.out.println("We don't have this type of payment available");
        }

    }

}
