package Service;

import Classes.MarketClasses.Frunze;
import Classes.MarketClasses.GrandMaster;
import Classes.MarketClasses.Hercules;
import Classes.MarketClasses.Market;
import Classes.PersonClasses.Person;
import Enums.CarParts;
import Enums.ConstructionMaterials;
import Enums.Product;

import java.util.List;

public interface MarketService {
   String buyGoods();
   void getAllProduct();
   void getAllCarParts();
   void getAllConstructionMaterials();
   void sortPriceProduct();
   void searchWithProductMarketName(List<Frunze>frunzeList, List<Hercules>herculesList, List<GrandMaster>grandMasterList);
   String payMoney(List<Person>personList,List<Market>marketList);

   String createMarket(List<Market>marketList);
   String searchMarketName (List<Market>marketList);
}
