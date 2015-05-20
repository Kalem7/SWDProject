package pl.swd.kamil.swdproject.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import pl.swd.kamil.swdproject.R;

public class RouteActivity extends ActionBarActivity {

    Button bag1;
    Button bag2;
    Button bag3;
    Button bag4;
    Button bag5;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        mContext = this;
        bag1 = (Button) findViewById(R.id.bt_bag1);
        bag2 = (Button) findViewById(R.id.bt_bag2);
        bag3 = (Button) findViewById(R.id.bt_bag3);
        bag4 = (Button) findViewById(R.id.bt_bag4);
        bag5 = (Button) findViewById(R.id.bt_bag5);
        bag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                startActivity(intent);
            }
        });
        bag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                startActivity(intent);
            }
        });
        bag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                startActivity(intent);
            }
        });
        bag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                startActivity(intent);
            }
        });
        bag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_route, menu);
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
