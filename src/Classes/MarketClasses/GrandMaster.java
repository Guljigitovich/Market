package Classes.MarketClasses;

import Enums.ConstructionMaterials;
import Enums.Product;

import java.math.BigDecimal;

public class GrandMaster extends Market {
    private ConstructionMaterials[] constructionMaterials;
    public GrandMaster(String name, BigDecimal money, int rating, String address,ConstructionMaterials[] constructionMaterials) {
        super(name, money, rating, address);
        this.constructionMaterials = constructionMaterials;
    }

    public ConstructionMaterials[] getConstructionMaterials() {
        return constructionMaterials;
    }

    public void setConstructionMaterials(ConstructionMaterials[] constructionMaterials) {
        this.constructionMaterials = constructionMaterials;
    }
}
