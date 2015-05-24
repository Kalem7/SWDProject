package pl.swd.kamil.swdproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Paulina on 2015-05-24.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ShoppingRoute.db";

    // PRODUCTS TABLE
    public static final String TABLE_PRODUCTS_NAME = "Products";
    public static final String TABLE_PRODUCTS_COLUMN_ID = "ProductID";
    public static final String TABLE_PRODUCTS_COLUMN_NAME = "ProductName";
    public static final String TABLE_PRODUCTS_COLUMN_CATEGORY_ID = "CategoryID";

    // SHOPS TABLE
    public static final String TABLE_SHOPS_NAME = "Shops";
    public static final String TABLE_SHOPS_COLUMN_ID = "ShopID";
    public static final String TABLE_SHOPS_COLUMN_NAME = "ShopName";
    public static final String TABLE_SHOPS_COLUMN_FLOOR = "Floor";
    public static final String TABLE_SHOPS_COLUMN_IMAGE = "Image";

    // PRODUCT CATEGORY TABLE
    public static final String TABLE_PRODUCT_CATEGORY_NAME = "ProductCategories";
    public static final String TABLE_PRODUCT_CATEGORY_COLUMN_ID = "CategoryID";
    public static final String TABLE_PRODUCT_CATEGORY_COLUMN_NAME = "CategoryName";

    // PRODUCTS IN SHOPS TABLE
    public static final String TABLE_PRODUCTS_IN_SHOPS_NAME = "ProductsInShops";
    public static final String TABLE_PRODUCTS_IN_SHOPS_COLUMN_ID = "ProductInShopID";
    public static final String TABLE_PRODUCTS_IN_SHOPS_COLUMN_SHOP_ID = "ShopID";
    public static final String TABLE_PRODUCTS_IN_SHOPS_COLUMN_PRODUCT_ID = "ProductID";

    // SHOPS DISTANCE TABLE
    public static final String TABLE_SHOPS_DISTANCES_NAME = "ShopsDistances";
    public static final String TABLE_SHOPS_DISTANCES_COLUMN_ID = "DistanceID";
    public static final String TABLE_SHOPS_DISTANCES_COLUMN_SHOP1_ID = "Shop1ID";
    public static final String TABLE_SHOPS_DISTANCES_COLUMN_SHOP2_ID = "Shop2ID";
    public static final String TABLE_SHOPS_DISTANCES_COLUMN_TIME = "Time";

    // CREATE QUERIES
    public static final String SQL_CREATE_PRODUCTS = "CREATE TABLE "+ TABLE_PRODUCTS_NAME+ " ("+
            TABLE_PRODUCTS_COLUMN_ID+ " INTEGER PRIMARY KEY,"+
            TABLE_PRODUCTS_COLUMN_NAME+ " TEXT,"+
            TABLE_PRODUCTS_COLUMN_CATEGORY_ID+ " INTEGER) ";

    public static final String SQL_CREATE_SHOPS = "CREATE TABLE "+ TABLE_SHOPS_NAME+ " ("+
            TABLE_SHOPS_COLUMN_ID+ " INTEGER PRIMARY KEY,"+
            TABLE_SHOPS_COLUMN_NAME+ " TEXT,"+
            TABLE_SHOPS_COLUMN_FLOOR+ " INTEGER,"+
            TABLE_SHOPS_COLUMN_IMAGE+ " TEXT) ";

    public static final String SQL_CREATE_PRODUCT_CATEGORIES = "CREATE TABLE "+ TABLE_PRODUCT_CATEGORY_NAME+ " ("+
            TABLE_PRODUCT_CATEGORY_COLUMN_ID+ " INTEGER PRIMARY KEY,"+
            TABLE_PRODUCT_CATEGORY_COLUMN_NAME+ " TEXT) ";

    public static final String SQL_CREATE_PRODUCTS_IN_SHOPS = "CREATE TABLE "+ TABLE_PRODUCTS_IN_SHOPS_NAME+ " ("+
            TABLE_PRODUCTS_IN_SHOPS_COLUMN_ID+ " INTEGER PRIMARY KEY,"+
            TABLE_PRODUCTS_IN_SHOPS_COLUMN_PRODUCT_ID+ " INTEGER,"+
            TABLE_PRODUCTS_IN_SHOPS_COLUMN_SHOP_ID+ " INTEGER) ";

    public static final String SQL_CREATE_SHOPS_DISTANCES = "CREATE TABLE "+ TABLE_SHOPS_DISTANCES_NAME+ " ("+
            TABLE_SHOPS_DISTANCES_COLUMN_ID+ " INTEGER PRIMARY KEY,"+
            TABLE_SHOPS_DISTANCES_COLUMN_SHOP1_ID+ " INTEGER,"+
            TABLE_SHOPS_DISTANCES_COLUMN_SHOP2_ID+ " INTEGER,"+
            TABLE_SHOPS_DISTANCES_COLUMN_TIME+ " INTEGER) ";

    // DELETE QUERIES
    public static final String SQL_DELETE_PRODUCTS = "DROP TABLE IF EXISTS "+TABLE_PRODUCTS_NAME;
    public static final String SQL_DELETE_SHOPS = "DROP TABLE IF EXISTS "+TABLE_SHOPS_NAME;
    public static final String SQL_DELETE_PRODUCT_CATEGORIES = "DROP TABLE IF EXISTS "+TABLE_PRODUCT_CATEGORY_NAME;
    public static final String SQL_DELETE_PRODUCTS_IN_SHOPS = "DROP TABLE IF EXISTS "+TABLE_PRODUCTS_IN_SHOPS_NAME;
    public static final String SQL_DELETE_SHOPS_DISTANCES = "DROP TABLE IF EXISTS "+TABLE_SHOPS_DISTANCES_NAME;

    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(SQL_CREATE_PRODUCTS);
        db.execSQL(SQL_CREATE_SHOPS);
        db.execSQL(SQL_CREATE_PRODUCT_CATEGORIES);
        db.execSQL(SQL_CREATE_PRODUCTS_IN_SHOPS);
        db.execSQL(SQL_CREATE_SHOPS_DISTANCES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(SQL_DELETE_PRODUCTS);
        db.execSQL(SQL_DELETE_SHOPS);
        db.execSQL(SQL_DELETE_PRODUCT_CATEGORIES);
        db.execSQL(SQL_DELETE_PRODUCTS_IN_SHOPS);
        db.execSQL(SQL_DELETE_SHOPS_DISTANCES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        onUpgrade(db, oldVersion, newVersion);
    }
}
