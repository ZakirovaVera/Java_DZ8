package entities.Vegetables;

import entities.IVegetables;
import entities.Product;

public class Tomato extends Product implements IVegetables {

    public Tomato(Integer price) {
        super(price);
    }

    @Override
    public String getName() {
        return "tomato";
    }
    
}
