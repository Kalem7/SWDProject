package pl.swd.kamil.swdproject.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import pl.swd.kamil.swdproject.R;

public class ProductsActivity extends ActionBarActivity {

    /*
    public static Product[] productsTab;
    public ArrayList<Product> products = new ArrayList<Product>();
    public ArrayList<Product> selectedProducts = new ArrayList<Product>();

*/
    public ArrayAdapter adapter;
    public ArrayAdapter selectedAdapter;
    Activity mContext;
    Button mNext;

    public static String TAG_PLACES = "PLACES";
    public int localizationID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        mContext = this;
        Bundle extras;
        extras = getIntent().getExtras();
        if (extras!=null) {
            localizationID = extras.getInt(LocalizationActivity.TAG_PLACE_ID);
        }

        mNext = (Button) findViewById(R.id.bt_next);
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RouteActivity.class);
                startActivity(intent);
            }
        });

        final ArrayList<String> products = new ArrayList<String>();
        products.add("Bluza");
        products.add("Buty sportowe");
        products.add("Koszulka");
        products.add("Kurtka");
        products.add("Skarpety");
        products.add("Spodnie");
        products.add("Torebka");
        final ArrayList<String> selectedProducts = new ArrayList<String>();

        adapter= new ArrayAdapter<String>(this, R.layout.list_item, products);
        selectedAdapter= new ArrayAdapter<String>(this, R.layout.list_item, selectedProducts);

        final ListView selectedList = (ListView) findViewById(R.id.selectedProductsList);
        final ListView list = (ListView) findViewById(R.id.availableProductsList);
        list.setAdapter(adapter);
        selectedList.setAdapter(selectedAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (selectedProducts.size() <5) {
                    String selectedProduct = (String) parent.getItemAtPosition(position);
                    selectedProducts.add(selectedProduct);
                    products.remove(selectedProduct);

                    selectedAdapter.notifyDataSetChanged();
                    adapter.notifyDataSetChanged();
                }
                else
                {
                    Toast.makeText(mContext, "Wybrałeś/aś już 5 produktów!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        selectedList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String selectedProduct = (String) parent.getItemAtPosition(position);
                products.add(selectedProduct);
                selectedProducts.remove(selectedProduct);
                selectedAdapter.notifyDataSetChanged();
                adapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_products, menu);
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
