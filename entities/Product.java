package entities;

public abstract class Product {

    Integer price;

    public Product(Integer price){
        this.price = price;
    }

    public abstract String getName();
    
    public Integer getPrice(){
        return price;
    }
    
}