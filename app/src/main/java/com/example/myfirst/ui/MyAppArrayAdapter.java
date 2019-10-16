package com.example.myfirst.ui;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.myfirst.models.Business;
import com.squareup.picasso.Picasso;

public class MyAppArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurants;
    private String[] mCuisines;

    public MyAppArrayAdapter(Context mContext, int resource, String[] mRestaurants, String[] mCuisines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position) {
        String restaurant = mRestaurants[position];
        String cuisine = mCuisines[position];
        return String.format("%S \nServes great : %S", restaurant, cuisine);

    }

    @Override
    public int getCount(){
        return  mRestaurants.length;
    }


}

