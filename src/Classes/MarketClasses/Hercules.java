package Classes.MarketClasses;

import Enums.CarParts;
import Enums.Product;

import java.math.BigDecimal;

public class Hercules extends Market {
    private CarParts[] carParts;
    public Hercules(String name, BigDecimal money, int rating, String address, CarParts[] carParts) {
        super(name, money, rating, address);
        this.carParts = carParts;
    }

    public CarParts[] getCarParts() {
        return carParts;
    }

    public void setCarParts(CarParts[] carParts) {
        this.carParts = carParts;
    }
}
