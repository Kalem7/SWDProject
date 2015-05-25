package pl.swd.kamil.swdproject.algorithm;

import java.util.ArrayList;

import pl.swd.kamil.swdproject.database.Shop;

/**
 * Created by Kamil on 2015-05-25.
 */
public class Value {

    public Shop x;
    public Shop u;
    public int v;

    public Value(Shop x, Shop u, int v)
    {
        this.x = x;
        this.u = u;
        this.v = v;
    }

    public static Value getMinValue(ArrayList<Value> values)
    {
        Value min = values.get(0);
        for (Value val: values)
        {
            if (val.v < min.v)
                min = val;

        }

        return min;

    }

    public static int getValueOf(ArrayList<Value> values, Shop x)
    {
        for (Value val: values)
        {
            if (val.x == x)
            {
                return val.v;
            }
        }

        return -1;
    }

    public static Shop getDecisionFor(ArrayList<Value> values, Shop x)
    {
        for (Value val: values)
        {
            if (val.x == x)
            {
                return val.u;
            }
        }

        return null;
    }

    public String toString()
    {
        return "x = "+x.name+", u = "+u.name+", v = "+v;
    }
}
