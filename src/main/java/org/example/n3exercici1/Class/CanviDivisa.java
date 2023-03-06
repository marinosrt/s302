package org.example.n3exercici1.Class;

import org.example.n3exercici1.Dependency.Convertidor;

public class CanviDivisa {

    private Convertidor converter;

    public CanviDivisa(Convertidor converter) {
        this.converter = converter;
    }

    public void convertMoney(double money){
        this.converter.convert(money);
    }
}
