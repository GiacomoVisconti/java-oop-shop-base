package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //? ISTANZIO LE CLASSI
        Prodotto pc1 = new Prodotto("MSI notebook",
        "Pc portatile di MSI, super prestante",
        new BigDecimal(999),
        new BigDecimal(0.22));
        Prodotto caffettiera1 = new Prodotto("AromaX 5000", 
        "Caffettiera smart con macina chicchi integrato, programmabile via app", 
        new BigDecimal(125), 
        new BigDecimal(0.22));

        //? STAMPO I VALORI ESEGUENDONE I METODI
        System.out.println(pc1.code);
        System.out.println(pc1.name);
        System.out.println(pc1.description);
        System.out.println(pc1.basePrice());
        System.out.println(pc1.totalPrice());
        System.out.println(pc1.extendedName());

        System.out.println(caffettiera1.code);
        System.out.println(caffettiera1.name);
        System.out.println(caffettiera1.description);
        System.out.println(caffettiera1.basePrice());
        System.out.println(caffettiera1.totalPrice());
        System.out.println(caffettiera1.extendedName());


    }
}
