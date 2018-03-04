package com.example.rafael.cocktails;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by Rafael on 03/03/2018.
 */

public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
