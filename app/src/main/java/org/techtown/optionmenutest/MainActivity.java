package org.techtown.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;
    Button but;
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = (LinearLayout)findViewById(R.id.linear);
        but=(Button)findViewById(R.id.item_but_rotate);
        but1=(Button)findViewById(R.id.but_ok);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.item_blue:
                linear.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.item_red:
                linear.setBackgroundColor(Color.RED);
                return true;
            case R.id.item_yellow:
                linear.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.item_but_rotate:
                but1.setRotation(35);
                return true;
            case R.id.item_but_size:
                but1.setScaleX(but1.getScaleX()*1.5f);
                return true;
        }
        return false;
    }
}