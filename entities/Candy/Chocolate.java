package entities.Candy;

import entities.ICandy;
import entities.Product;

public class Chocolate extends Product implements ICandy {

    public Chocolate(Integer price) {
        super(price);
    }

    @Override
    public String getName() {
        return "шоколад";
    }
    
}
