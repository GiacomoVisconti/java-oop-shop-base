package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    //CONSTRUCTOR
    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva){
        this.code = (int)(Math.random() * 999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva =iva;
    }
    public Prodotto(){
        this.code = 000;
        this.name = "Senza Nome";
        this.description = "Senza Descrizione";
        this.price = new BigDecimal(0.00);
        this.iva = new BigDecimal(0.22);
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

    //GETTERS
    public int getCode(){
        return this.code;
    }

    public String getName(){
        return this.name.toLowerCase();
    }

    public String getDescription(){
        return this.description;
    }

    public BigDecimal getPrice(){
        return this.price;
    
    }
    
    public BigDecimal getIva(){
        return this.iva;

    }

    //SETTERS
    public void setCode(){
        this.code = (int)(Math.random() * 999);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice( BigDecimal price){
        this.price = price.setScale(2, RoundingMode.DOWN);
    }

    public void setIva(BigDecimal iva){
        this.iva = iva.setScale(2, RoundingMode.DOWN);
    }
    
}
