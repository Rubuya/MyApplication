package org.example.bitmtraier401.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextpage(View view) {
        Intent nextpagenavigate = new Intent(this, AuthorActivity.class);
        startActivity(nextpagenavigate);
    }

    public void anothernextpage(View view) {
        Intent anothernextpagenavigate = new Intent(this, CatagoryActivity.class);
        startActivity(anothernextpagenavigate);
    }
}