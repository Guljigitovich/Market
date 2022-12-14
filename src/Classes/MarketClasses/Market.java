package Classes.MarketClasses;

import Enums.Product;

import java.math.BigDecimal;

public class Market {
    private String name;
    BigDecimal money;
    private int rating;
    private String address;
    private int priceOfTheProduct;

    public Market(String name,  BigDecimal money, int rating, String address) {
        this.name = name;
        this.money = money;
        this.rating = rating;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("""
                 Market name : %s
                Cash-box : %s
                Market rating : %s
                Market address : %s
             
                """,getName(),getMoney(),getRating(),getAddress());
    }
}
