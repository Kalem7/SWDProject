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
        shops.add(new Shop("Apart", 0, R.mipmap.apart));                        // 28
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
        distances.add(new Distance(shops.get(0), shops.get(1), 120));//
        distances.add(new Distance(shops.get(0), shops.get(2), 60));//
        distances.add(new Distance(shops.get(0), shops.get(3), 110));//
        distances.add(new Distance(shops.get(0), shops.get(4), 55));//
        distances.add(new Distance(shops.get(0), shops.get(5), 15));//
        distances.add(new Distance(shops.get(0), shops.get(6), 105));//
        distances.add(new Distance(shops.get(0), shops.get(7), 130));//
        distances.add(new Distance(shops.get(0), shops.get(8), 80));//
        distances.add(new Distance(shops.get(0), shops.get(9), 95));//
        distances.add(new Distance(shops.get(0), shops.get(10), 130));//
        distances.add(new Distance(shops.get(0), shops.get(11), 95));//
        distances.add(new Distance(shops.get(0), shops.get(12), 52));//
        distances.add(new Distance(shops.get(0), shops.get(13), 105));//
        distances.add(new Distance(shops.get(0), shops.get(14), 15));//
        distances.add(new Distance(shops.get(0), shops.get(15), 90));//
        distances.add(new Distance(shops.get(0), shops.get(16), 125));//
        distances.add(new Distance(shops.get(0), shops.get(17), 140));//
        distances.add(new Distance(shops.get(0), shops.get(18), 65));//
        distances.add(new Distance(shops.get(0), shops.get(19), 135));//
        distances.add(new Distance(shops.get(0), shops.get(20), 125));//
        distances.add(new Distance(shops.get(0), shops.get(21), 90));//
        distances.add(new Distance(shops.get(0), shops.get(22), 145));//
        distances.add(new Distance(shops.get(0), shops.get(23), 95));//
        distances.add(new Distance(shops.get(0), shops.get(24), 143));//
        distances.add(new Distance(shops.get(0), shops.get(25), 146));//
        distances.add(new Distance(shops.get(0), shops.get(26), 70));//
        distances.add(new Distance(shops.get(0), shops.get(27), 125));//
        distances.add(new Distance(shops.get(0), shops.get(28), 125));//
        distances.add(new Distance(shops.get(0), shops.get(29), 127));//
        distances.add(new Distance(shops.get(0), shops.get(30), 55));//
        distances.add(new Distance(shops.get(0), shops.get(31), 131));//
        distances.add(new Distance(shops.get(0), shops.get(32), 65));//
        distances.add(new Distance(shops.get(0), shops.get(33), 120));//
        distances.add(new Distance(shops.get(0), shops.get(34), 150));//
        distances.add(new Distance(shops.get(0), shops.get(35), 60));//
        distances.add(new Distance(shops.get(1), shops.get(2), 120));
        distances.add(new Distance(shops.get(1), shops.get(3), 45));
        distances.add(new Distance(shops.get(1), shops.get(4), 59));
        distances.add(new Distance(shops.get(1), shops.get(5), 95));
        distances.add(new Distance(shops.get(1), shops.get(6), 27));
        distances.add(new Distance(shops.get(1), shops.get(7), 130));
        distances.add(new Distance(shops.get(1), shops.get(8), 150));
        distances.add(new Distance(shops.get(1), shops.get(9), 145));
        distances.add(new Distance(shops.get(1), shops.get(10), 10));
        distances.add(new Distance(shops.get(1), shops.get(11), 67));
        distances.add(new Distance(shops.get(1), shops.get(12), 125));//
        distances.add(new Distance(shops.get(1), shops.get(13), 24));//
        distances.add(new Distance(shops.get(1), shops.get(14), 95));//
        distances.add(new Distance(shops.get(1), shops.get(15), 80));//
        distances.add(new Distance(shops.get(1), shops.get(16), 145));//
        distances.add(new Distance(shops.get(1), shops.get(17), 10));//
        distances.add(new Distance(shops.get(1), shops.get(18), 97));//
        distances.add(new Distance(shops.get(1), shops.get(19), 98));//
        distances.add(new Distance(shops.get(1), shops.get(20), 90));//
        distances.add(new Distance(shops.get(1), shops.get(21), 75));//
        distances.add(new Distance(shops.get(1), shops.get(22), 145));//
        distances.add(new Distance(shops.get(1), shops.get(23), 78));//
        distances.add(new Distance(shops.get(1), shops.get(24), 140));//
        distances.add(new Distance(shops.get(1), shops.get(25), 77));//
        distances.add(new Distance(shops.get(1), shops.get(26), 80));//
        distances.add(new Distance(shops.get(1), shops.get(27), 54));//
        distances.add(new Distance(shops.get(1), shops.get(28), 65));//
        distances.add(new Distance(shops.get(1), shops.get(29), 35));//
        distances.add(new Distance(shops.get(1), shops.get(30), 120));//
        distances.add(new Distance(shops.get(1), shops.get(31), 60));//
        distances.add(new Distance(shops.get(1), shops.get(32), 55));//
        distances.add(new Distance(shops.get(1), shops.get(60), 95));//
        distances.add(new Distance(shops.get(1), shops.get(90), 114));//
        distances.add(new Distance(shops.get(1), shops.get(45), 151));//
        distances.add(new Distance(shops.get(2), shops.get(3), 100));//
        distances.add(new Distance(shops.get(2), shops.get(4), 85));//
        distances.add(new Distance(shops.get(2), shops.get(5), 46));//
        distances.add(new Distance(shops.get(2), shops.get(6), 100));//
        distances.add(new Distance(shops.get(2), shops.get(7), 72));//
        distances.add(new Distance(shops.get(2), shops.get(8), 15));//
        distances.add(new Distance(shops.get(2), shops.get(9), 27));//
        distances.add(new Distance(shops.get(2), shops.get(10), 110));//
        distances.add(new Distance(shops.get(2), shops.get(11), 97));//
        distances.add(new Distance(shops.get(2), shops.get(12), 7));//
        distances.add(new Distance(shops.get(2), shops.get(13), 104));//
        distances.add(new Distance(shops.get(2), shops.get(14), 58));//
        distances.add(new Distance(shops.get(2), shops.get(15), 160));//
        distances.add(new Distance(shops.get(2), shops.get(16), 60));//
        distances.add(new Distance(shops.get(2), shops.get(17), 120));//
        distances.add(new Distance(shops.get(2), shops.get(18), 95));//
        distances.add(new Distance(shops.get(2), shops.get(19), 55));//
        distances.add(new Distance(shops.get(2), shops.get(20), 110));//
        distances.add(new Distance(shops.get(2), shops.get(21), 86));//
        distances.add(new Distance(shops.get(2), shops.get(22), 98));//
        distances.add(new Distance(shops.get(2), shops.get(23), 120));//
        distances.add(new Distance(shops.get(2), shops.get(24), 70));//
        distances.add(new Distance(shops.get(2), shops.get(25), 128));//
        distances.add(new Distance(shops.get(2), shops.get(26), 88));//
        distances.add(new Distance(shops.get(2), shops.get(27), 150));//
        distances.add(new Distance(shops.get(2), shops.get(28), 160));//
        distances.add(new Distance(shops.get(2), shops.get(29), 165));//
        distances.add(new Distance(shops.get(2), shops.get(30), 80));//
        distances.add(new Distance(shops.get(2), shops.get(31), 150));//
        distances.add(new Distance(shops.get(2), shops.get(32), 63));//
        distances.add(new Distance(shops.get(2), shops.get(33), 165));//
        distances.add(new Distance(shops.get(2), shops.get(34), 160));//
        distances.add(new Distance(shops.get(2), shops.get(35), 65));//
        distances.add(new Distance(shops.get(3), shops.get(4), 30));//
        distances.add(new Distance(shops.get(3), shops.get(5), 60));//
        distances.add(new Distance(shops.get(3), shops.get(6), 10));//
        distances.add(new Distance(shops.get(3), shops.get(7), 123));//
        distances.add(new Distance(shops.get(3), shops.get(8), 120));//
        distances.add(new Distance(shops.get(3), shops.get(9), 130));//
        distances.add(new Distance(shops.get(3), shops.get(10), 30));//
        distances.add(new Distance(shops.get(3), shops.get(11), 70));//
        distances.add(new Distance(shops.get(3), shops.get(12), 105));//
        distances.add(new Distance(shops.get(3), shops.get(13), 20));//
        distances.add(new Distance(shops.get(3), shops.get(14), 92));//
        distances.add(new Distance(shops.get(3), shops.get(15), 58));//
        distances.add(new Distance(shops.get(3), shops.get(16), 134));//
        distances.add(new Distance(shops.get(3), shops.get(17), 55));//
        distances.add(new Distance(shops.get(3), shops.get(18), 155));//
        distances.add(new Distance(shops.get(3), shops.get(19), 100));//
        distances.add(new Distance(shops.get(3), shops.get(20), 55));//
        distances.add(new Distance(shops.get(3), shops.get(21), 55));//
        distances.add(new Distance(shops.get(3), shops.get(22), 120));//
        distances.add(new Distance(shops.get(3), shops.get(23), 60));//
        distances.add(new Distance(shops.get(3), shops.get(24), 125));//
        distances.add(new Distance(shops.get(3), shops.get(25), 65));//
        distances.add(new Distance(shops.get(3), shops.get(26), 125));//
        distances.add(new Distance(shops.get(3), shops.get(27), 115));//
        distances.add(new Distance(shops.get(3), shops.get(28), 132));//
        distances.add(new Distance(shops.get(3), shops.get(29), 65));//
        distances.add(new Distance(shops.get(3), shops.get(30), 156));//
        distances.add(new Distance(shops.get(3), shops.get(31), 128));//
        distances.add(new Distance(shops.get(3), shops.get(32), 45));//
        distances.add(new Distance(shops.get(3), shops.get(33), 80));//
        distances.add(new Distance(shops.get(3), shops.get(34), 120));//
        distances.add(new Distance(shops.get(3), shops.get(35), 45));//
        distances.add(new Distance(shops.get(4), shops.get(5), 40));//
        distances.add(new Distance(shops.get(4), shops.get(6), 45));//
        distances.add(new Distance(shops.get(4), shops.get(7), 75));//
        distances.add(new Distance(shops.get(4), shops.get(8), 80));//
        distances.add(new Distance(shops.get(4), shops.get(9), 95));//
        distances.add(new Distance(shops.get(4), shops.get(10), 55));//
        distances.add(new Distance(shops.get(4), shops.get(11), 36));////
        distances.add(new Distance(shops.get(4), shops.get(12), 42));//
        distances.add(new Distance(shops.get(4), shops.get(13), 51));//
        distances.add(new Distance(shops.get(4), shops.get(14), 71));//
        distances.add(new Distance(shops.get(4), shops.get(15), 110));//
        distances.add(new Distance(shops.get(4), shops.get(16), 90));//
        distances.add(new Distance(shops.get(4), shops.get(17), 77));//
        distances.add(new Distance(shops.get(4), shops.get(18), 117));//
        distances.add(new Distance(shops.get(4), shops.get(19), 86));//
        distances.add(new Distance(shops.get(4), shops.get(20), 98));//
        distances.add(new Distance(shops.get(4), shops.get(21), 28));//
        distances.add(new Distance(shops.get(4), shops.get(22), 82));//
        distances.add(new Distance(shops.get(4), shops.get(23), 48));//
        distances.add(new Distance(shops.get(4), shops.get(24), 80));//
        distances.add(new Distance(shops.get(4), shops.get(25), 53));//
        distances.add(new Distance(shops.get(4), shops.get(26), 122));//
        distances.add(new Distance(shops.get(4), shops.get(27), 67));//
        distances.add(new Distance(shops.get(4), shops.get(28), 73));//
        distances.add(new Distance(shops.get(4), shops.get(29), 94));//
        distances.add(new Distance(shops.get(4), shops.get(30), 97));//
        distances.add(new Distance(shops.get(4), shops.get(31), 70));//
        distances.add(new Distance(shops.get(4), shops.get(32), 17));//
        distances.add(new Distance(shops.get(4), shops.get(33), 60));//
        distances.add(new Distance(shops.get(4), shops.get(34), 90));//
        distances.add(new Distance(shops.get(4), shops.get(35), 7));//
        distances.add(new Distance(shops.get(5), shops.get(6), 70));//
        distances.add(new Distance(shops.get(5), shops.get(7), 125));//
        distances.add(new Distance(shops.get(5), shops.get(8), 85));//
        distances.add(new Distance(shops.get(5), shops.get(9), 105));//
        distances.add(new Distance(shops.get(5), shops.get(10), 74));//
        distances.add(new Distance(shops.get(5), shops.get(11), 79));//
        distances.add(new Distance(shops.get(5), shops.get(12), 33));//
        distances.add(new Distance(shops.get(5), shops.get(13), 75));//
        distances.add(new Distance(shops.get(5), shops.get(14), 25));//
        distances.add(new Distance(shops.get(5), shops.get(15), 80));//
        distances.add(new Distance(shops.get(5), shops.get(16), 113));//
        distances.add(new Distance(shops.get(5), shops.get(17), 90));//
        distances.add(new Distance(shops.get(5), shops.get(18), 66));//
        distances.add(new Distance(shops.get(5), shops.get(19), 123));//
        distances.add(new Distance(shops.get(5), shops.get(20), 98));//
        distances.add(new Distance(shops.get(5), shops.get(21), 67));//
        distances.add(new Distance(shops.get(5), shops.get(22), 130));//
        distances.add(new Distance(shops.get(5), shops.get(23), 95));//
        distances.add(new Distance(shops.get(5), shops.get(24), 128));//
        distances.add(new Distance(shops.get(5), shops.get(25), 102));//
        distances.add(new Distance(shops.get(5), shops.get(26), 90));//
        distances.add(new Distance(shops.get(5), shops.get(27), 110));//
        distances.add(new Distance(shops.get(5), shops.get(28), 114));//
        distances.add(new Distance(shops.get(5), shops.get(29), 145));//
        distances.add(new Distance(shops.get(5), shops.get(30), 60));//
        distances.add(new Distance(shops.get(5), shops.get(31), 112));//
        distances.add(new Distance(shops.get(5), shops.get(32), 40));//
        distances.add(new Distance(shops.get(5), shops.get(33), 96));//
        distances.add(new Distance(shops.get(5), shops.get(34), 130));//
        distances.add(new Distance(shops.get(5), shops.get(35), 45));//
        distances.add(new Distance(shops.get(6), shops.get(7), 100));
        distances.add(new Distance(shops.get(6), shops.get(8), 120));
        distances.add(new Distance(shops.get(6), shops.get(9), 125));
        distances.add(new Distance(shops.get(6), shops.get(10), 26));
        distances.add(new Distance(shops.get(6), shops.get(11), 74));
        distances.add(new Distance(shops.get(6), shops.get(12), 82));
        distances.add(new Distance(shops.get(6), shops.get(13), 8));
        distances.add(new Distance(shops.get(6), shops.get(14), 88));
        distances.add(new Distance(shops.get(6), shops.get(15), 77));
        distances.add(new Distance(shops.get(6), shops.get(16), 110));
        distances.add(new Distance(shops.get(6), shops.get(17), 56));
        distances.add(new Distance(shops.get(6), shops.get(18), 155));
        distances.add(new Distance(shops.get(6), shops.get(19), 105));
        distances.add(new Distance(shops.get(6), shops.get(20), 60));
        distances.add(new Distance(shops.get(6), shops.get(21), 60));
        distances.add(new Distance(shops.get(6), shops.get(22), 105));
        distances.add(new Distance(shops.get(6), shops.get(23), 65));
        distances.add(new Distance(shops.get(6), shops.get(24), 104));
        distances.add(new Distance(shops.get(6), shops.get(25), 70));
        distances.add(new Distance(shops.get(6), shops.get(26), 140));
        distances.add(new Distance(shops.get(6), shops.get(27), 77));
        distances.add(new Distance(shops.get(6), shops.get(28), 85));
        distances.add(new Distance(shops.get(6), shops.get(29), 59));
        distances.add(new Distance(shops.get(6), shops.get(30), 120));
        distances.add(new Distance(shops.get(6), shops.get(31), 81));
        distances.add(new Distance(shops.get(6), shops.get(32), 35));
        distances.add(new Distance(shops.get(6), shops.get(33), 90));//
        distances.add(new Distance(shops.get(6), shops.get(34), 124));//
        distances.add(new Distance(shops.get(6), shops.get(35), 43));//
        distances.add(new Distance(shops.get(7), shops.get(8), 60));
        distances.add(new Distance(shops.get(7), shops.get(9), 30));
        distances.add(new Distance(shops.get(7), shops.get(10), 92));
        distances.add(new Distance(shops.get(7), shops.get(11), 56));
        distances.add(new Distance(shops.get(7), shops.get(12), 110));
        distances.add(new Distance(shops.get(7), shops.get(13), 109));
        distances.add(new Distance(shops.get(7), shops.get(14), 140));
        distances.add(new Distance(shops.get(7), shops.get(15), 123));
        distances.add(new Distance(shops.get(7), shops.get(16), 25));
        distances.add(new Distance(shops.get(7), shops.get(17), 79));
        distances.add(new Distance(shops.get(7), shops.get(18), 93));
        distances.add(new Distance(shops.get(7), shops.get(19), 15));
        distances.add(new Distance(shops.get(7), shops.get(20), 160));
        distances.add(new Distance(shops.get(7), shops.get(21), 75));
        distances.add(new Distance(shops.get(7), shops.get(22), 10));
        distances.add(new Distance(shops.get(7), shops.get(23), 70));
        distances.add(new Distance(shops.get(7), shops.get(24), 7));
        distances.add(new Distance(shops.get(7), shops.get(25), 60));
        distances.add(new Distance(shops.get(7), shops.get(26), 80));
        distances.add(new Distance(shops.get(7), shops.get(27), 35));
        distances.add(new Distance(shops.get(7), shops.get(28), 38));
        distances.add(new Distance(shops.get(7), shops.get(29), 64));
        distances.add(new Distance(shops.get(7), shops.get(30), 77));//
        distances.add(new Distance(shops.get(7), shops.get(31), 33));//
        distances.add(new Distance(shops.get(7), shops.get(32), 88));//
        distances.add(new Distance(shops.get(7), shops.get(33), 35));//
        distances.add(new Distance(shops.get(7), shops.get(34), 10));//
        distances.add(new Distance(shops.get(7), shops.get(35), 70));//
        distances.add(new Distance(shops.get(8), shops.get(9), 20));//
        distances.add(new Distance(shops.get(8), shops.get(10), 125));
        distances.add(new Distance(shops.get(8), shops.get(11), 110));
        distances.add(new Distance(shops.get(8), shops.get(12), 30));
        distances.add(new Distance(shops.get(8), shops.get(13), 120));
        distances.add(new Distance(shops.get(8), shops.get(14), 63));
        distances.add(new Distance(shops.get(8), shops.get(15), 110));
        distances.add(new Distance(shops.get(8), shops.get(16), 30));
        distances.add(new Distance(shops.get(8), shops.get(17), 150));
        distances.add(new Distance(shops.get(8), shops.get(18), 80));
        distances.add(new Distance(shops.get(8), shops.get(19), 50));
        distances.add(new Distance(shops.get(8), shops.get(20), 140));
        distances.add(new Distance(shops.get(8), shops.get(21), 100));
        distances.add(new Distance(shops.get(8), shops.get(22), 60));
        distances.add(new Distance(shops.get(8), shops.get(23), 110));
        distances.add(new Distance(shops.get(8), shops.get(24), 57));
        distances.add(new Distance(shops.get(8), shops.get(25), 115));
        distances.add(new Distance(shops.get(8), shops.get(26), 125));
        distances.add(new Distance(shops.get(8), shops.get(27), 135));
        distances.add(new Distance(shops.get(8), shops.get(28), 140));
        distances.add(new Distance(shops.get(8), shops.get(29), 170));
        distances.add(new Distance(shops.get(8), shops.get(30), 90));//
        distances.add(new Distance(shops.get(8), shops.get(31), 135));//
        distances.add(new Distance(shops.get(8), shops.get(32), 88));//
        distances.add(new Distance(shops.get(8), shops.get(33), 140));//
        distances.add(new Distance(shops.get(8), shops.get(34), 70));//
        distances.add(new Distance(shops.get(8), shops.get(35), 87));//
        distances.add(new Distance(shops.get(9), shops.get(10), 125));//
        distances.add(new Distance(shops.get(9), shops.get(11), 110));//
        distances.add(new Distance(shops.get(9), shops.get(12), 30));//
        distances.add(new Distance(shops.get(9), shops.get(13), 120));//
        distances.add(new Distance(shops.get(9), shops.get(14), 63));//
        distances.add(new Distance(shops.get(9), shops.get(15), 110));//
        distances.add(new Distance(shops.get(9), shops.get(16), 30));//
        distances.add(new Distance(shops.get(9), shops.get(17), 150));//
        distances.add(new Distance(shops.get(9), shops.get(18), 80));//
        distances.add(new Distance(shops.get(9), shops.get(19), 50));//
        distances.add(new Distance(shops.get(9), shops.get(20), 140));//
        distances.add(new Distance(shops.get(9), shops.get(21), 100));//
        distances.add(new Distance(shops.get(9), shops.get(22), 60));//
        distances.add(new Distance(shops.get(9), shops.get(23), 110));//
        distances.add(new Distance(shops.get(9), shops.get(24), 57));//
        distances.add(new Distance(shops.get(9), shops.get(25), 115));//
        distances.add(new Distance(shops.get(9), shops.get(26), 125));//
        distances.add(new Distance(shops.get(9), shops.get(27), 135));//
        distances.add(new Distance(shops.get(9), shops.get(28), 140));//
        distances.add(new Distance(shops.get(9), shops.get(29), 164));//
        distances.add(new Distance(shops.get(9), shops.get(30), 93));//
        distances.add(new Distance(shops.get(9), shops.get(31), 125));//
        distances.add(new Distance(shops.get(9), shops.get(32), 86));//
        distances.add(new Distance(shops.get(9), shops.get(33), 100));//
        distances.add(new Distance(shops.get(9), shops.get(34), 50));//
        distances.add(new Distance(shops.get(9), shops.get(35), 97));//


        distances.add(new Distance(shops.get(10), shops.get(11), 70));
        distances.add(new Distance(shops.get(10), shops.get(12), 100));
        distances.add(new Distance(shops.get(10), shops.get(13), 20));
        distances.add(new Distance(shops.get(10), shops.get(14), 101));
        distances.add(new Distance(shops.get(10), shops.get(15), 120));
        distances.add(new Distance(shops.get(10), shops.get(16), 120));
        distances.add(new Distance(shops.get(10), shops.get(17), 20));
        distances.add(new Distance(shops.get(10), shops.get(18), 84));
        distances.add(new Distance(shops.get(10), shops.get(19), 95));
        distances.add(new Distance(shops.get(10), shops.get(20), 110));
        distances.add(new Distance(shops.get(10), shops.get(21), 60));
        distances.add(new Distance(shops.get(10), shops.get(22), 90));
        distances.add(new Distance(shops.get(10), shops.get(23), 55));
        distances.add(new Distance(shops.get(10), shops.get(24), 90));
        distances.add(new Distance(shops.get(10), shops.get(25), 50));
        distances.add(new Distance(shops.get(10), shops.get(26), 87));
        distances.add(new Distance(shops.get(10), shops.get(27), 46));
        distances.add(new Distance(shops.get(10), shops.get(28), 42));
        distances.add(new Distance(shops.get(10), shops.get(29), 30));
        distances.add(new Distance(shops.get(10), shops.get(30), 69));
        distances.add(new Distance(shops.get(10), shops.get(31), 44));//
        distances.add(new Distance(shops.get(10), shops.get(32), 47));//
        distances.add(new Distance(shops.get(10), shops.get(33), 60));//
        distances.add(new Distance(shops.get(10), shops.get(34), 92));//
        distances.add(new Distance(shops.get(10), shops.get(35), 45));//

        distances.add(new Distance(shops.get(11), shops.get(12), 130));
        distances.add(new Distance(shops.get(11), shops.get(13), 65));
        distances.add(new Distance(shops.get(11), shops.get(14), 120));
        distances.add(new Distance(shops.get(11), shops.get(15), 150));
        distances.add(new Distance(shops.get(11), shops.get(16), 75));
        distances.add(new Distance(shops.get(11), shops.get(17), 70));
        distances.add(new Distance(shops.get(11), shops.get(18), 80));
        distances.add(new Distance(shops.get(11), shops.get(19), 63));
        distances.add(new Distance(shops.get(11), shops.get(20), 135));
        distances.add(new Distance(shops.get(11), shops.get(21), 18));
        distances.add(new Distance(shops.get(11), shops.get(22), 50));
        distances.add(new Distance(shops.get(11), shops.get(23), 10));
        distances.add(new Distance(shops.get(11), shops.get(24), 47));
        distances.add(new Distance(shops.get(11), shops.get(25), 12));
        distances.add(new Distance(shops.get(11), shops.get(26), 65));
        distances.add(new Distance(shops.get(11), shops.get(27), 30));
        distances.add(new Distance(shops.get(11), shops.get(28), 30));
        distances.add(new Distance(shops.get(11), shops.get(29), 50));
        distances.add(new Distance(shops.get(11), shops.get(30), 32));
        distances.add(new Distance(shops.get(11), shops.get(31), 28));
        distances.add(new Distance(shops.get(11), shops.get(32), 40));
        distances.add(new Distance(shops.get(11), shops.get(33), 20));//
        distances.add(new Distance(shops.get(11), shops.get(34), 53));//
        distances.add(new Distance(shops.get(11), shops.get(35), 45));//

        distances.add(new Distance(shops.get(12), shops.get(13), 90));
        distances.add(new Distance(shops.get(12), shops.get(14), 30));
        distances.add(new Distance(shops.get(12), shops.get(15), 140));
        distances.add(new Distance(shops.get(12), shops.get(16), 65));
        distances.add(new Distance(shops.get(12), shops.get(17), 150));
        distances.add(new Distance(shops.get(12), shops.get(18), 80));
        distances.add(new Distance(shops.get(12), shops.get(19), 88));
        distances.add(new Distance(shops.get(12), shops.get(20), 144));
        distances.add(new Distance(shops.get(12), shops.get(21), 120));
        distances.add(new Distance(shops.get(12), shops.get(22), 95));
        distances.add(new Distance(shops.get(12), shops.get(23), 125));
        distances.add(new Distance(shops.get(12), shops.get(24), 94));
        distances.add(new Distance(shops.get(12), shops.get(25), 130));
        distances.add(new Distance(shops.get(12), shops.get(26), 120));
        distances.add(new Distance(shops.get(12), shops.get(27), 140));
        distances.add(new Distance(shops.get(12), shops.get(28), 140));
        distances.add(new Distance(shops.get(12), shops.get(29), 170));
        distances.add(new Distance(shops.get(12), shops.get(30), 90));//
        distances.add(new Distance(shops.get(12), shops.get(31), 135));//
        distances.add(new Distance(shops.get(12), shops.get(32), 92));//
        distances.add(new Distance(shops.get(12), shops.get(33), 140));///
        distances.add(new Distance(shops.get(12), shops.get(34), 100));///
        distances.add(new Distance(shops.get(12), shops.get(35), 90));///
        distances.add(new Distance(shops.get(13), shops.get(14), 88));
        distances.add(new Distance(shops.get(13), shops.get(15), 77));
        distances.add(new Distance(shops.get(13), shops.get(16), 110));
        distances.add(new Distance(shops.get(13), shops.get(17), 56));
        distances.add(new Distance(shops.get(13), shops.get(18), 155));
        distances.add(new Distance(shops.get(13), shops.get(19), 105));
        distances.add(new Distance(shops.get(13), shops.get(20), 60));
        distances.add(new Distance(shops.get(13), shops.get(21), 60));
        distances.add(new Distance(shops.get(13), shops.get(22), 105));
        distances.add(new Distance(shops.get(13), shops.get(23), 65));
        distances.add(new Distance(shops.get(13), shops.get(24), 104));
        distances.add(new Distance(shops.get(13), shops.get(25), 70));
        distances.add(new Distance(shops.get(13), shops.get(26), 140));
        distances.add(new Distance(shops.get(13), shops.get(27), 77));
        distances.add(new Distance(shops.get(13), shops.get(28), 85));
        distances.add(new Distance(shops.get(13), shops.get(29), 59));
        distances.add(new Distance(shops.get(13), shops.get(30), 120));
        distances.add(new Distance(shops.get(13), shops.get(31), 81));
        distances.add(new Distance(shops.get(13), shops.get(32), 35));
        distances.add(new Distance(shops.get(13), shops.get(33), 90));//
        distances.add(new Distance(shops.get(13), shops.get(34), 124));//
        distances.add(new Distance(shops.get(13), shops.get(35), 43));//

        distances.add(new Distance(shops.get(14), shops.get(15), 90));//
        distances.add(new Distance(shops.get(14), shops.get(16), 125));//
        distances.add(new Distance(shops.get(14), shops.get(17), 140));//
        distances.add(new Distance(shops.get(14), shops.get(18), 65));//
        distances.add(new Distance(shops.get(14), shops.get(19), 135));//
        distances.add(new Distance(shops.get(14), shops.get(20), 125));//
        distances.add(new Distance(shops.get(14), shops.get(21), 90));//
        distances.add(new Distance(shops.get(14), shops.get(22), 145));//
        distances.add(new Distance(shops.get(14), shops.get(23), 95));//
        distances.add(new Distance(shops.get(14), shops.get(24), 143));//
        distances.add(new Distance(shops.get(14), shops.get(25), 146));//
        distances.add(new Distance(shops.get(14), shops.get(26), 70));//
        distances.add(new Distance(shops.get(14), shops.get(27), 125));//
        distances.add(new Distance(shops.get(14), shops.get(28), 125));//
        distances.add(new Distance(shops.get(14), shops.get(29), 127));//
        distances.add(new Distance(shops.get(14), shops.get(30), 55));//
        distances.add(new Distance(shops.get(14), shops.get(31), 131));//
        distances.add(new Distance(shops.get(14), shops.get(32), 65));//
        distances.add(new Distance(shops.get(14), shops.get(33), 120));//
        distances.add(new Distance(shops.get(14), shops.get(34), 150));//
        distances.add(new Distance(shops.get(14), shops.get(35), 65));//

        distances.add(new Distance(shops.get(15), shops.get(16), 140));
        distances.add(new Distance(shops.get(15), shops.get(17), 120));
        distances.add(new Distance(shops.get(15), shops.get(18), 45));
        distances.add(new Distance(shops.get(15), shops.get(19), 130));
        distances.add(new Distance(shops.get(15), shops.get(20), 20));
        distances.add(new Distance(shops.get(15), shops.get(21), 140));
        distances.add(new Distance(shops.get(15), shops.get(22), 120));
        distances.add(new Distance(shops.get(15), shops.get(23), 130));
        distances.add(new Distance(shops.get(15), shops.get(24), 115));
        distances.add(new Distance(shops.get(15), shops.get(25), 127));
        distances.add(new Distance(shops.get(15), shops.get(26), 58));
        distances.add(new Distance(shops.get(15), shops.get(27), 100));
        distances.add(new Distance(shops.get(15), shops.get(28), 95));
        distances.add(new Distance(shops.get(15), shops.get(29), 79));
        distances.add(new Distance(shops.get(15), shops.get(30), 53));//
        distances.add(new Distance(shops.get(15), shops.get(31), 98));//
        distances.add(new Distance(shops.get(15), shops.get(32), 100));//
        distances.add(new Distance(shops.get(15), shops.get(33), 100));//
        distances.add(new Distance(shops.get(15), shops.get(34), 120));//
        distances.add(new Distance(shops.get(15), shops.get(35), 148));//

        distances.add(new Distance(shops.get(16), shops.get(17), 90));
        distances.add(new Distance(shops.get(16), shops.get(18), 110));
        distances.add(new Distance(shops.get(16), shops.get(19), 15));
        distances.add(new Distance(shops.get(16), shops.get(20), 210));
        distances.add(new Distance(shops.get(16), shops.get(21), 110));
        distances.add(new Distance(shops.get(16), shops.get(22), 30));
        distances.add(new Distance(shops.get(16), shops.get(23), 100));
        distances.add(new Distance(shops.get(16), shops.get(24), 25));
        distances.add(new Distance(shops.get(16), shops.get(25), 95));
        distances.add(new Distance(shops.get(16), shops.get(26), 90));
        distances.add(new Distance(shops.get(16), shops.get(27), 60));
        distances.add(new Distance(shops.get(16), shops.get(28), 55));
        distances.add(new Distance(shops.get(16), shops.get(29), 85));
        distances.add(new Distance(shops.get(16), shops.get(30), 80));
        distances.add(new Distance(shops.get(16), shops.get(31), 55));
        distances.add(new Distance(shops.get(16), shops.get(32), 90));
        distances.add(new Distance(shops.get(16), shops.get(33), 65));//
        distances.add(new Distance(shops.get(16), shops.get(34), 35));//
        distances.add(new Distance(shops.get(16), shops.get(35), 110));//

        distances.add(new Distance(shops.get(17), shops.get(18), 110));
        distances.add(new Distance(shops.get(17), shops.get(19), 90));
        distances.add(new Distance(shops.get(17), shops.get(20), 110));
        distances.add(new Distance(shops.get(17), shops.get(21), 70));
        distances.add(new Distance(shops.get(17), shops.get(22), 80));
        distances.add(new Distance(shops.get(17), shops.get(23), 85));
        distances.add(new Distance(shops.get(17), shops.get(24), 75));
        distances.add(new Distance(shops.get(17), shops.get(25), 85));
        distances.add(new Distance(shops.get(17), shops.get(26), 90));
        distances.add(new Distance(shops.get(17), shops.get(27), 50));
        distances.add(new Distance(shops.get(17), shops.get(28), 55));
        distances.add(new Distance(shops.get(17), shops.get(29), 27));
        distances.add(new Distance(shops.get(17), shops.get(30), 120));
        distances.add(new Distance(shops.get(17), shops.get(31), 52));
        distances.add(new Distance(shops.get(17), shops.get(32), 77));
        distances.add(new Distance(shops.get(17), shops.get(33), 45));//
        distances.add(new Distance(shops.get(17), shops.get(34), 70));//
        distances.add(new Distance(shops.get(17), shops.get(35), 80));//

        distances.add(new Distance(shops.get(18), shops.get(19), 80));
        distances.add(new Distance(shops.get(18), shops.get(20), 80));
        distances.add(new Distance(shops.get(18), shops.get(21), 120));
        distances.add(new Distance(shops.get(18), shops.get(22), 75));
        distances.add(new Distance(shops.get(18), shops.get(23), 110));
        distances.add(new Distance(shops.get(18), shops.get(24), 72));
        distances.add(new Distance(shops.get(18), shops.get(25), 105));
        distances.add(new Distance(shops.get(18), shops.get(26), 10));
        distances.add(new Distance(shops.get(18), shops.get(27), 60));
        distances.add(new Distance(shops.get(18), shops.get(28), 40));
        distances.add(new Distance(shops.get(18), shops.get(29), 77));
        distances.add(new Distance(shops.get(18), shops.get(30), 20));
        distances.add(new Distance(shops.get(18), shops.get(31), 43));
        distances.add(new Distance(shops.get(18), shops.get(32), 120));
        distances.add(new Distance(shops.get(18), shops.get(33), 60));//
        distances.add(new Distance(shops.get(18), shops.get(34), 90));//
        distances.add(new Distance(shops.get(18), shops.get(35), 120));//

        distances.add(new Distance(shops.get(19), shops.get(20), 170));
        distances.add(new Distance(shops.get(19), shops.get(21), 90));
        distances.add(new Distance(shops.get(19), shops.get(22), 10));
        distances.add(new Distance(shops.get(19), shops.get(23), 85));
        distances.add(new Distance(shops.get(19), shops.get(24), 10));
        distances.add(new Distance(shops.get(19), shops.get(25), 80));
        distances.add(new Distance(shops.get(19), shops.get(26), 85));
        distances.add(new Distance(shops.get(19), shops.get(27), 40));
        distances.add(new Distance(shops.get(19), shops.get(28), 45));
        distances.add(new Distance(shops.get(19), shops.get(29), 80));
        distances.add(new Distance(shops.get(19), shops.get(30), 90));
        distances.add(new Distance(shops.get(19), shops.get(31), 40));
        distances.add(new Distance(shops.get(19), shops.get(32), 90));
        distances.add(new Distance(shops.get(19), shops.get(33), 45));//
        distances.add(new Distance(shops.get(19), shops.get(34), 25));//
        distances.add(new Distance(shops.get(19), shops.get(35), 84));//

        distances.add(new Distance(shops.get(20), shops.get(21), 120));
        distances.add(new Distance(shops.get(20), shops.get(22), 180));
        distances.add(new Distance(shops.get(20), shops.get(23), 130));
        distances.add(new Distance(shops.get(20), shops.get(24), 175));
        distances.add(new Distance(shops.get(20), shops.get(25), 140));
        distances.add(new Distance(shops.get(20), shops.get(26), 96));
        distances.add(new Distance(shops.get(20), shops.get(27), 130));
        distances.add(new Distance(shops.get(20), shops.get(28), 120));
        distances.add(new Distance(shops.get(20), shops.get(29), 110));
        distances.add(new Distance(shops.get(20), shops.get(30), 82));
        distances.add(new Distance(shops.get(20), shops.get(31), 115));
        distances.add(new Distance(shops.get(20), shops.get(32), 77));
        distances.add(new Distance(shops.get(20), shops.get(33), 140));//
        distances.add(new Distance(shops.get(20), shops.get(34), 170));//
        distances.add(new Distance(shops.get(20), shops.get(35), 94));//

        distances.add(new Distance(shops.get(21), shops.get(22), 60));
        distances.add(new Distance(shops.get(21), shops.get(23), 10));
        distances.add(new Distance(shops.get(21), shops.get(24), 57));
        distances.add(new Distance(shops.get(21), shops.get(25), 15));
        distances.add(new Distance(shops.get(21), shops.get(26), 78));
        distances.add(new Distance(shops.get(21), shops.get(27), 40));
        distances.add(new Distance(shops.get(21), shops.get(28), 45));
        distances.add(new Distance(shops.get(21), shops.get(29), 75));
        distances.add(new Distance(shops.get(21), shops.get(30), 110));
        distances.add(new Distance(shops.get(21), shops.get(31), 42));
        distances.add(new Distance(shops.get(21), shops.get(32), 20));
        distances.add(new Distance(shops.get(21), shops.get(33), 45));//
        distances.add(new Distance(shops.get(21), shops.get(34), 75));//
        distances.add(new Distance(shops.get(21), shops.get(35), 15));//


        distances.add(new Distance(shops.get(22), shops.get(23), 50));
        distances.add(new Distance(shops.get(22), shops.get(24), 5));
        distances.add(new Distance(shops.get(22), shops.get(25), 45));
        distances.add(new Distance(shops.get(22), shops.get(26), 80));
        distances.add(new Distance(shops.get(22), shops.get(27), 30));
        distances.add(new Distance(shops.get(22), shops.get(28), 35));
        distances.add(new Distance(shops.get(22), shops.get(29), 58));
        distances.add(new Distance(shops.get(22), shops.get(30), 80));
        distances.add(new Distance(shops.get(22), shops.get(31), 33));
        distances.add(new Distance(shops.get(22), shops.get(32), 78));
        distances.add(new Distance(shops.get(22), shops.get(33), 34));
        distances.add(new Distance(shops.get(22), shops.get(34), 15));
        distances.add(new Distance(shops.get(22), shops.get(35), 78));//

        distances.add(new Distance(shops.get(23), shops.get(24), 45));
        distances.add(new Distance(shops.get(23), shops.get(25), 5));
        distances.add(new Distance(shops.get(23), shops.get(26), 67));
        distances.add(new Distance(shops.get(23), shops.get(27), 15));
        distances.add(new Distance(shops.get(23), shops.get(28), 25));
        distances.add(new Distance(shops.get(23), shops.get(29), 50));
        distances.add(new Distance(shops.get(23), shops.get(30), 77));
        distances.add(new Distance(shops.get(23), shops.get(31), 20));
        distances.add(new Distance(shops.get(23), shops.get(32), 30));
        distances.add(new Distance(shops.get(23), shops.get(33), 35));
        distances.add(new Distance(shops.get(23), shops.get(34), 60));
        distances.add(new Distance(shops.get(23), shops.get(35), 30));//

        distances.add(new Distance(shops.get(24), shops.get(25), 45));
        distances.add(new Distance(shops.get(24), shops.get(26), 80));
        distances.add(new Distance(shops.get(24), shops.get(27), 30));
        distances.add(new Distance(shops.get(24), shops.get(28), 35));
        distances.add(new Distance(shops.get(24), shops.get(29), 58));
        distances.add(new Distance(shops.get(24), shops.get(30), 80));
        distances.add(new Distance(shops.get(24), shops.get(31), 33));
        distances.add(new Distance(shops.get(24), shops.get(32), 78));
        distances.add(new Distance(shops.get(24), shops.get(33), 34));
        distances.add(new Distance(shops.get(24), shops.get(34), 15));
        distances.add(new Distance(shops.get(24), shops.get(35), 78));//

        distances.add(new Distance(shops.get(25), shops.get(26), 67));
        distances.add(new Distance(shops.get(25), shops.get(27), 10));
        distances.add(new Distance(shops.get(25), shops.get(28), 20));
        distances.add(new Distance(shops.get(25), shops.get(29), 45));
        distances.add(new Distance(shops.get(25), shops.get(30), 74));
        distances.add(new Distance(shops.get(25), shops.get(31), 15));
        distances.add(new Distance(shops.get(25), shops.get(32), 47));
        distances.add(new Distance(shops.get(25), shops.get(33), 25));
        distances.add(new Distance(shops.get(25), shops.get(34), 53));
        distances.add(new Distance(shops.get(25), shops.get(35), 58));//

        distances.add(new Distance(shops.get(26), shops.get(27), 50));
        distances.add(new Distance(shops.get(26), shops.get(28), 30));
        distances.add(new Distance(shops.get(26), shops.get(29), 64));
        distances.add(new Distance(shops.get(26), shops.get(30), 35));
        distances.add(new Distance(shops.get(26), shops.get(31), 35));
        distances.add(new Distance(shops.get(26), shops.get(32), 110));
        distances.add(new Distance(shops.get(26), shops.get(33), 60));
        distances.add(new Distance(shops.get(26), shops.get(34), 87));
        distances.add(new Distance(shops.get(26), shops.get(35), 116));//
        distances.add(new Distance(shops.get(27), shops.get(28), 10));
        distances.add(new Distance(shops.get(27), shops.get(29), 38));
        distances.add(new Distance(shops.get(27), shops.get(30), 70));
        distances.add(new Distance(shops.get(27), shops.get(31), 5));
        distances.add(new Distance(shops.get(27), shops.get(32), 55));
        distances.add(new Distance(shops.get(27), shops.get(33), 10));
        distances.add(new Distance(shops.get(27), shops.get(34), 40));
        distances.add(new Distance(shops.get(27), shops.get(35), 63));//
        distances.add(new Distance(shops.get(28), shops.get(29), 35));
        distances.add(new Distance(shops.get(28), shops.get(30), 60));
        distances.add(new Distance(shops.get(28), shops.get(31), 5));
        distances.add(new Distance(shops.get(28), shops.get(32), 65));
        distances.add(new Distance(shops.get(28), shops.get(33), 12));
        distances.add(new Distance(shops.get(28), shops.get(34), 39));
        distances.add(new Distance(shops.get(28), shops.get(35), 68));//
        distances.add(new Distance(shops.get(29), shops.get(30), 80));
        distances.add(new Distance(shops.get(29), shops.get(31), 35));
        distances.add(new Distance(shops.get(29), shops.get(32), 84));
        distances.add(new Distance(shops.get(29), shops.get(33), 45));
        distances.add(new Distance(shops.get(29), shops.get(34), 78));
        distances.add(new Distance(shops.get(29), shops.get(35), 100));
        distances.add(new Distance(shops.get(30), shops.get(31), 60));
        distances.add(new Distance(shops.get(30), shops.get(32), 110));
        distances.add(new Distance(shops.get(30), shops.get(33), 60));
        distances.add(new Distance(shops.get(30), shops.get(34), 87));
        distances.add(new Distance(shops.get(30), shops.get(35), 112));
        distances.add(new Distance(shops.get(31), shops.get(32), 55));
        distances.add(new Distance(shops.get(31), shops.get(33), 15));
        distances.add(new Distance(shops.get(31), shops.get(34), 45));
        distances.add(new Distance(shops.get(31), shops.get(35), 70));
        distances.add(new Distance(shops.get(32), shops.get(33), 65));
        distances.add(new Distance(shops.get(32), shops.get(34), 10));
        distances.add(new Distance(shops.get(32), shops.get(35), 89));
        distances.add(new Distance(shops.get(33), shops.get(34), 30));
        distances.add(new Distance(shops.get(33), shops.get(35), 60));
        distances.add(new Distance(shops.get(34), shops.get(35), 85));//


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
