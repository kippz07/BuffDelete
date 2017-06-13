package com.example.android.buffordelete;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;

/**
 * Created by Jenny on 07/09/2016.
 */
public class Hero {

    private String mHeroName;

    private int mNameResourceId;

    private int mImageResourceId;

//    private String mHeroClassName; , String heroClassName

    private Class<?> mHeroClassName;

    public Hero(int nameResourceId, int imageResourceId, Class<?> heroClassName) {
        mNameResourceId = nameResourceId;
        //mHeroName = heroName;
        mImageResourceId = imageResourceId;
        mHeroClassName = heroClassName;
    }

//    public String getHeroName() {
//        return mHeroName;
//    } String heroName

    public int getNameResourceId() {
        return mNameResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Class<?> getHeroClassName() { return mHeroClassName; }
}
