package com.example.rafael.cocktails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;
    ListView listView;
    SearchView searchView;


    String[] drinknames = {"Bloody Mary", "Cosmopolitan", "Cuba Libre", "Daiquiri", "Gin Tonic", "Manhattan", "Margarita", "Mojito"
            , "Negroni", "Martini", "Old Fashioned", "Paloma", "Sangria", "Spirtz", "Tom Collins"};
    int[] drinkpics = {
            R.drawable.bloodymary,
            R.drawable.cosmo,
            R.drawable.cuba,
            R.drawable.daiquiri,
            R.drawable.gintonic,
            R.drawable.manhattan,
            R.drawable.margarita,
            R.drawable.martini,
            R.drawable.mojito,
            R.drawable.negroni,
            R.drawable.oldfashioned,
            R.drawable.paloma,
            R.drawable.sangria,
            R.drawable.spritz,
            R.drawable.tomcollins
    };

    //ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));

        listView = (ListView) findViewById(R.id.listView);
        searchView = (SearchView) findViewById(R.id.searchView);



        final ArrayAdapter<String> mAdapater = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.cocktails));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapater.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("CocktailName", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        listView.setAdapter(mAdapater);

    }
}
