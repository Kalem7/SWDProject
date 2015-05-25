package pl.swd.kamil.swdproject.algorithm;

import java.io.Serializable;
import java.util.ArrayList;

import pl.swd.kamil.swdproject.database.Shop;

/**
 * Created by Paulina on 2015-05-25.
 */
public class Route implements Serializable{
    private static final long serialVersionUID = -3606408400742030716L;
    public ArrayList<Shop> shops;

    public Route(ArrayList<Shop> s)
    {
        shops = s;
    }

    public int getLength()
    {
        return shops.size();
    }
}
