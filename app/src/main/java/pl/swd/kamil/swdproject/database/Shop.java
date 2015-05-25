package pl.swd.kamil.swdproject.database;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Paulina on 2015-05-24.
 */
public class Shop implements Serializable {
    private static final long serialVersionUID = -2497844329827947244L;
    public String name;
    public int floor;
    public ArrayList<Product> products;
    public int imageResource;

    public Shop(String n, int f, int im)
    {
        name = n;
        floor = f;
        imageResource = im;
        products = new ArrayList<Product>();
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
}
