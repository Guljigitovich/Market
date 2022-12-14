package Classes.MarketClasses;

import Enums.Product;

import java.math.BigDecimal;

public class Frunze extends Market {
    private Product[] product;
    public Frunze(String name, BigDecimal money, int rating, String address,Product[] product ) {
        super(name, money, rating, address);
        this.product = product;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }
}
