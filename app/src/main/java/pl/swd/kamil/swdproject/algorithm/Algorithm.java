package pl.swd.kamil.swdproject.algorithm;

import java.util.ArrayList;

import pl.swd.kamil.swdproject.database.*;
/**
 * Created by Kamil on 2015-05-25.
 */
public class Algorithm {
    public ArrayList<ArrayList<Shop>> places;
    public ArrayList<Shop> route;
    public ArrayList<ArrayList<Value>> values;

    public Algorithm(Shop localization)
    {
        places = new ArrayList<ArrayList<Shop>>();
        places.add(new ArrayList<Shop>());
        places.get(0).add(localization);
        route = new ArrayList<Shop>();
        values = new ArrayList<ArrayList<Value>>();
    }

    private void addPlaces(ArrayList<String> products)
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

    public Route chooseRoute(ArrayList<String> products)
    {
        addPlaces(products);
        ArrayList<Value> tempValues = new ArrayList<Value>();
        for(int i = places.size() - 1; i > 0; i--)
        {
            values.add(0, new ArrayList<Value>());
            for (Shop s: places.get(i-1))
            {
                tempValues.clear();
                for (Shop s2: places.get(i))
                {

                    if (values.size() > 1)
                    {
                        tempValues.add(new Value(s, s2, s.getDistance(s2) + Value.getValueOf(values.get(1), s2)));
                        System.out.println("i:" + i + " s1:" + s.name + " s2:" + s2.name+ " v: "+s.getDistance(s2)+"+"+Value.getValueOf(values.get(1),s2)+"="+(s.getDistance(s2)+Value.getValueOf(values.get(1), s2)));
                    }
                    else
                    {
                        tempValues.add(new Value(s, s2, s.getDistance(s2)));
                        System.out.println("i:" + i + " s1:" + s.name + " s2:" + s2.name + " v: "+s.getDistance(s2));
                    }
                }

                values.get(0).add(Value.getMinValue(tempValues));
            }


            for (Value v: values.get(0))
            {
                System.out.println(v);
            }
        }

        route.add(places.get(0).get(0));

        for (int i = 0; i < values.size(); i++)
        {
            route.add(Value.getDecisionFor(values.get(i), route.get(i)));
            System.out.println(Value.getDecisionFor(values.get(i), route.get(i)).name);
        }

        return new Route(route);
    }
}
