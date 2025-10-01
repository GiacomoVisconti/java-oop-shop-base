package org.lessons.java.shop;


public class Prodotto {
    public int code;
    public String name;
    public String description;
    public float price;
    public float iva;

    //CONSTRUCTOR
    public Prodotto(String name, String description, float price, float iva){
        this.code = (int)(Math.random() * 999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva =iva;
    }

    public void basePrice(){
        System.out.println(this.price);
    }

    public float totalPrice(){
        float total = this.price + (this.price * this.iva);
        return total;
    }

    public String extendedName(){
        String fullName = this.code + "-" + this.name.replace(" ", "-");
        return fullName;
    }
}
