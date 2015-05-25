package pl.swd.kamil.swdproject.database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Paulina on 2015-05-24.
 */
public class Shop implements Serializable,Comparable<Shop> {
    private static final long serialVersionUID = -2497844329827947244L;
    public String name;
    public int floor;
    public ArrayList<Product> products;
    public HashMap<Shop,Integer> distances;
    public int imageResource;

    public Shop(String n, int f, int im)
    {
        name = n;
        floor = f;
        imageResource = im;
        products = new ArrayList<Product>();
        distances = new HashMap<Shop, Integer>();
        addShop(this,0);
    }

    public void addShop(Shop s, int time)
    {
        distances.put(s, time);
    }

    public void addProduct(Product p)
    {
        products.add(p);
    }

    public boolean isInShop(String product)
    {
        for (Product p:products)
        {
            if (p.name.equals(product))
            {
                return true;
            }
        }
        return false;
    }

    public int getDistance(Shop s)
    {
        return distances.get(s);
    }

    public int compareTo(Shop s)
    {
        return this.name.compareTo(s.name);
    }
}
