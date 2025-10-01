package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    public int code;
    public String name;
    public String description;
    public BigDecimal price;
    public BigDecimal iva;

    //CONSTRUCTOR
    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva){
        this.code = (int)(Math.random() * 999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva =iva;
    }

    public BigDecimal basePrice(){
        return this.price;
    }

    public BigDecimal totalPrice(){
        if (price != null && iva != null) {
            
            return price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String extendedName(){
        if (name != null) {
            
            String fullName = this.code + "-" + this.name.replace(" ", "-");
            return fullName;
        }
        return null;
    }
}
