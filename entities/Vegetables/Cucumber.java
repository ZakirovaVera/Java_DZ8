package entities.Vegetables;
import entities.*;


public class Cucumber extends Product implements IVegetables {

    public Cucumber(Integer price) {
        super(price);
    }

    @Override
    public String getName() {
        return "огурец";
    }
    

}
