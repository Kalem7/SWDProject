package pl.swd.kamil.swdproject.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import pl.swd.kamil.swdproject.R;
import pl.swd.kamil.swdproject.database.Product;
import pl.swd.kamil.swdproject.database.Shop;

public class ShopDetailsActivity extends ActionBarActivity {

    Shop shop;
    Product product;

    TextView shopName;
    TextView floor;
    TextView productName;
    TextView productCategory;
    ImageView shopImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_details);

        shopName = (TextView) findViewById(R.id.tv_shop_name);
        shopImage = (ImageView) findViewById(R.id.iv_shop_image);
        floor = (TextView) findViewById(R.id.tv_floor_label);
        productName = (TextView) findViewById(R.id.tv_product_label);
        productCategory = (TextView) findViewById(R.id.tv_category_label);

        Bundle extras = getIntent().getExtras();
        if (extras!=null) {
            shop = Shop.findShop(extras.getString(RouteActivity.TAG_SHOP));
            product = Product.findProduct(extras.getString(RouteActivity.TAG_PRODUCT));
        }

        shopName.setText(shop.name);
        shopImage.setImageResource(shop.imageResource);
        floor.setText("Pietro: " + shop.floor);
        productName.setText("Produkt: "+product.name);
        productCategory.setText("Kategoria: "+product.category.name);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shop_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
