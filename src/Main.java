import Classes.MarketClasses.Frunze;
import Classes.MarketClasses.GrandMaster;
import Classes.MarketClasses.Hercules;
import Classes.MarketClasses.Market;
import Classes.PersonClasses.Person;
import Enums.*;
import Impl.MarketImpl;
import Impl.PersonImpl;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Azamatov Aktan", 24, Gender.MALE, BigDecimal.valueOf(5000), PositionMan.CIVIL_SERVANTS, Nationality.KYRGYZ);
        Person person1 = new Person("Kairat Nurtas", 34, Gender.MALE, BigDecimal.valueOf(15000), PositionMan.CIVIL_SERVANTS, Nationality.KAZAK);
        Person person2 = new Person("Petrov Sergei", 35, Gender.MALE, BigDecimal.valueOf(20000), PositionMan.MILITARY_PERSONNEL, Nationality.RUSSIA);
        Person person3 = new Person("John Johnson", 20, Gender.MALE, BigDecimal.valueOf(2000), PositionMan.STUDENT, Nationality.FOREIGNER);
        Person person4 = new Person("Karimova Asmira", 78, Gender.FEMALE, BigDecimal.valueOf(13000), PositionMan.ELDERLY, Nationality.UZBEK);
        ArrayList<Person> personArrayList = new ArrayList<>(
                Arrays.asList(person, person1, person2, person4, person3)
        );

        Frunze frunze = new Frunze("Frunze", BigDecimal.valueOf(20000), 2, "Bokonbaeva 12", Product.values());
        List<Frunze> frunzeList = new ArrayList<>();
        frunzeList.add(frunze);
        Hercules hercules = new Hercules("Hercules", BigDecimal.valueOf(30000), 1, "Asanbai 23", CarParts.values());
        List<Hercules> herculesList = new ArrayList<>();
        herculesList.add(hercules);
        GrandMaster grandMaster = new GrandMaster("Grand Master", BigDecimal.valueOf(25000), 3, "Toktogul 34", ConstructionMaterials.values());
        List<GrandMaster> grandMasterList = new ArrayList<>();
        grandMasterList.add(grandMaster);

        List<Market> marketList = new ArrayList<>();
        marketList.add(frunze);
        marketList.add(hercules);
        marketList.add(grandMaster);


        MarketImpl market = new MarketImpl();
        PersonImpl person5 = new PersonImpl();

        while (true) {
            System.out.print("""
                Press 1 : Buy Goods .
                Press 2 : Pay money.
                Press 3 : Get all product.
                Press 4 : Get all car parts.
                Press 5 : Get all construction materials.
                Press 6 : Sort Price product.
                Press 7 : Search with product market name.
                Press 8 : Create market.
                Press 9 : Create person.
                Press 10 : All Person.
                Press 11 : Search person name.
                Press 12 : Search market name.
                """);


            try {
                System.out.println("Write the number : ");
                int number = new Scanner(System.in).nextInt();
                switch (number) {
                    case 1 -> System.out.println(market.buyGoods());
                    case 2 -> System.out.println(market.payMoney(personArrayList, marketList));
                    case 3 -> market.getAllProduct();
                    case 4 -> market.getAllCarParts();
                    case 5 -> market.getAllConstructionMaterials();
                    case 6 -> market.sortPriceProduct();
                    case 7 -> market.searchWithProductMarketName(frunzeList, herculesList, grandMasterList);
                    case 8 -> System.out.println(market.createMarket(marketList));
                    case 9 -> System.out.println(person5.createPerson(personArrayList));
                    case 10 -> System.out.println(person5.allPerson());
                    case 11 -> System.out.println(person5.searchPersonName(personArrayList));
                    case 12 -> System.out.println(market.searchMarketName(marketList));
                }


            } catch (InputMismatchException e) {
                System.out.println("You must write a number not a word");

            }

        }
    }

}