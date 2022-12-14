package Impl;

import Classes.MarketClasses.Frunze;
import Classes.MarketClasses.GrandMaster;
import Classes.MarketClasses.Hercules;
import Classes.MarketClasses.Market;
import Classes.PersonClasses.Person;
import Enums.CarParts;
import Enums.ConstructionMaterials;
import Enums.Product;
import Service.MarketService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketImpl implements MarketService {
    private final List<Market> markets = new ArrayList<>();
   /* boolean a = person1.getMoney().intValue()>=money;
                        if(a){
        BigDecimal subtract = person1.getMoney().subtract(BigDecimal.valueOf(money));
        person1.setMoney(subtract);
        BigDecimal add = person.getMoney().add(BigDecimal.valueOf(money));
        person.setMoney(add);
    }return "Кайра кайтарып бер";
}else return "Акча жетпейт";
        }
        }
        }

        return "Акча бере албайм";*/

    @Override
    public String payMoney(List<Person>personList,List<Market>marketList) {
        System.out.println("Write the person name : ");
        String personName = new Scanner(System.in).nextLine();
        System.out.println("Write the market name : ");
        String marketName = new Scanner(System.in).nextLine();
        System.out.println("Write the total cost of goods : ");
        int productPrice = new Scanner(System.in).nextInt();
        for (Person p:personList) {
            if(personName.equals(p.getName())){
                for (Market m:marketList) {
                    if(marketName.equals(m.getName())){
                      boolean a = p.getMoney().intValue()>=productPrice;
                      if(a){
                          BigDecimal subtract = p.getMoney().subtract(BigDecimal.valueOf(productPrice));
                          p.setMoney(subtract);
                          BigDecimal add = m.getMoney().add(BigDecimal.valueOf(productPrice));
                          m.setMoney(add);
                      }return "Спасибо за покупку";
                    }else return "Не хватает денег";
                }
            }
        }return "Не сможете сделать покупку";

    }


    @Override
    public String buyGoods() {
        List<Product> allProduct = new ArrayList<>();
        System.out.print("""
                 Frunze goods:           Hercules goods :         Grand Master goods :  
                Banana - 180 сом    |  Tire - 1200 som        | Hammer - 800 som
                Sugar - 250 сом     |  Battery - 3000 som     | Laminate - 900 som
                Bead - 25 сом       |  Bumpers - 1500 som     | Wallpaper for walls - 1200 som
                Cake - 800 сом       | Mirror - 2500 som      | Dye - 500 som
                Apple - 120 сом     |  Light - 1800 som       | Window - 3500 som
                Potatoes - 80 сом    | Carpet - 2000 som      | Door - 5000 som
                Tea - 100 сом        | Seat cover - 1400 som  | Chandelier - 4000 som
                               
                """);
        System.out.println("Write the market name : ");
         String goMarket = new Scanner(System.in).nextLine();
         int count = 0;
         switch (goMarket){
                 case "Frunze" -> {

                     while (true) {
                         System.out.println("You pay ? (Yes/No)");
                         String question = new Scanner(System.in).nextLine();
                     System.out.print(" Write the product name!");
                     String productName = new Scanner(System.in).nextLine();
                     System.out.print(" Write the quantity of goods!");
                     int amount = new Scanner(System.in).nextInt();
                     if (Product.BANANA.name().equals(productName.toUpperCase())||question.equals("Yes")) {
                         int summa = amount * Product.BANANA.getPrice();
                         System.out.println("Total purchase amount : " + summa);
                     } else if (Product.CAKE.name().equals(productName.toUpperCase())||question.equals("Yes")) {
                         int summa1 = amount * Product.CAKE.getPrice();
                         System.out.println("Total purchase amount :" + summa1);
                     } else if (Product.TEA.name().equals(productName.toUpperCase())||question.equals("Yes")) {
                         int summa2 = amount * Product.TEA.getPrice();
                         System.out.println("Total purchase amount :" + summa2);
                     } else if (Product.APPLE.name().equals(productName.toUpperCase())||question.equals("Yes")) {
                         int summa3 = amount * Product.APPLE.getPrice();
                         System.out.println("Total purchase amount :" + summa3);
                     } else if (Product.POTATOES.name().equals(productName.toUpperCase())||question.equals("Yes")) {
                         int summa4 = amount * Product.POTATOES.getPrice();
                         System.out.println("Total purchase amount :" + summa4);
                     } else if (Product.BREAD.name().equals(productName.toUpperCase())||question.equals("Yes")) {
                         int summa5 = amount * Product.BREAD.getPrice();
                         System.out.println("Total purchase amount :" + summa5);
                     } else if (Product.SUGAR.name().equals(productName.toUpperCase())||question.equals("Yes")) {
                         int summa6 = amount * Product.SUGAR.getPrice();
                         System.out.println("Total purchase amount :" + summa6);
                     } else if(question.equals("No")){
                         allProduct.add(Product.valueOf(productName));
                         System.out.println("Все покупка : ");
                         System.out.println(allProduct);
                         System.out.println("Покупка завершена");
                     }
                 }
             }case "Grand Master"->{
                 while (true) {
                     System.out.print(" Write the product name!");
                     String productName = new Scanner(System.in).nextLine();
                     System.out.print(" Write the quantity of goods!");
                     int amount = new Scanner(System.in).nextInt();
                     if (ConstructionMaterials.DYE.name().equals(productName.toUpperCase())) {
                         int summa = amount * ConstructionMaterials.DYE.getPrice();
                         System.out.println("Total purchase amount : " + summa);
                     } else if (ConstructionMaterials.DOOR.name().equals(productName.toUpperCase())) {
                         int summa1 = amount * ConstructionMaterials.DOOR.getPrice();
                         System.out.println("Total purchase amount :" + summa1);
                     } else if (ConstructionMaterials.HAMMER.name().equals(productName.toUpperCase())) {
                         int summa2 = amount * ConstructionMaterials.HAMMER.getPrice();
                         System.out.println("Total purchase amount :" + summa2);
                     } else if (ConstructionMaterials.CHANDELIER.name().equals(productName.toUpperCase())) {
                         int summa3 = amount *ConstructionMaterials.CHANDELIER.getPrice();
                         System.out.println("Total purchase amount :" + summa3);
                     } else if (ConstructionMaterials.LAMINATE.name().equals(productName.toUpperCase())) {
                         int summa4 = amount * ConstructionMaterials.LAMINATE.getPrice();
                         System.out.println("Total purchase amount :" + summa4);
                     } else if (ConstructionMaterials.WALLPAPER_FOR_WALLS.name().equals(productName.toUpperCase())) {
                         int summa5 = amount * ConstructionMaterials.WALLPAPER_FOR_WALLS.getPrice();
                         System.out.println("Total purchase amount :" + summa5);
                     } else if (ConstructionMaterials.WINDOW.name().equals(productName.toUpperCase())) {
                         int summa6 = amount * ConstructionMaterials.WINDOW.getPrice();
                         System.out.println("Total purchase amount :" + summa6);
                     } else {
                         System.out.println("Покупка завершена");
                     }
                 }
             }case "Hercules" -> {
                         while (true) {
                             System.out.print(" Write the product name!");
                             String productName = new Scanner(System.in).nextLine();
                             System.out.print(" Write the quantity of goods!");
                             int amount = new Scanner(System.in).nextInt();
                             if (CarParts.BATTERY.name().equals(productName.toUpperCase())) {
                                 int summa = amount * CarParts.BATTERY.getPrice();
                                 System.out.println("Total purchase amount : " + summa);
                             } else if (CarParts.BUMPERS.name().equals(productName.toUpperCase())) {
                                 int summa1 = amount * CarParts.BUMPERS.getPrice();
                                 System.out.println("Total purchase amount :" + summa1);
                             } else if (CarParts.CARPET.name().equals(productName.toUpperCase())) {
                                 int summa2 = amount * CarParts.CARPET.getPrice();
                                 System.out.println("Total purchase amount :" + summa2);
                             } else if (CarParts.LIGHT.name().equals(productName.toUpperCase())) {
                                 int summa3 = amount * CarParts.LIGHT.getPrice();
                                 System.out.println("Total purchase amount :" + summa3);
                             } else if (CarParts.MIRROR.name().equals(productName.toUpperCase())) {
                                 int summa4 = amount * CarParts.MIRROR.getPrice();
                                 System.out.println("Total purchase amount :" + summa4);
                             } else if (CarParts.SEAT_COVER.name().equals(productName.toUpperCase())) {
                                 int summa5 = amount * CarParts.SEAT_COVER.getPrice();
                                 System.out.println("Total purchase amount :" + summa5);
                             } else if (CarParts.TIRE.name().equals(productName.toUpperCase())) {
                                 int summa6 = amount * CarParts.TIRE.getPrice();
                                 System.out.println("Total purchase amount :" + summa6);
                             } else {
                                 System.out.println("Покупка завершена");
                             }
                         }
             }
             }return "Purchase completed successfully";

    }

    @Override
    public void getAllProduct() {
        for (Product product : Product.values()) {
            System.out.println(product);
        }

    }

    @Override
    public void getAllCarParts() {
        for (CarParts carparts : CarParts.values()) {
            System.out.println(carparts);
        }
    }

    @Override
    public void getAllConstructionMaterials() {
        for (ConstructionMaterials cons : ConstructionMaterials.values()) {
            System.out.println(cons);
        }
    }

    @Override
    public void sortPriceProduct() {
        int[] pro = {Product.BANANA.getPrice(), Product.APPLE.getPrice(), Product.BREAD.getPrice(), Product.CAKE.getPrice(), Product.POTATOES.getPrice(), Product.SUGAR.getPrice(), Product.TEA.getPrice()};
        Arrays.sort(pro);
        for (int p : pro) {
            System.out.println(p);
        }
        int [] car = {CarParts.TIRE.getPrice(),CarParts.LIGHT.getPrice(),CarParts.CARPET.getPrice(),CarParts.BUMPERS.getPrice(),CarParts.MIRROR.getPrice(),CarParts.SEAT_COVER.getPrice(),CarParts.BATTERY.getPrice()};
        Arrays.sort(car);
        for (int c:car) {
            System.out.println(c);
        }int [] con = {ConstructionMaterials.CHANDELIER.getPrice(),ConstructionMaterials.HAMMER.getPrice(),ConstructionMaterials.WINDOW.getPrice()
        ,ConstructionMaterials.DOOR.getPrice(),ConstructionMaterials.LAMINATE.getPrice(),ConstructionMaterials.WALLPAPER_FOR_WALLS.getPrice(),
        ConstructionMaterials.DYE.getPrice()};
        Arrays.sort(con);
        for (int ci:con) {
            System.out.println(ci);
        }
    }

    @Override
    public void searchWithProductMarketName(List<Frunze> frunzeList, List<Hercules> herculesList, List<GrandMaster> grandMasterList) {
        while (true) {
            System.out.println("Write the market name :");
            String marketName = new Scanner(System.in).nextLine();
            for (Frunze f : frunzeList) {
                if (marketName.equals(f.getName())) {
                    System.out.println(Arrays.toString(Product.values()));
                }
            }
            for (Hercules her : herculesList) {
                if (marketName.equals(her.getName())) {
                    System.out.println(Arrays.toString(CarParts.values()));
                }
            }
            for (GrandMaster gra : grandMasterList) {
                if (marketName.equals(gra.getName())) {
                    System.out.println(Arrays.toString(ConstructionMaterials.values()));
                }
            }
        }


    }


    @Override
    public String createMarket(List<Market> marketList) {
        markets.addAll(marketList);
        return "successfully save market";
    }

    @Override
    public String searchMarketName(List<Market> marketList) {
        System.out.println("Write market name : ");
        String name = new Scanner(System.in).nextLine();
        for (Market mar:marketList) {
            if(name.equals(mar.getName())){
                System.out.println(mar);
            }
        }
        return "Search market";
    }
}
