package entities.OfficeSupplies;
import entities.IOfficeSupplies;
import entities.Product;

public class Pencil extends Product implements IOfficeSupplies {

    public Pencil(Integer price) {
        super(price);
    }

    @Override
    public String getName() {
        return "карандаш";
    }
    
}
