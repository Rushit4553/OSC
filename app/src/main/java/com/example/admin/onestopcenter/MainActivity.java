package com.example.admin.onestopcenter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    public static boolean myItemShouldBeEnabled;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.login_button);
        t1 = (TextView) findViewById(R.id.signupreq);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bi = new Intent(MainActivity.this,drawermenu.class);
                startActivity(bi);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ti = new Intent(MainActivity.this,register.class);
                startActivity(ti);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return  true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item = menu.findItem(R.id.logout);

        if (myItemShouldBeEnabled) {
            item.setEnabled(true);
        } else {
            // disabled
            item.setEnabled(false);
            item.setVisible(false);
        }
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                /*if(sharedpreferences!=null){
                    sharedpreferences = getApplicationContext().getSharedPreferences(MyPREFERENCES, 0);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(prefloc, "");
                    editor.putString(prefmobile, "");
                    editor.commit();
                }*/
                return true;
            case R.id.share:
                /*String message = "Welcome to Prabhuti Buildocone\n\n Download \"Prabhuti Buildcone\" from Google Play Store : \n\n https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName();
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(share, "Share this App link "));*/
                return true;


            case R.id.about:
                Intent ai = new Intent(MainActivity.this, about.class);
                startActivity(ai);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
