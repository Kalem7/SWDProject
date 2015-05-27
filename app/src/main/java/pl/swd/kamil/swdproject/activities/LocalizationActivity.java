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

import java.util.ArrayList;

import pl.swd.kamil.swdproject.R;
import pl.swd.kamil.swdproject.database.Data;

public class LocalizationActivity extends ActionBarActivity {

    public ArrayAdapter adapter;
    Activity mContext;
    public static String TAG_PLACE_ID = "PLACE ID";
    public ArrayList<String> localizations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localization);
        setTitle(R.string.title_activity_localization);
        mContext = this;

        Data.addData();

        //String[] localizations = new String[] { "Wejście główne", "Wejście poziom -1", "Wejście od ul. Słowiańskiej", "Deichmann" , "House"};
        localizations = Data.getAllShopNames();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, localizations);
        final ListView list = (ListView) findViewById(R.id.availableLocalization);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent(mContext.getApplicationContext(), ProductsActivity.class);
                intent.putExtra(TAG_PLACE_ID, localizations.get(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_localization, menu);
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
