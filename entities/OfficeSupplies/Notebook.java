package entities.OfficeSupplies;

import entities.IOfficeSupplies;
import entities.Product;

public class Notebook extends Product implements IOfficeSupplies {

    public Notebook(Integer price) {
        super(price);
    }

    @Override
    public String getName() {
        return "тетрадь";
    }
    
}
