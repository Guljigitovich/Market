package Enums;

public enum ConstructionMaterials {
        HAMMER(800),
        LAMINATE(900),
        WALLPAPER_FOR_WALLS(1200),
        DYE(500),
        WINDOW(3500),
        DOOR(5000),
        CHANDELIER(4000);

        private int price;

        ConstructionMaterials(int price) {
                this.price = price;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }
}
