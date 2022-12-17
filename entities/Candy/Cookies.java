package entities.Candy;

import entities.ICandy;
import entities.Product;

public class Cookies extends Product implements ICandy {

    public Cookies(Integer price) {
        super(price);
    }

    @Override
    public String getName() {
        return "печенье";
    }
    
}
