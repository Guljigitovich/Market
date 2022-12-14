package Enums;

import java.math.BigDecimal;

public enum Product {
    CAKE(800),
    SUGAR(250),
    POTATOES(80),
    APPLE(120),
    BANANA(180),
    BREAD(25),
    TEA(100);
    private int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
