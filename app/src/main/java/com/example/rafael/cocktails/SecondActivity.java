package com.example.rafael.cocktails;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

//import android.widget.Toolbar;
//android.support.v7.widget.Toolbar

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView drink;
    TextView recipe;
    TextView directions;
    TextView equipment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        drink = (ImageView) findViewById(R.id.imageView);
        recipe = (TextView) findViewById(R.id.textView);
        directions = (TextView) findViewById(R.id.textView2);
        equipment = (TextView) findViewById(R.id.equipment);


        recipe.setMovementMethod(new ScrollingMovementMethod());
        directions.setMovementMethod(new ScrollingMovementMethod());

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mToolbar.setTitle(bundle.getString("CocktailName"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("Bloody Mary")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.bloodymary));
                equipment.setText(getResources().getString(R.string.Bloody_Mary_eq));
                recipe.setText(getResources().getString(R.string.Bloody_Mary_r));
                directions.setText(getResources().getString(R.string.Bloody_Mary_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Cosmopolitan")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.cosmo));
                equipment.setText(getResources().getString(R.string.Cosmopolitan_eq));
                recipe.setText(getResources().getString(R.string.Cosmopolitan_r));
                directions.setText(getResources().getString(R.string.Cosmopolitan_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Cuba Libre")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.cuba));
                equipment.setText(getResources().getString(R.string.Cuba_Libre_eq));
                recipe.setText(getResources().getString(R.string.Cuba_Libre_r));
                directions.setText(getResources().getString(R.string.Cuba_Libre_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Daiquiri")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.daiquiri));
                equipment.setText(getResources().getString(R.string.Daiquiri_eq));
                recipe.setText(getResources().getString(R.string.Daiquiri_r));
                directions.setText(getResources().getString(R.string.Daiquiri_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Gin Tonic")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.gintonic));
                equipment.setText(getResources().getString(R.string.Gintonic_eq));
                recipe.setText(getResources().getString(R.string.Gintonic_r));
                directions.setText(getResources().getString(R.string.Gintonic_dir));

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

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        drink.startAnimation(myanim);



    }
}
