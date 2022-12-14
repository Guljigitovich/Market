package Enums;

public enum CarParts {
    TIRE(1200),
    BATTERY(3000),
    BUMPERS(1500),
    MIRROR(2500),
    LIGHT(1800),
    CARPET(2000),
    SEAT_COVER(1400);
    private int price;

    CarParts(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
