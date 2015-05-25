package pl.swd.kamil.swdproject.database;


import java.io.Serializable;

/**
 * Created by Paulina on 2015-05-24.
 */
public class Product implements Serializable,Comparable<Product> {
    private static final long serialVersionUID = 3570025276005658262L;
    public String name;
    public Category category;

    public Product(String n, Category cat)
    {
        name = n;
        category = cat;
    }

    public int compareTo(Product p)
    {
        return this.name.compareTo(p.name);
    }

    public static Product findProduct(String name)
    {
        for (Product p:Data.products)
        {
            if (p.name.equals(name))
            {
                return p;
            }
        }

        return null;
    }

}
