package pl.swd.kamil.swdproject.database;

import java.util.ArrayList;

import pl.swd.kamil.swdproject.R;

/**
 * Created by Paulina on 2015-05-24.
 */
public class Data {

    public static ArrayList<Shop> shops = null;
    public static ArrayList<Product> products = null;
    public static ArrayList<Category> categories = null;
    public static ArrayList<Distance> distances = null;

    public static void addData(){
        categories = new ArrayList<Category>();
        categories.add(new Category("Buty"));                   // 0
        categories.add(new Category("Odzież"));                 // 1
        categories.add(new Category("Bielizna"));               // 2
        categories.add(new Category("Akcesoria"));              // 3
        categories.add(new Category("Kosmetyki"));              // 4
        categories.add(new Category("Dom i multimedia"));       // 5

        products = new ArrayList<Product>();
        products.add(new Product("Bluzka",categories.get(1)));                  // 0
        products.add(new Product("Spodnie", categories.get(1)));                // 1
        products.add(new Product("Sukienka", categories.get(1)));               // 2
        products.add(new Product("Sweter", categories.get(1)));                 // 3
        products.add(new Product("Bluza", categories.get(1)));                  // 4
        products.add(new Product("Koszulka", categories.get(1)));               // 5
        products.add(new Product("Sukienka", categories.get(1)));               // 6
        products.add(new Product("Skarpety", categories.get(2)));               // 7
        products.add(new Product("Majtki", categories.get(2)));                 // 8
        products.add(new Product("Biustonosz", categories.get(2)));             // 9
        products.add(new Product("Buty eleganckie", categories.get(0)));        // 10
        products.add(new Product("Buty sportowe", categories.get(0)));          // 11
        products.add(new Product("Buty młodzieżowe", categories.get(0)));       // 12
        products.add(new Product("Torebka", categories.get(3)));                // 13
        products.add(new Product("Bransoletka", categories.get(3)));            // 14
        products.add(new Product("Kolczyki", categories.get(3)));               // 15
        products.add(new Product("Naszyjnik", categories.get(3)));              // 16
        products.add(new Product("Pasek", categories.get(3)));                  // 17
        products.add(new Product("Portfel", categories.get(3)));                // 18
        products.add(new Product("Perfumy", categories.get(4)));                // 19
        products.add(new Product("Krem do rąk", categories.get(4)));            // 20
        products.add(new Product("Tusz do rzęs", categories.get(4)));           // 21
        products.add(new Product("Balsam do ciała", categories.get(4)));        // 22
        products.add(new Product("Mydło", categories.get(4)));                  // 23
        products.add(new Product("Szampon do włosów", categories.get(4)));      // 24
        products.add(new Product("Żel pod prysznic", categories.get(4)));       // 25
        products.add(new Product("Laptop", categories.get(5)));                 // 26
        products.add(new Product("Mysz", categories.get(5)));                   // 27
        products.add(new Product("Klawiatura", categories.get(5)));             // 28
        products.add(new Product("Monitor", categories.get(5)));                // 29
        products.add(new Product("Laptop", categories.get(5)));                 // 30
        products.add(new Product("Tablet", categories.get(5)));                 // 31
        products.add(new Product("Aparat fotograficzny", categories.get(5)));   // 32
        products.add(new Product("Garnek", categories.get(5)));                 // 33
        products.add(new Product("Talerz", categories.get(5)));                 // 34
        products.add(new Product("Kubek", categories.get(5)));                  // 35
        products.add(new Product("Książka", categories.get(5)));                // 36
        products.add(new Product("Garnitur", categories.get(2)));


        shops = new ArrayList<Shop>();
        shops.add(new Shop("Duka", 0, R.mipmap.deichmann1));                // 0
        shops.add(new Shop("Home&You",1, R.mipmap.deichmann1));             // 1
        shops.add(new Shop("X-KOM",-1, R.mipmap.deichmann1));               // 2
        shops.add(new Shop("Saturn",1, R.mipmap.deichmann1));               // 3
        shops.add(new Shop("Empik",0, R.mipmap.deichmann1));                // 4
        shops.add(new Shop("Matras",0, R.mipmap.deichmann1));               // 5
        shops.add(new Shop("Saturn",1, R.mipmap.deichmann1));               // 6
        shops.add(new Shop("Deichmann",-1, R.mipmap.deichmann1));           // 7
        shops.add(new Shop("CCC",-1, R.mipmap.deichmann1));                 // 8
        shops.add(new Shop("Heavy Duty",-1, R.mipmap.deichmann1));          // 9
        shops.add(new Shop("McArthur",1, R.mipmap.deichmann1));             // 10
        shops.add(new Shop("Kazar",1, R.mipmap.deichmann1));                // 11
        shops.add(new Shop("Saturn",1, R.mipmap.deichmann1));               // 12
        shops.add(new Shop("Atlantic",1, R.mipmap.deichmann1));             // 13
        shops.add(new Shop("Bershka",1, R.mipmap.deichmann1));              // 14
        shops.add(new Shop("Carry",1, R.mipmap.deichmann1));                // 15
        shops.add(new Shop("Cropp Town",1, R.mipmap.deichmann1));           // 16
        shops.add(new Shop("Diverse",1, R.mipmap.deichmann1));              // 17
        shops.add(new Shop("Calzedonia",1, R.mipmap.deichmann1));           // 18
        shops.add(new Shop("House",1, R.mipmap.deichmann1));                // 19
        shops.add(new Shop("New Yorker",1, R.mipmap.deichmann1));           // 20
        shops.add(new Shop("Lavard",1, R.mipmap.deichmann1));               // 21
        shops.add(new Shop("Wólczanka",1, R.mipmap.deichmann1));            // 22
        shops.add(new Shop("Rossman",1, R.mipmap.deichmann1));              // 23
        shops.add(new Shop("Wólczanka",1, R.mipmap.deichmann1));            // 24
        shops.add(new Shop("Inglot",1, R.mipmap.deichmann1));               // 25
        shops.add(new Shop("Sephora",1, R.mipmap.deichmann1));              // 26
        shops.add(new Shop("Douglas",1, R.mipmap.deichmann1));              // 27
        shops.add(new Shop("Yves Rocher",1, R.mipmap.deichmann1));          // 28
        shops.add(new Shop("Apart",1, R.mipmap.deichmann1));                // 29
        shops.add(new Shop("W.KRUK",1, R.mipmap.deichmann1));               // 30
        shops.add(new Shop("YES",1, R.mipmap.deichmann1));                  // 31
        shops.add(new Shop("I am",1, R.mipmap.deichmann1));                 // 32
        shops.add(new Shop("Briju",1, R.mipmap.deichmann1));                // 33

    }
}
