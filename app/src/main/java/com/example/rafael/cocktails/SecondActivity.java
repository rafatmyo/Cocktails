package com.example.rafael.cocktails;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.widget.ImageView;

//import android.widget.Toolbar;
//android.support.v7.widget.Toolbar

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        drink = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mToolbar.setTitle(bundle.getString("CocktailName"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("Bloody Mary")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.bloodymary));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Cosmopolitan")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.cosmo));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Cuba Libre")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.cuba));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Daiquiri")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.daiquiri));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Gin Tonic")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.gintonic));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Manhattan")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.manhattan));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Margarita")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.margarita));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Martini")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.martini));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Mojito")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.mojito));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Negroni")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.negroni));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Old Fashioned")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.oldfashioned));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Paloma")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.paloma));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Sangria")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.sangria));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Spirtz")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.spritz));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Tom Collins")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.tomcollins));
            }
        }

    }
}