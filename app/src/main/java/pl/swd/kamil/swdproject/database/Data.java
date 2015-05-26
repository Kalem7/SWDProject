package pl.swd.kamil.swdproject.database;

import java.util.ArrayList;
import java.util.Collections;

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
        products.add(new Product("Spódnica", categories.get(1)));               // 6
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
        products.add(new Product("Komputer PC", categories.get(5)));            // 30
        products.add(new Product("Tablet", categories.get(5)));                 // 31
        products.add(new Product("Aparat fotograficzny", categories.get(5)));   // 32
        products.add(new Product("Garnek", categories.get(5)));                 // 33
        products.add(new Product("Talerz", categories.get(5)));                 // 34
        products.add(new Product("Kubek", categories.get(5)));                  // 35
        products.add(new Product("Książka", categories.get(5)));                // 36
        products.add(new Product("Garnitur", categories.get(2)));               // 37
        products.add(new Product("Ręcznik", categories.get(5)));               // 38

        shops = new ArrayList<Shop>();
        shops.add(new Shop("Duka", 0, R.mipmap.duka));                          // 0
        shops.add(new Shop("Home&You",1, R.mipmap.hy));                         // 1
        shops.add(new Shop("X-KOM",-1, R.mipmap.x_kom));                        // 2
        shops.add(new Shop("Saturn",1, R.mipmap.saturn));                       // 3
        shops.add(new Shop("Empik",0, R.mipmap.empik));                         // 4
        shops.add(new Shop("Matras",0, R.mipmap.matras));                       // 5
        shops.add(new Shop("Sony Center",1, R.mipmap.sony));                    // 6
        shops.add(new Shop("Deichmann",-1, R.mipmap.deichmann1));               // 7
        shops.add(new Shop("CCC",-1, R.mipmap.ccc));                            // 8
        shops.add(new Shop("Heavy Duty",-1, R.mipmap.hd_1));                    // 9
        shops.add(new Shop("McArthur",1, R.mipmap.mc_arthur));                  // 10
        shops.add(new Shop("Kazar",0, R.mipmap.kazar));                         // 11
        shops.add(new Shop("Kari",-1, R.mipmap.kari));                          // 12
        shops.add(new Shop("Atlantic",1, R.mipmap.atlantic));                   // 13
        shops.add(new Shop("Bershka",0, R.mipmap.bershka));                     // 14
        shops.add(new Shop("Carry",1, R.mipmap.carry));                         // 15
        shops.add(new Shop("Cropp Town",-1, R.mipmap.cropp));                   // 16
        shops.add(new Shop("Diverse",1, R.mipmap.diverse));                     // 17
        shops.add(new Shop("Calzedonia",0, R.mipmap.calzedonia));               // 18
        shops.add(new Shop("House", -1, R.mipmap.house));                        // 19
        shops.add(new Shop("New Yorker", 1, R.mipmap.new_yorker));               // 20
        shops.add(new Shop("Lavard", 0, R.mipmap.lavard));                       // 21
        shops.add(new Shop("Rossmann", -1, R.mipmap.rossmann));                  // 22
        shops.add(new Shop("Wólczanka", 0, R.mipmap.wolczanka));                // 23
        shops.add(new Shop("Inglot", -1, R.mipmap.inglot));                     // 24
        shops.add(new Shop("Sephora", 0, R.mipmap.sephora));                    // 25
        shops.add(new Shop("Douglas", 0, R.mipmap.douglas));                    // 26
        shops.add(new Shop("Yves Rocher", 0, R.mipmap.yves_rocher));            // 27
        shops.add(new Shop("Apart", 1, R.mipmap.apart));                        // 28
        shops.add(new Shop("W.KRUK", 1, R.mipmap.kruk));                        // 29
        shops.add(new Shop("YES", 0, R.mipmap.yes));                            // 30
        shops.add(new Shop("I am", 0, R.mipmap.i_am));                          // 31
        shops.add(new Shop("Briju", 0, R.mipmap.briju));                        // 32

        shops.add(new Shop("Wejście główne", 1, -1));                           // 33
        shops.add(new Shop("Wejście poziom -1", 1, -1));                        // 34
        shops.add(new Shop("Wejście od ul. Słowiańskiej", 1, -1));              // 35



        //duka
        shops.get(0).addProduct(products.get(33));
        shops.get(0).addProduct(products.get(34));
        shops.get(0).addProduct(products.get(35));

        //home&you
        shops.get(1).addProduct(products.get(33));
        shops.get(1).addProduct(products.get(34));
        shops.get(1).addProduct(products.get(35));
        shops.get(1).addProduct(products.get(38));

        //x-kom
        shops.get(2).addProduct(products.get(26));
        shops.get(2).addProduct(products.get(27));
        shops.get(2).addProduct(products.get(28));
        shops.get(2).addProduct(products.get(29));
        shops.get(2).addProduct(products.get(30));
        shops.get(2).addProduct(products.get(31));

        //saturn
        shops.get(3).addProduct(products.get(26));
        shops.get(3).addProduct(products.get(27));
        shops.get(3).addProduct(products.get(28));
        shops.get(3).addProduct(products.get(29));
        shops.get(3).addProduct(products.get(30));
        shops.get(3).addProduct(products.get(31));
        shops.get(3).addProduct(products.get(32));

        //empik
        shops.get(4).addProduct(products.get(35));
        shops.get(4).addProduct(products.get(36));

        //matras
        shops.get(5).addProduct(products.get(36));

        //sony center
        shops.get(6).addProduct(products.get(26));
        shops.get(6).addProduct(products.get(27));
        shops.get(6).addProduct(products.get(28));
        shops.get(6).addProduct(products.get(31));
        shops.get(6).addProduct(products.get(32));

        //deichmann
        shops.get(7).addProduct(products.get(10));
        shops.get(7).addProduct(products.get(11));
        shops.get(7).addProduct(products.get(12));
        shops.get(7).addProduct(products.get(7));
        shops.get(7).addProduct(products.get(13));
        shops.get(7).addProduct(products.get(18));

        //ccc
        shops.get(8).addProduct(products.get(10));
        shops.get(8).addProduct(products.get(11));
        shops.get(8).addProduct(products.get(12));
        shops.get(8).addProduct(products.get(13));

        //heavy duty
        shops.get(9).addProduct(products.get(10));
        shops.get(9).addProduct(products.get(12));

        //mcartur
        shops.get(10).addProduct(products.get(10));
        shops.get(10).addProduct(products.get(11));
        shops.get(10).addProduct(products.get(12));

        //kazar
        shops.get(11).addProduct(products.get(10));

        //kari
        shops.get(12).addProduct(products.get(10));
        shops.get(12).addProduct(products.get(12));
        shops.get(12).addProduct(products.get(13));

        //atlantic
        shops.get(13).addProduct(products.get(8));
        shops.get(13).addProduct(products.get(9));

        //bershka
        shops.get(14).addProduct(products.get(0));
        shops.get(14).addProduct(products.get(1));
        shops.get(14).addProduct(products.get(2));
        shops.get(14).addProduct(products.get(3));
        shops.get(14).addProduct(products.get(4));
        shops.get(14).addProduct(products.get(5));
        shops.get(14).addProduct(products.get(6));
        shops.get(14).addProduct(products.get(17));

        //carry
        shops.get(15).addProduct(products.get(0));
        shops.get(15).addProduct(products.get(1));
        shops.get(15).addProduct(products.get(2));
        shops.get(15).addProduct(products.get(3));
        shops.get(15).addProduct(products.get(4));
        shops.get(15).addProduct(products.get(5));
        shops.get(15).addProduct(products.get(6));
        shops.get(15).addProduct(products.get(17));

        //cropp
        shops.get(16).addProduct(products.get(0));
        shops.get(16).addProduct(products.get(1));
        shops.get(16).addProduct(products.get(2));
        shops.get(16).addProduct(products.get(3));
        shops.get(16).addProduct(products.get(4));
        shops.get(16).addProduct(products.get(5));
        shops.get(16).addProduct(products.get(6));
        shops.get(16).addProduct(products.get(18));

        //diverse
        shops.get(17).addProduct(products.get(0));
        shops.get(17).addProduct(products.get(1));
        shops.get(17).addProduct(products.get(2));
        shops.get(17).addProduct(products.get(3));
        shops.get(17).addProduct(products.get(4));
        shops.get(17).addProduct(products.get(5));
        shops.get(17).addProduct(products.get(6));

        //calzedonia
        shops.get(18).addProduct(products.get(8));
        shops.get(18).addProduct(products.get(9));

        //house
        shops.get(19).addProduct(products.get(0));
        shops.get(19).addProduct(products.get(1));
        shops.get(19).addProduct(products.get(2));
        shops.get(19).addProduct(products.get(3));
        shops.get(19).addProduct(products.get(4));
        shops.get(19).addProduct(products.get(5));
        shops.get(19).addProduct(products.get(6));
        shops.get(19).addProduct(products.get(18));

        //new yorker
        shops.get(20).addProduct(products.get(0));
        shops.get(20).addProduct(products.get(1));
        shops.get(20).addProduct(products.get(2));
        shops.get(20).addProduct(products.get(3));
        shops.get(20).addProduct(products.get(4));
        shops.get(20).addProduct(products.get(5));
        shops.get(20).addProduct(products.get(6));

        //lavard
        shops.get(21).addProduct(products.get(10));
        shops.get(21).addProduct(products.get(37));

        //rossmann
        shops.get(22).addProduct(products.get(19));
        shops.get(22).addProduct(products.get(20));
        shops.get(22).addProduct(products.get(21));
        shops.get(22).addProduct(products.get(22));
        shops.get(22).addProduct(products.get(23));
        shops.get(22).addProduct(products.get(24));
        shops.get(22).addProduct(products.get(25));

        //wólczanka
        shops.get(23).addProduct(products.get(10));
        shops.get(23).addProduct(products.get(37));

        //inglot
        shops.get(24).addProduct(products.get(21));

        //sephora
        shops.get(25).addProduct(products.get(19));
        shops.get(25).addProduct(products.get(20));
        shops.get(25).addProduct(products.get(21));
        shops.get(25).addProduct(products.get(22));

        //douglas
        shops.get(26).addProduct(products.get(19));
        shops.get(26).addProduct(products.get(20));
        shops.get(26).addProduct(products.get(21));
        shops.get(26).addProduct(products.get(22));

        //yves rocher
        shops.get(27).addProduct(products.get(19));
        shops.get(27).addProduct(products.get(20));
        shops.get(27).addProduct(products.get(21));
        shops.get(27).addProduct(products.get(22));
        shops.get(27).addProduct(products.get(23));
        shops.get(27).addProduct(products.get(24));
        shops.get(27).addProduct(products.get(25));

        //apart
        shops.get(28).addProduct(products.get(14));
        shops.get(28).addProduct(products.get(15));
        shops.get(28).addProduct(products.get(16));

        //w.kruk
        shops.get(29).addProduct(products.get(14));
        shops.get(29).addProduct(products.get(15));
        shops.get(29).addProduct(products.get(16));

        //yes
        shops.get(30).addProduct(products.get(14));
        shops.get(30).addProduct(products.get(15));
        shops.get(30).addProduct(products.get(16));

        //i am
        shops.get(31).addProduct(products.get(14));
        shops.get(31).addProduct(products.get(15));
        shops.get(31).addProduct(products.get(16));

        //briju
        shops.get(32).addProduct(products.get(14));
        shops.get(32).addProduct(products.get(15));
        shops.get(32).addProduct(products.get(16));

        distances = new ArrayList<Distance>();
        distances.add(new Distance(shops.get(0), shops.get(1), 254));
        distances.add(new Distance(shops.get(0), shops.get(2), 13));
        distances.add(new Distance(shops.get(0), shops.get(3), 262));
        distances.add(new Distance(shops.get(0), shops.get(4), 48));
        distances.add(new Distance(shops.get(0), shops.get(5), 84));
        distances.add(new Distance(shops.get(0), shops.get(6), 212));
        distances.add(new Distance(shops.get(0), shops.get(7), 50));
        distances.add(new Distance(shops.get(0), shops.get(8), 154));
        distances.add(new Distance(shops.get(0), shops.get(9), 153));
        distances.add(new Distance(shops.get(0), shops.get(10), 136));
        distances.add(new Distance(shops.get(0), shops.get(11), 116));
        distances.add(new Distance(shops.get(0), shops.get(12), 166));
        distances.add(new Distance(shops.get(0), shops.get(13), 100));
        distances.add(new Distance(shops.get(0), shops.get(14), 50));
        distances.add(new Distance(shops.get(0), shops.get(15), 175));
        distances.add(new Distance(shops.get(0), shops.get(16), 293));
        distances.add(new Distance(shops.get(0), shops.get(17), 40));
        distances.add(new Distance(shops.get(0), shops.get(18), 105));
        distances.add(new Distance(shops.get(0), shops.get(19), 65));
        distances.add(new Distance(shops.get(0), shops.get(20), 25));
        distances.add(new Distance(shops.get(0), shops.get(21), 56));
        distances.add(new Distance(shops.get(0), shops.get(22), 290));
        distances.add(new Distance(shops.get(0), shops.get(23), 143));
        distances.add(new Distance(shops.get(0), shops.get(24), 266));
        distances.add(new Distance(shops.get(0), shops.get(25), 271));
        distances.add(new Distance(shops.get(0), shops.get(26), 229));
        distances.add(new Distance(shops.get(0), shops.get(27), 18));
        distances.add(new Distance(shops.get(0), shops.get(28), 167));
        distances.add(new Distance(shops.get(0), shops.get(29), 78));
        distances.add(new Distance(shops.get(0), shops.get(30), 102));
        distances.add(new Distance(shops.get(0), shops.get(31), 237));
        distances.add(new Distance(shops.get(0), shops.get(32), 249));
        distances.add(new Distance(shops.get(0), shops.get(33), 229));
        distances.add(new Distance(shops.get(0), shops.get(34), 41));
        distances.add(new Distance(shops.get(0), shops.get(35), 227));
        distances.add(new Distance(shops.get(1), shops.get(2), 260));
        distances.add(new Distance(shops.get(1), shops.get(3), 257));
        distances.add(new Distance(shops.get(1), shops.get(4), 226));
        distances.add(new Distance(shops.get(1), shops.get(5), 227));
        distances.add(new Distance(shops.get(1), shops.get(6), 79));
        distances.add(new Distance(shops.get(1), shops.get(7), 194));
        distances.add(new Distance(shops.get(1), shops.get(8), 104));
        distances.add(new Distance(shops.get(1), shops.get(9), 247));
        distances.add(new Distance(shops.get(1), shops.get(10), 49));
        distances.add(new Distance(shops.get(1), shops.get(11), 50));
        distances.add(new Distance(shops.get(1), shops.get(12), 110));
        distances.add(new Distance(shops.get(1), shops.get(13), 187));
        distances.add(new Distance(shops.get(1), shops.get(14), 284));
        distances.add(new Distance(shops.get(1), shops.get(15), 66));
        distances.add(new Distance(shops.get(1), shops.get(16), 139));
        distances.add(new Distance(shops.get(1), shops.get(17), 97));
        distances.add(new Distance(shops.get(1), shops.get(18), 133));
        distances.add(new Distance(shops.get(1), shops.get(19), 282));
        distances.add(new Distance(shops.get(1), shops.get(20), 106));
        distances.add(new Distance(shops.get(1), shops.get(21), 84));
        distances.add(new Distance(shops.get(1), shops.get(22), 163));
        distances.add(new Distance(shops.get(1), shops.get(23), 256));
        distances.add(new Distance(shops.get(1), shops.get(24), 72));
        distances.add(new Distance(shops.get(1), shops.get(25), 169));
        distances.add(new Distance(shops.get(1), shops.get(26), 261));
        distances.add(new Distance(shops.get(1), shops.get(27), 61));
        distances.add(new Distance(shops.get(1), shops.get(28), 189));
        distances.add(new Distance(shops.get(1), shops.get(29), 281));
        distances.add(new Distance(shops.get(1), shops.get(30), 91));
        distances.add(new Distance(shops.get(1), shops.get(31), 205));
        distances.add(new Distance(shops.get(1), shops.get(32), 171));
        distances.add(new Distance(shops.get(1), shops.get(33), 95));
        distances.add(new Distance(shops.get(1), shops.get(34), 114));
        distances.add(new Distance(shops.get(1), shops.get(35), 151));
        distances.add(new Distance(shops.get(2), shops.get(3), 262));
        distances.add(new Distance(shops.get(2), shops.get(4), 52));
        distances.add(new Distance(shops.get(2), shops.get(5), 296));
        distances.add(new Distance(shops.get(2), shops.get(6), 299));
        distances.add(new Distance(shops.get(2), shops.get(7), 96));
        distances.add(new Distance(shops.get(2), shops.get(8), 183));
        distances.add(new Distance(shops.get(2), shops.get(9), 78));
        distances.add(new Distance(shops.get(2), shops.get(10), 153));
        distances.add(new Distance(shops.get(2), shops.get(11), 254));
        distances.add(new Distance(shops.get(2), shops.get(12), 300));
        distances.add(new Distance(shops.get(2), shops.get(13), 117));
        distances.add(new Distance(shops.get(2), shops.get(14), 103));
        distances.add(new Distance(shops.get(2), shops.get(15), 75));
        distances.add(new Distance(shops.get(2), shops.get(16), 80));
        distances.add(new Distance(shops.get(2), shops.get(17), 234));
        distances.add(new Distance(shops.get(2), shops.get(18), 15));
        distances.add(new Distance(shops.get(2), shops.get(19), 131));
        distances.add(new Distance(shops.get(2), shops.get(20), 231));
        distances.add(new Distance(shops.get(2), shops.get(21), 44));
        distances.add(new Distance(shops.get(2), shops.get(22), 10));
        distances.add(new Distance(shops.get(2), shops.get(23), 9));
        distances.add(new Distance(shops.get(2), shops.get(24), 225));
        distances.add(new Distance(shops.get(2), shops.get(25), 45));
        distances.add(new Distance(shops.get(2), shops.get(26), 251));
        distances.add(new Distance(shops.get(2), shops.get(27), 275));
        distances.add(new Distance(shops.get(2), shops.get(28), 32));
        distances.add(new Distance(shops.get(2), shops.get(29), 208));
        distances.add(new Distance(shops.get(2), shops.get(30), 296));
        distances.add(new Distance(shops.get(2), shops.get(31), 147));
        distances.add(new Distance(shops.get(2), shops.get(32), 290));
        distances.add(new Distance(shops.get(2), shops.get(33), 80));
        distances.add(new Distance(shops.get(2), shops.get(34), 133));
        distances.add(new Distance(shops.get(2), shops.get(35), 96));
        distances.add(new Distance(shops.get(3), shops.get(4), 40));
        distances.add(new Distance(shops.get(3), shops.get(5), 160));
        distances.add(new Distance(shops.get(3), shops.get(6), 17));
        distances.add(new Distance(shops.get(3), shops.get(7), 184));
        distances.add(new Distance(shops.get(3), shops.get(8), 31));
        distances.add(new Distance(shops.get(3), shops.get(9), 26));
        distances.add(new Distance(shops.get(3), shops.get(10), 110));
        distances.add(new Distance(shops.get(3), shops.get(11), 290));
        distances.add(new Distance(shops.get(3), shops.get(12), 204));
        distances.add(new Distance(shops.get(3), shops.get(13), 58));
        distances.add(new Distance(shops.get(3), shops.get(14), 97));
        distances.add(new Distance(shops.get(3), shops.get(15), 285));
        distances.add(new Distance(shops.get(3), shops.get(16), 203));
        distances.add(new Distance(shops.get(3), shops.get(17), 180));
        distances.add(new Distance(shops.get(3), shops.get(18), 57));
        distances.add(new Distance(shops.get(3), shops.get(19), 152));
        distances.add(new Distance(shops.get(3), shops.get(20), 96));
        distances.add(new Distance(shops.get(3), shops.get(21), 162));
        distances.add(new Distance(shops.get(3), shops.get(22), 288));
        distances.add(new Distance(shops.get(3), shops.get(23), 129));
        distances.add(new Distance(shops.get(3), shops.get(24), 91));
        distances.add(new Distance(shops.get(3), shops.get(25), 209));
        distances.add(new Distance(shops.get(3), shops.get(26), 44));
        distances.add(new Distance(shops.get(3), shops.get(27), 13));
        distances.add(new Distance(shops.get(3), shops.get(28), 92));
        distances.add(new Distance(shops.get(3), shops.get(29), 94));
        distances.add(new Distance(shops.get(3), shops.get(30), 192));
        distances.add(new Distance(shops.get(3), shops.get(31), 222));
        distances.add(new Distance(shops.get(3), shops.get(32), 281));
        distances.add(new Distance(shops.get(3), shops.get(33), 127));
        distances.add(new Distance(shops.get(3), shops.get(34), 201));
        distances.add(new Distance(shops.get(3), shops.get(35), 50));
        distances.add(new Distance(shops.get(4), shops.get(5), 253));
        distances.add(new Distance(shops.get(4), shops.get(6), 22));
        distances.add(new Distance(shops.get(4), shops.get(7), 195));
        distances.add(new Distance(shops.get(4), shops.get(8), 240));
        distances.add(new Distance(shops.get(4), shops.get(9), 162));
        distances.add(new Distance(shops.get(4), shops.get(10), 128));
        distances.add(new Distance(shops.get(4), shops.get(11), 204));
        distances.add(new Distance(shops.get(4), shops.get(12), 300));
        distances.add(new Distance(shops.get(4), shops.get(13), 69));
        distances.add(new Distance(shops.get(4), shops.get(14), 264));
        distances.add(new Distance(shops.get(4), shops.get(15), 46));
        distances.add(new Distance(shops.get(4), shops.get(16), 287));
        distances.add(new Distance(shops.get(4), shops.get(17), 133));
        distances.add(new Distance(shops.get(4), shops.get(18), 177));
        distances.add(new Distance(shops.get(4), shops.get(19), 214));
        distances.add(new Distance(shops.get(4), shops.get(20), 169));
        distances.add(new Distance(shops.get(4), shops.get(21), 246));
        distances.add(new Distance(shops.get(4), shops.get(22), 135));
        distances.add(new Distance(shops.get(4), shops.get(23), 70));
        distances.add(new Distance(shops.get(4), shops.get(24), 274));
        distances.add(new Distance(shops.get(4), shops.get(25), 268));
        distances.add(new Distance(shops.get(4), shops.get(26), 35));
        distances.add(new Distance(shops.get(4), shops.get(27), 45));
        distances.add(new Distance(shops.get(4), shops.get(28), 17));
        distances.add(new Distance(shops.get(4), shops.get(29), 246));
        distances.add(new Distance(shops.get(4), shops.get(30), 170));
        distances.add(new Distance(shops.get(4), shops.get(31), 209));
        distances.add(new Distance(shops.get(4), shops.get(32), 174));
        distances.add(new Distance(shops.get(4), shops.get(33), 148));
        distances.add(new Distance(shops.get(4), shops.get(34), 186));
        distances.add(new Distance(shops.get(4), shops.get(35), 31));
        distances.add(new Distance(shops.get(5), shops.get(6), 267));
        distances.add(new Distance(shops.get(5), shops.get(7), 111));
        distances.add(new Distance(shops.get(5), shops.get(8), 5));
        distances.add(new Distance(shops.get(5), shops.get(9), 230));
        distances.add(new Distance(shops.get(5), shops.get(10), 87));
        distances.add(new Distance(shops.get(5), shops.get(11), 164));
        distances.add(new Distance(shops.get(5), shops.get(12), 285));
        distances.add(new Distance(shops.get(5), shops.get(13), 240));
        distances.add(new Distance(shops.get(5), shops.get(14), 160));
        distances.add(new Distance(shops.get(5), shops.get(15), 142));
        distances.add(new Distance(shops.get(5), shops.get(16), 98));
        distances.add(new Distance(shops.get(5), shops.get(17), 38));
        distances.add(new Distance(shops.get(5), shops.get(18), 37));
        distances.add(new Distance(shops.get(5), shops.get(19), 165));
        distances.add(new Distance(shops.get(5), shops.get(20), 234));
        distances.add(new Distance(shops.get(5), shops.get(21), 135));
        distances.add(new Distance(shops.get(5), shops.get(22), 158));
        distances.add(new Distance(shops.get(5), shops.get(23), 199));
        distances.add(new Distance(shops.get(5), shops.get(24), 8));
        distances.add(new Distance(shops.get(5), shops.get(25), 296));
        distances.add(new Distance(shops.get(5), shops.get(26), 80));
        distances.add(new Distance(shops.get(5), shops.get(27), 89));
        distances.add(new Distance(shops.get(5), shops.get(28), 81));
        distances.add(new Distance(shops.get(5), shops.get(29), 286));
        distances.add(new Distance(shops.get(5), shops.get(30), 74));
        distances.add(new Distance(shops.get(5), shops.get(31), 148));
        distances.add(new Distance(shops.get(5), shops.get(32), 92));
        distances.add(new Distance(shops.get(5), shops.get(33), 12));
        distances.add(new Distance(shops.get(5), shops.get(34), 184));
        distances.add(new Distance(shops.get(5), shops.get(35), 108));
        distances.add(new Distance(shops.get(6), shops.get(7), 76));
        distances.add(new Distance(shops.get(6), shops.get(8), 294));
        distances.add(new Distance(shops.get(6), shops.get(9), 67));
        distances.add(new Distance(shops.get(6), shops.get(10), 72));
        distances.add(new Distance(shops.get(6), shops.get(11), 64));
        distances.add(new Distance(shops.get(6), shops.get(12), 179));
        distances.add(new Distance(shops.get(6), shops.get(13), 25));
        distances.add(new Distance(shops.get(6), shops.get(14), 274));
        distances.add(new Distance(shops.get(6), shops.get(15), 230));
        distances.add(new Distance(shops.get(6), shops.get(16), 57));
        distances.add(new Distance(shops.get(6), shops.get(17), 37));
        distances.add(new Distance(shops.get(6), shops.get(18), 125));
        distances.add(new Distance(shops.get(6), shops.get(19), 229));
        distances.add(new Distance(shops.get(6), shops.get(20), 65));
        distances.add(new Distance(shops.get(6), shops.get(21), 105));
        distances.add(new Distance(shops.get(6), shops.get(22), 46));
        distances.add(new Distance(shops.get(6), shops.get(23), 282));
        distances.add(new Distance(shops.get(6), shops.get(24), 213));
        distances.add(new Distance(shops.get(6), shops.get(25), 215));
        distances.add(new Distance(shops.get(6), shops.get(26), 292));
        distances.add(new Distance(shops.get(6), shops.get(27), 198));
        distances.add(new Distance(shops.get(6), shops.get(28), 167));
        distances.add(new Distance(shops.get(6), shops.get(29), 288));
        distances.add(new Distance(shops.get(6), shops.get(30), 243));
        distances.add(new Distance(shops.get(6), shops.get(31), 147));
        distances.add(new Distance(shops.get(6), shops.get(32), 38));
        distances.add(new Distance(shops.get(6), shops.get(33), 128));
        distances.add(new Distance(shops.get(6), shops.get(34), 87));
        distances.add(new Distance(shops.get(6), shops.get(35), 136));
        distances.add(new Distance(shops.get(7), shops.get(8), 113));
        distances.add(new Distance(shops.get(7), shops.get(9), 296));
        distances.add(new Distance(shops.get(7), shops.get(10), 134));
        distances.add(new Distance(shops.get(7), shops.get(11), 110));
        distances.add(new Distance(shops.get(7), shops.get(12), 155));
        distances.add(new Distance(shops.get(7), shops.get(13), 77));
        distances.add(new Distance(shops.get(7), shops.get(14), 90));
        distances.add(new Distance(shops.get(7), shops.get(15), 106));
        distances.add(new Distance(shops.get(7), shops.get(16), 260));
        distances.add(new Distance(shops.get(7), shops.get(17), 233));
        distances.add(new Distance(shops.get(7), shops.get(18), 177));
        distances.add(new Distance(shops.get(7), shops.get(19), 86));
        distances.add(new Distance(shops.get(7), shops.get(20), 121));
        distances.add(new Distance(shops.get(7), shops.get(21), 66));
        distances.add(new Distance(shops.get(7), shops.get(22), 126));
        distances.add(new Distance(shops.get(7), shops.get(23), 5));
        distances.add(new Distance(shops.get(7), shops.get(24), 204));
        distances.add(new Distance(shops.get(7), shops.get(25), 117));
        distances.add(new Distance(shops.get(7), shops.get(26), 270));
        distances.add(new Distance(shops.get(7), shops.get(27), 64));
        distances.add(new Distance(shops.get(7), shops.get(28), 178));
        distances.add(new Distance(shops.get(7), shops.get(29), 172));
        distances.add(new Distance(shops.get(7), shops.get(30), 29));
        distances.add(new Distance(shops.get(7), shops.get(31), 5));
        distances.add(new Distance(shops.get(7), shops.get(32), 129));
        distances.add(new Distance(shops.get(7), shops.get(33), 233));
        distances.add(new Distance(shops.get(7), shops.get(34), 260));
        distances.add(new Distance(shops.get(7), shops.get(35), 10));
        distances.add(new Distance(shops.get(8), shops.get(9), 79));
        distances.add(new Distance(shops.get(8), shops.get(10), 140));
        distances.add(new Distance(shops.get(8), shops.get(11), 22));
        distances.add(new Distance(shops.get(8), shops.get(12), 256));
        distances.add(new Distance(shops.get(8), shops.get(13), 149));
        distances.add(new Distance(shops.get(8), shops.get(14), 248));
        distances.add(new Distance(shops.get(8), shops.get(15), 234));
        distances.add(new Distance(shops.get(8), shops.get(16), 281));
        distances.add(new Distance(shops.get(8), shops.get(17), 244));
        distances.add(new Distance(shops.get(8), shops.get(18), 233));
        distances.add(new Distance(shops.get(8), shops.get(19), 245));
        distances.add(new Distance(shops.get(8), shops.get(20), 198));
        distances.add(new Distance(shops.get(8), shops.get(21), 112));
        distances.add(new Distance(shops.get(8), shops.get(22), 246));
        distances.add(new Distance(shops.get(8), shops.get(23), 289));
        distances.add(new Distance(shops.get(8), shops.get(24), 88));
        distances.add(new Distance(shops.get(8), shops.get(25), 90));
        distances.add(new Distance(shops.get(8), shops.get(26), 96));
        distances.add(new Distance(shops.get(8), shops.get(27), 186));
        distances.add(new Distance(shops.get(8), shops.get(28), 296));
        distances.add(new Distance(shops.get(8), shops.get(29), 286));
        distances.add(new Distance(shops.get(8), shops.get(30), 276));
        distances.add(new Distance(shops.get(8), shops.get(31), 149));
        distances.add(new Distance(shops.get(8), shops.get(32), 9));
        distances.add(new Distance(shops.get(8), shops.get(33), 146));
        distances.add(new Distance(shops.get(8), shops.get(34), 193));
        distances.add(new Distance(shops.get(8), shops.get(35), 94));
        distances.add(new Distance(shops.get(9), shops.get(10), 108));
        distances.add(new Distance(shops.get(9), shops.get(11), 129));
        distances.add(new Distance(shops.get(9), shops.get(12), 211));
        distances.add(new Distance(shops.get(9), shops.get(13), 279));
        distances.add(new Distance(shops.get(9), shops.get(14), 237));
        distances.add(new Distance(shops.get(9), shops.get(15), 253));
        distances.add(new Distance(shops.get(9), shops.get(16), 27));
        distances.add(new Distance(shops.get(9), shops.get(17), 198));
        distances.add(new Distance(shops.get(9), shops.get(18), 121));
        distances.add(new Distance(shops.get(9), shops.get(19), 226));
        distances.add(new Distance(shops.get(9), shops.get(20), 280));
        distances.add(new Distance(shops.get(9), shops.get(21), 214));
        distances.add(new Distance(shops.get(9), shops.get(22), 113));
        distances.add(new Distance(shops.get(9), shops.get(23), 1));
        distances.add(new Distance(shops.get(9), shops.get(24), 265));
        distances.add(new Distance(shops.get(9), shops.get(25), 254));
        distances.add(new Distance(shops.get(9), shops.get(26), 242));
        distances.add(new Distance(shops.get(9), shops.get(27), 243));
        distances.add(new Distance(shops.get(9), shops.get(28), 4));
        distances.add(new Distance(shops.get(9), shops.get(29), 110));
        distances.add(new Distance(shops.get(9), shops.get(30), 82));
        distances.add(new Distance(shops.get(9), shops.get(31), 150));
        distances.add(new Distance(shops.get(9), shops.get(32), 114));
        distances.add(new Distance(shops.get(9), shops.get(33), 176));
        distances.add(new Distance(shops.get(9), shops.get(34), 120));
        distances.add(new Distance(shops.get(9), shops.get(35), 226));
        distances.add(new Distance(shops.get(10), shops.get(11), 254));
        distances.add(new Distance(shops.get(10), shops.get(12), 166));
        distances.add(new Distance(shops.get(10), shops.get(13), 71));
        distances.add(new Distance(shops.get(10), shops.get(14), 260));
        distances.add(new Distance(shops.get(10), shops.get(15), 235));
        distances.add(new Distance(shops.get(10), shops.get(16), 252));
        distances.add(new Distance(shops.get(10), shops.get(17), 23));
        distances.add(new Distance(shops.get(10), shops.get(18), 40));
        distances.add(new Distance(shops.get(10), shops.get(19), 14));
        distances.add(new Distance(shops.get(10), shops.get(20), 191));
        distances.add(new Distance(shops.get(10), shops.get(21), 72));
        distances.add(new Distance(shops.get(10), shops.get(22), 96));
        distances.add(new Distance(shops.get(10), shops.get(23), 272));
        distances.add(new Distance(shops.get(10), shops.get(24), 33));
        distances.add(new Distance(shops.get(10), shops.get(25), 121));
        distances.add(new Distance(shops.get(10), shops.get(26), 246));
        distances.add(new Distance(shops.get(10), shops.get(27), 217));
        distances.add(new Distance(shops.get(10), shops.get(28), 113));
        distances.add(new Distance(shops.get(10), shops.get(29), 95));
        distances.add(new Distance(shops.get(10), shops.get(30), 196));
        distances.add(new Distance(shops.get(10), shops.get(31), 246));
        distances.add(new Distance(shops.get(10), shops.get(32), 245));
        distances.add(new Distance(shops.get(10), shops.get(33), 34));
        distances.add(new Distance(shops.get(10), shops.get(34), 246));
        distances.add(new Distance(shops.get(10), shops.get(35), 82));
        distances.add(new Distance(shops.get(11), shops.get(12), 251));
        distances.add(new Distance(shops.get(11), shops.get(13), 2));
        distances.add(new Distance(shops.get(11), shops.get(14), 35));
        distances.add(new Distance(shops.get(11), shops.get(15), 145));
        distances.add(new Distance(shops.get(11), shops.get(16), 75));
        distances.add(new Distance(shops.get(11), shops.get(17), 237));
        distances.add(new Distance(shops.get(11), shops.get(18), 137));
        distances.add(new Distance(shops.get(11), shops.get(19), 269));
        distances.add(new Distance(shops.get(11), shops.get(20), 194));
        distances.add(new Distance(shops.get(11), shops.get(21), 148));
        distances.add(new Distance(shops.get(11), shops.get(22), 94));
        distances.add(new Distance(shops.get(11), shops.get(23), 196));
        distances.add(new Distance(shops.get(11), shops.get(24), 15));
        distances.add(new Distance(shops.get(11), shops.get(25), 151));
        distances.add(new Distance(shops.get(11), shops.get(26), 172));
        distances.add(new Distance(shops.get(11), shops.get(27), 250));
        distances.add(new Distance(shops.get(11), shops.get(28), 54));
        distances.add(new Distance(shops.get(11), shops.get(29), 199));
        distances.add(new Distance(shops.get(11), shops.get(30), 133));
        distances.add(new Distance(shops.get(11), shops.get(31), 208));
        distances.add(new Distance(shops.get(11), shops.get(32), 81));
        distances.add(new Distance(shops.get(11), shops.get(33), 54));
        distances.add(new Distance(shops.get(11), shops.get(34), 207));
        distances.add(new Distance(shops.get(11), shops.get(35), 130));
        distances.add(new Distance(shops.get(12), shops.get(13), 111));
        distances.add(new Distance(shops.get(12), shops.get(14), 184));
        distances.add(new Distance(shops.get(12), shops.get(15), 127));
        distances.add(new Distance(shops.get(12), shops.get(16), 25));
        distances.add(new Distance(shops.get(12), shops.get(17), 125));
        distances.add(new Distance(shops.get(12), shops.get(18), 282));
        distances.add(new Distance(shops.get(12), shops.get(19), 92));
        distances.add(new Distance(shops.get(12), shops.get(20), 187));
        distances.add(new Distance(shops.get(12), shops.get(21), 39));
        distances.add(new Distance(shops.get(12), shops.get(22), 116));
        distances.add(new Distance(shops.get(12), shops.get(23), 210));
        distances.add(new Distance(shops.get(12), shops.get(24), 220));
        distances.add(new Distance(shops.get(12), shops.get(25), 22));
        distances.add(new Distance(shops.get(12), shops.get(26), 221));
        distances.add(new Distance(shops.get(12), shops.get(27), 220));
        distances.add(new Distance(shops.get(12), shops.get(28), 125));
        distances.add(new Distance(shops.get(12), shops.get(29), 191));
        distances.add(new Distance(shops.get(12), shops.get(30), 279));
        distances.add(new Distance(shops.get(12), shops.get(31), 238));
        distances.add(new Distance(shops.get(12), shops.get(32), 125));
        distances.add(new Distance(shops.get(12), shops.get(33), 288));
        distances.add(new Distance(shops.get(12), shops.get(34), 289));
        distances.add(new Distance(shops.get(12), shops.get(35), 49));
        distances.add(new Distance(shops.get(13), shops.get(14), 122));
        distances.add(new Distance(shops.get(13), shops.get(15), 284));
        distances.add(new Distance(shops.get(13), shops.get(16), 179));
        distances.add(new Distance(shops.get(13), shops.get(17), 264));
        distances.add(new Distance(shops.get(13), shops.get(18), 279));
        distances.add(new Distance(shops.get(13), shops.get(19), 169));
        distances.add(new Distance(shops.get(13), shops.get(20), 282));
        distances.add(new Distance(shops.get(13), shops.get(21), 275));
        distances.add(new Distance(shops.get(13), shops.get(22), 160));
        distances.add(new Distance(shops.get(13), shops.get(23), 215));
        distances.add(new Distance(shops.get(13), shops.get(24), 192));
        distances.add(new Distance(shops.get(13), shops.get(25), 293));
        distances.add(new Distance(shops.get(13), shops.get(26), 229));
        distances.add(new Distance(shops.get(13), shops.get(27), 202));
        distances.add(new Distance(shops.get(13), shops.get(28), 120));
        distances.add(new Distance(shops.get(13), shops.get(29), 298));
        distances.add(new Distance(shops.get(13), shops.get(30), 141));
        distances.add(new Distance(shops.get(13), shops.get(31), 296));
        distances.add(new Distance(shops.get(13), shops.get(32), 155));
        distances.add(new Distance(shops.get(13), shops.get(33), 144));
        distances.add(new Distance(shops.get(13), shops.get(34), 131));
        distances.add(new Distance(shops.get(13), shops.get(35), 137));
        distances.add(new Distance(shops.get(14), shops.get(15), 108));
        distances.add(new Distance(shops.get(14), shops.get(16), 119));
        distances.add(new Distance(shops.get(14), shops.get(17), 132));
        distances.add(new Distance(shops.get(14), shops.get(18), 78));
        distances.add(new Distance(shops.get(14), shops.get(19), 11));
        distances.add(new Distance(shops.get(14), shops.get(20), 56));
        distances.add(new Distance(shops.get(14), shops.get(21), 224));
        distances.add(new Distance(shops.get(14), shops.get(22), 287));
        distances.add(new Distance(shops.get(14), shops.get(23), 23));
        distances.add(new Distance(shops.get(14), shops.get(24), 267));
        distances.add(new Distance(shops.get(14), shops.get(25), 104));
        distances.add(new Distance(shops.get(14), shops.get(26), 122));
        distances.add(new Distance(shops.get(14), shops.get(27), 164));
        distances.add(new Distance(shops.get(14), shops.get(28), 9));
        distances.add(new Distance(shops.get(14), shops.get(29), 179));
        distances.add(new Distance(shops.get(14), shops.get(30), 14));
        distances.add(new Distance(shops.get(14), shops.get(31), 270));
        distances.add(new Distance(shops.get(14), shops.get(32), 34));
        distances.add(new Distance(shops.get(14), shops.get(33), 136));
        distances.add(new Distance(shops.get(14), shops.get(34), 21));
        distances.add(new Distance(shops.get(14), shops.get(35), 235));
        distances.add(new Distance(shops.get(15), shops.get(16), 32));
        distances.add(new Distance(shops.get(15), shops.get(17), 46));
        distances.add(new Distance(shops.get(15), shops.get(18), 96));
        distances.add(new Distance(shops.get(15), shops.get(19), 76));
        distances.add(new Distance(shops.get(15), shops.get(20), 69));
        distances.add(new Distance(shops.get(15), shops.get(21), 26));
        distances.add(new Distance(shops.get(15), shops.get(22), 192));
        distances.add(new Distance(shops.get(15), shops.get(23), 13));
        distances.add(new Distance(shops.get(15), shops.get(24), 241));
        distances.add(new Distance(shops.get(15), shops.get(25), 150));
        distances.add(new Distance(shops.get(15), shops.get(26), 128));
        distances.add(new Distance(shops.get(15), shops.get(27), 17));
        distances.add(new Distance(shops.get(15), shops.get(28), 163));
        distances.add(new Distance(shops.get(15), shops.get(29), 6));
        distances.add(new Distance(shops.get(15), shops.get(30), 285));
        distances.add(new Distance(shops.get(15), shops.get(31), 239));
        distances.add(new Distance(shops.get(15), shops.get(32), 21));
        distances.add(new Distance(shops.get(15), shops.get(33), 5));
        distances.add(new Distance(shops.get(15), shops.get(34), 232));
        distances.add(new Distance(shops.get(15), shops.get(35), 91));
        distances.add(new Distance(shops.get(16), shops.get(17), 222));
        distances.add(new Distance(shops.get(16), shops.get(18), 170));
        distances.add(new Distance(shops.get(16), shops.get(19), 75));
        distances.add(new Distance(shops.get(16), shops.get(20), 282));
        distances.add(new Distance(shops.get(16), shops.get(21), 38));
        distances.add(new Distance(shops.get(16), shops.get(22), 58));
        distances.add(new Distance(shops.get(16), shops.get(23), 206));
        distances.add(new Distance(shops.get(16), shops.get(24), 191));
        distances.add(new Distance(shops.get(16), shops.get(25), 211));
        distances.add(new Distance(shops.get(16), shops.get(26), 152));
        distances.add(new Distance(shops.get(16), shops.get(27), 47));
        distances.add(new Distance(shops.get(16), shops.get(28), 71));
        distances.add(new Distance(shops.get(16), shops.get(29), 51));
        distances.add(new Distance(shops.get(16), shops.get(30), 177));
        distances.add(new Distance(shops.get(16), shops.get(31), 124));
        distances.add(new Distance(shops.get(16), shops.get(32), 34));
        distances.add(new Distance(shops.get(16), shops.get(33), 20));
        distances.add(new Distance(shops.get(16), shops.get(34), 112));
        distances.add(new Distance(shops.get(16), shops.get(35), 176));
        distances.add(new Distance(shops.get(17), shops.get(18), 219));
        distances.add(new Distance(shops.get(17), shops.get(19), 262));
        distances.add(new Distance(shops.get(17), shops.get(20), 29));
        distances.add(new Distance(shops.get(17), shops.get(21), 162));
        distances.add(new Distance(shops.get(17), shops.get(22), 147));
        distances.add(new Distance(shops.get(17), shops.get(23), 277));
        distances.add(new Distance(shops.get(17), shops.get(24), 233));
        distances.add(new Distance(shops.get(17), shops.get(25), 271));
        distances.add(new Distance(shops.get(17), shops.get(26), 32));
        distances.add(new Distance(shops.get(17), shops.get(27), 221));
        distances.add(new Distance(shops.get(17), shops.get(28), 239));
        distances.add(new Distance(shops.get(17), shops.get(29), 222));
        distances.add(new Distance(shops.get(17), shops.get(30), 225));
        distances.add(new Distance(shops.get(17), shops.get(31), 116));
        distances.add(new Distance(shops.get(17), shops.get(32), 213));
        distances.add(new Distance(shops.get(17), shops.get(33), 234));
        distances.add(new Distance(shops.get(17), shops.get(34), 99));
        distances.add(new Distance(shops.get(17), shops.get(35), 174));
        distances.add(new Distance(shops.get(18), shops.get(19), 14));
        distances.add(new Distance(shops.get(18), shops.get(20), 277));
        distances.add(new Distance(shops.get(18), shops.get(21), 212));
        distances.add(new Distance(shops.get(18), shops.get(22), 272));
        distances.add(new Distance(shops.get(18), shops.get(23), 24));
        distances.add(new Distance(shops.get(18), shops.get(24), 143));
        distances.add(new Distance(shops.get(18), shops.get(25), 300));
        distances.add(new Distance(shops.get(18), shops.get(26), 218));
        distances.add(new Distance(shops.get(18), shops.get(27), 166));
        distances.add(new Distance(shops.get(18), shops.get(28), 50));
        distances.add(new Distance(shops.get(18), shops.get(29), 254));
        distances.add(new Distance(shops.get(18), shops.get(30), 161));
        distances.add(new Distance(shops.get(18), shops.get(31), 262));
        distances.add(new Distance(shops.get(18), shops.get(32), 175));
        distances.add(new Distance(shops.get(18), shops.get(33), 87));
        distances.add(new Distance(shops.get(18), shops.get(34), 212));
        distances.add(new Distance(shops.get(18), shops.get(35), 173));
        distances.add(new Distance(shops.get(19), shops.get(20), 16));
        distances.add(new Distance(shops.get(19), shops.get(21), 248));
        distances.add(new Distance(shops.get(19), shops.get(22), 164));
        distances.add(new Distance(shops.get(19), shops.get(23), 218));
        distances.add(new Distance(shops.get(19), shops.get(24), 123));
        distances.add(new Distance(shops.get(19), shops.get(25), 121));
        distances.add(new Distance(shops.get(19), shops.get(26), 146));
        distances.add(new Distance(shops.get(19), shops.get(27), 169));
        distances.add(new Distance(shops.get(19), shops.get(28), 74));
        distances.add(new Distance(shops.get(19), shops.get(29), 68));
        distances.add(new Distance(shops.get(19), shops.get(30), 39));
        distances.add(new Distance(shops.get(19), shops.get(31), 234));
        distances.add(new Distance(shops.get(19), shops.get(32), 160));
        distances.add(new Distance(shops.get(19), shops.get(33), 260));
        distances.add(new Distance(shops.get(19), shops.get(34), 168));
        distances.add(new Distance(shops.get(19), shops.get(35), 246));
        distances.add(new Distance(shops.get(20), shops.get(21), 133));
        distances.add(new Distance(shops.get(20), shops.get(22), 154));
        distances.add(new Distance(shops.get(20), shops.get(23), 2));
        distances.add(new Distance(shops.get(20), shops.get(24), 26));
        distances.add(new Distance(shops.get(20), shops.get(25), 77));
        distances.add(new Distance(shops.get(20), shops.get(26), 50));
        distances.add(new Distance(shops.get(20), shops.get(27), 131));
        distances.add(new Distance(shops.get(20), shops.get(28), 4));
        distances.add(new Distance(shops.get(20), shops.get(29), 24));
        distances.add(new Distance(shops.get(20), shops.get(30), 83));
        distances.add(new Distance(shops.get(20), shops.get(31), 72));
        distances.add(new Distance(shops.get(20), shops.get(32), 6));
        distances.add(new Distance(shops.get(20), shops.get(33), 280));
        distances.add(new Distance(shops.get(20), shops.get(34), 143));
        distances.add(new Distance(shops.get(20), shops.get(35), 102));
        distances.add(new Distance(shops.get(21), shops.get(22), 188));
        distances.add(new Distance(shops.get(21), shops.get(23), 107));
        distances.add(new Distance(shops.get(21), shops.get(24), 69));
        distances.add(new Distance(shops.get(21), shops.get(25), 174));
        distances.add(new Distance(shops.get(21), shops.get(26), 106));
        distances.add(new Distance(shops.get(21), shops.get(27), 129));
        distances.add(new Distance(shops.get(21), shops.get(28), 167));
        distances.add(new Distance(shops.get(21), shops.get(29), 41));
        distances.add(new Distance(shops.get(21), shops.get(30), 206));
        distances.add(new Distance(shops.get(21), shops.get(31), 143));
        distances.add(new Distance(shops.get(21), shops.get(32), 162));
        distances.add(new Distance(shops.get(21), shops.get(33), 21));
        distances.add(new Distance(shops.get(21), shops.get(34), 2));
        distances.add(new Distance(shops.get(21), shops.get(35), 57));
        distances.add(new Distance(shops.get(22), shops.get(23), 299));
        distances.add(new Distance(shops.get(22), shops.get(24), 254));
        distances.add(new Distance(shops.get(22), shops.get(25), 98));
        distances.add(new Distance(shops.get(22), shops.get(26), 72));
        distances.add(new Distance(shops.get(22), shops.get(27), 124));
        distances.add(new Distance(shops.get(22), shops.get(28), 247));
        distances.add(new Distance(shops.get(22), shops.get(29), 195));
        distances.add(new Distance(shops.get(22), shops.get(30), 194));
        distances.add(new Distance(shops.get(22), shops.get(31), 129));
        distances.add(new Distance(shops.get(22), shops.get(32), 70));
        distances.add(new Distance(shops.get(22), shops.get(33), 11));
        distances.add(new Distance(shops.get(22), shops.get(34), 83));
        distances.add(new Distance(shops.get(22), shops.get(35), 25));
        distances.add(new Distance(shops.get(23), shops.get(24), 45));
        distances.add(new Distance(shops.get(23), shops.get(25), 189));
        distances.add(new Distance(shops.get(23), shops.get(26), 292));
        distances.add(new Distance(shops.get(23), shops.get(27), 126));
        distances.add(new Distance(shops.get(23), shops.get(28), 94));
        distances.add(new Distance(shops.get(23), shops.get(29), 206));
        distances.add(new Distance(shops.get(23), shops.get(30), 185));
        distances.add(new Distance(shops.get(23), shops.get(31), 180));
        distances.add(new Distance(shops.get(23), shops.get(32), 134));
        distances.add(new Distance(shops.get(23), shops.get(33), 273));
        distances.add(new Distance(shops.get(23), shops.get(34), 127));
        distances.add(new Distance(shops.get(23), shops.get(35), 9));
        distances.add(new Distance(shops.get(24), shops.get(25), 247));
        distances.add(new Distance(shops.get(24), shops.get(26), 192));
        distances.add(new Distance(shops.get(24), shops.get(27), 122));
        distances.add(new Distance(shops.get(24), shops.get(28), 14));
        distances.add(new Distance(shops.get(24), shops.get(29), 167));
        distances.add(new Distance(shops.get(24), shops.get(30), 299));
        distances.add(new Distance(shops.get(24), shops.get(31), 210));
        distances.add(new Distance(shops.get(24), shops.get(32), 125));
        distances.add(new Distance(shops.get(24), shops.get(33), 274));
        distances.add(new Distance(shops.get(24), shops.get(34), 163));
        distances.add(new Distance(shops.get(24), shops.get(35), 271));
        distances.add(new Distance(shops.get(25), shops.get(26), 27));
        distances.add(new Distance(shops.get(25), shops.get(27), 144));
        distances.add(new Distance(shops.get(25), shops.get(28), 17));
        distances.add(new Distance(shops.get(25), shops.get(29), 53));
        distances.add(new Distance(shops.get(25), shops.get(30), 262));
        distances.add(new Distance(shops.get(25), shops.get(31), 210));
        distances.add(new Distance(shops.get(25), shops.get(32), 187));
        distances.add(new Distance(shops.get(25), shops.get(33), 38));
        distances.add(new Distance(shops.get(25), shops.get(34), 300));
        distances.add(new Distance(shops.get(25), shops.get(35), 196));
        distances.add(new Distance(shops.get(26), shops.get(27), 205));
        distances.add(new Distance(shops.get(26), shops.get(28), 258));
        distances.add(new Distance(shops.get(26), shops.get(29), 59));
        distances.add(new Distance(shops.get(26), shops.get(30), 113));
        distances.add(new Distance(shops.get(26), shops.get(31), 180));
        distances.add(new Distance(shops.get(26), shops.get(32), 218));
        distances.add(new Distance(shops.get(26), shops.get(33), 166));
        distances.add(new Distance(shops.get(26), shops.get(34), 63));
        distances.add(new Distance(shops.get(26), shops.get(35), 1));
        distances.add(new Distance(shops.get(27), shops.get(28), 123));
        distances.add(new Distance(shops.get(27), shops.get(29), 82));
        distances.add(new Distance(shops.get(27), shops.get(30), 1));
        distances.add(new Distance(shops.get(27), shops.get(31), 144));
        distances.add(new Distance(shops.get(27), shops.get(32), 2));
        distances.add(new Distance(shops.get(27), shops.get(33), 138));
        distances.add(new Distance(shops.get(27), shops.get(34), 257));
        distances.add(new Distance(shops.get(27), shops.get(35), 28));
        distances.add(new Distance(shops.get(28), shops.get(29), 201));
        distances.add(new Distance(shops.get(28), shops.get(30), 87));
        distances.add(new Distance(shops.get(28), shops.get(31), 82));
        distances.add(new Distance(shops.get(28), shops.get(32), 273));
        distances.add(new Distance(shops.get(28), shops.get(33), 48));
        distances.add(new Distance(shops.get(28), shops.get(34), 49));
        distances.add(new Distance(shops.get(28), shops.get(35), 115));
        distances.add(new Distance(shops.get(29), shops.get(30), 280));
        distances.add(new Distance(shops.get(29), shops.get(31), 135));
        distances.add(new Distance(shops.get(29), shops.get(32), 290));
        distances.add(new Distance(shops.get(29), shops.get(33), 225));
        distances.add(new Distance(shops.get(29), shops.get(34), 247));
        distances.add(new Distance(shops.get(29), shops.get(35), 26));
        distances.add(new Distance(shops.get(30), shops.get(31), 69));
        distances.add(new Distance(shops.get(30), shops.get(32), 267));
        distances.add(new Distance(shops.get(30), shops.get(33), 92));
        distances.add(new Distance(shops.get(30), shops.get(34), 168));
        distances.add(new Distance(shops.get(30), shops.get(35), 200));
        distances.add(new Distance(shops.get(31), shops.get(32), 134));
        distances.add(new Distance(shops.get(31), shops.get(33), 160));
        distances.add(new Distance(shops.get(31), shops.get(34), 134));
        distances.add(new Distance(shops.get(31), shops.get(35), 203));
        distances.add(new Distance(shops.get(32), shops.get(33), 57));
        distances.add(new Distance(shops.get(32), shops.get(34), 120));
        distances.add(new Distance(shops.get(32), shops.get(35), 93));
        distances.add(new Distance(shops.get(33), shops.get(34), 107));
        distances.add(new Distance(shops.get(33), shops.get(35), 228));
        distances.add(new Distance(shops.get(34), shops.get(35), 172));


        for(Distance d:distances)
        {
            d.shop1.addShop(d.shop2, d.time);
            d.shop2.addShop(d.shop1, d.time);
        }
    }

    public static ArrayList<String> getAllShopNames()
    {
        ArrayList<String> names = new ArrayList<String>();

        for (Shop s:shops)
        {
            names.add(s.name);
        }

        Collections.sort(names);

        return names;
    }

    public static ArrayList<String> getAllProductNames()
    {
        ArrayList<String> names = new ArrayList<String>();

        for (Product p:products)
        {
            names.add(p.name);
        }

        Collections.sort(names);

        return names;
    }
}
