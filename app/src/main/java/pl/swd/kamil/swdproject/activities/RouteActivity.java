package pl.swd.kamil.swdproject.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pl.swd.kamil.swdproject.R;
import pl.swd.kamil.swdproject.algorithm.Route;

public class RouteActivity extends ActionBarActivity {

    Button bag1;
    Button bag2;
    Button bag3;
    Button bag4;
    Button bag5;

    TextView time1;
    TextView time2;
    TextView time3;
    TextView time4;
    TextView time5;

    ImageView arrow1;
    ImageView arrow2;
    ImageView arrow3;
    ImageView arrow4;
    ImageView arrow5;

    Button[] bags;
    TextView[] times;
    ImageView[] arrows;

    Context mContext;
    public static Route route;
    public static String TAG_SHOP = "SHOP";
    public static String TAG_PRODUCT = "PRODUCT";


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

        time1 = (TextView) findViewById(R.id.tv_time1);
        time2 = (TextView) findViewById(R.id.tv_time2);
        time3 = (TextView) findViewById(R.id.tv_time3);
        time4 = (TextView) findViewById(R.id.tv_time4);
        time5 = (TextView) findViewById(R.id.tv_time5);

        arrow1 = (ImageView) findViewById(R.id.iv_arrow1);
        arrow2 = (ImageView) findViewById(R.id.iv_arrow2);
        arrow3 = (ImageView) findViewById(R.id.iv_arrow3);
        arrow4 = (ImageView) findViewById(R.id.iv_arrow4);
        arrow5 = (ImageView) findViewById(R.id.iv_arrow5);

        bags = new Button[5];
        bags[0] = bag1;
        bags[1] = bag2;
        bags[2] = bag3;
        bags[3] = bag4;
        bags[4] = bag5;

        arrows = new ImageView[5];
        arrows[0] = arrow1;
        arrows[1] = arrow2;
        arrows[2] = arrow3;
        arrows[3] = arrow4;
        arrows[4] = arrow5;

        times = new TextView[5];
        times[0] = time1;
        times[1] = time2;
        times[2] = time3;
        times[3] = time4;
        times[4] = time5;

        hideViews();
        fillView();

        bag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                intent.putExtra(TAG_SHOP, route.shops.get(1).name);
                intent.putExtra(TAG_PRODUCT, ProductsActivity.selectedProducts.get(0));
                startActivity(intent);
            }
        });
        bag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                intent.putExtra(TAG_SHOP, route.shops.get(2).name);
                intent.putExtra(TAG_PRODUCT, ProductsActivity.selectedProducts.get(1));
                startActivity(intent);
            }
        });
        bag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                intent.putExtra(TAG_SHOP, route.shops.get(3).name);
                intent.putExtra(TAG_PRODUCT, ProductsActivity.selectedProducts.get(2));
                startActivity(intent);
            }
        });
        bag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                intent.putExtra(TAG_SHOP, route.shops.get(4).name);
                intent.putExtra(TAG_PRODUCT, ProductsActivity.selectedProducts.get(3));
                startActivity(intent);
            }
        });
        bag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopDetailsActivity.class);
                intent.putExtra(TAG_SHOP, route.shops.get(5).name);
                intent.putExtra(TAG_PRODUCT, ProductsActivity.selectedProducts.get(4));
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

    private void hideViews()
    {
        if (route != null)
        {
            for (int i = route.getLength() - 1; i < 5; i++)
            {
                bags[i].setVisibility(View.GONE);
                arrows[i].setVisibility(View.GONE);
                times[i].setVisibility(View.GONE);

            }
        }

    }

    public void fillView()
    {
        int distance;
        if (route != null)
        {
            for (int i = 1; i < route.getLength(); i++)
            {
                bags[i-1].setText(route.shops.get(i).name);
                distance = route.shops.get(i-1).getDistance(route.shops.get(i));
                if (distance/60 >0)
                {
                    times[i-1].setText(distance/60+" min "+distance%60 +" s");
                }
                else
                {
                    times[i-1].setText(route.shops.get(i-1).getDistance(route.shops.get(i))+ " s");
                }

            }
        }
    }
}
