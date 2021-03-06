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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

//import android.widget.Toolbar;
//android.support.v7.widget.Toolbar

public class SecondActivity extends AppCompatActivity {

    private AdView mAdView;
    Toolbar mToolbar;
    ImageView drink;
    TextView recipe;
    TextView directions;
    TextView equipment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


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
                equipment.setText(getResources().getString(R.string.Manhattan_eq));
                recipe.setText(getResources().getString(R.string.Manhattan_r));
                directions.setText(getResources().getString(R.string.Manhattan_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Margarita")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.margarita));
                equipment.setText(getResources().getString(R.string.Margarita_eq));
                recipe.setText(getResources().getString(R.string.Margarita_r));
                directions.setText(getResources().getString(R.string.Margarita_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Martini")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.martini));
                equipment.setText(getResources().getString(R.string.Martini_eq));
                recipe.setText(getResources().getString(R.string.Martini_r));
                directions.setText(getResources().getString(R.string.Martini_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Mojito")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.mojito));
                equipment.setText(getResources().getString(R.string.Mojito_eq));
                recipe.setText(getResources().getString(R.string.Mojito_r));
                directions.setText(getResources().getString(R.string.Mojito_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Negroni")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.negroni));
                equipment.setText(getResources().getString(R.string.Negroni_eq));
                recipe.setText(getResources().getString(R.string.Negroni_r));
                directions.setText(getResources().getString(R.string.Negroni_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Old Fashioned")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.oldfashioned));
                equipment.setText(getResources().getString(R.string.Old_Fashioned_eq));
                recipe.setText(getResources().getString(R.string.Old_Fashioned_r));
                directions.setText(getResources().getString(R.string.Old_Fashioned_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Paloma")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.paloma));
                equipment.setText(getResources().getString(R.string.Paloma_eq));
                recipe.setText(getResources().getString(R.string.Paloma_r));
                directions.setText(getResources().getString(R.string.Paloma_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Sangria")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.sangria));
                equipment.setText(getResources().getString(R.string.Sangria_eq));
                recipe.setText(getResources().getString(R.string.Sangria_r));
                directions.setText(getResources().getString(R.string.Sangria_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Spirtz")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.spritz));
                equipment.setText(getResources().getString(R.string.Spritz_eq));
                recipe.setText(getResources().getString(R.string.Spritz_r));
                directions.setText(getResources().getString(R.string.Sprtiz_dir));

            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Tom Collins")){
                drink.setImageDrawable(getResources().getDrawable(R.drawable.tomcollins));
                equipment.setText(getResources().getString(R.string.Tom_Collins_eq));
                recipe.setText(getResources().getString(R.string.Tom_Collins_r));
                directions.setText(getResources().getString(R.string.Tom_Collins_dir));
            }
        }

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        drink.startAnimation(myanim);



    }
}
