package pl.swd.kamil.swdproject.algorithm;

import java.util.ArrayList;

import pl.swd.kamil.swdproject.database.*;
/**
 * Created by Kamil on 2015-05-25.
 */
public class Algorithm {
    public ArrayList<ArrayList<Shop>> places;

    public Algorithm(Shop localization)
    {
        places = new ArrayList<ArrayList<Shop>>();
        places.add(new ArrayList<Shop>());
        places.get(0).add(localization);
    }

    public void addPlaces(ArrayList<String> products)
    {
        for(String p: products)
        {
            places.add(findShops(p));
        }
    }

    public ArrayList<Shop> findShops(String p)
    {
        ArrayList<Shop> shops = new ArrayList<Shop>();

        for (Shop s: Data.shops)
        {
            if (s.isInShop(p))
            {
                shops.add(s);
            }
        }

        return shops;
    }
}
