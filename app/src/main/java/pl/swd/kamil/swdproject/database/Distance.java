package pl.swd.kamil.swdproject.database;

import java.io.Serializable;

/**
 * Created by Paulina on 2015-05-24.
 */
public class Distance implements Serializable {
    private static final long serialVersionUID = 6761938497287884391L;
    public Shop shop1;
    public Shop shop2;
    public int time;

    public Distance(Shop s1, Shop s2, int t)
    {
        shop1 = s1;
        shop2 = s2;
        time = t;
    }
}
