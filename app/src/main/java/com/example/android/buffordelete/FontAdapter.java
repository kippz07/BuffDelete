package com.example.android.buffordelete;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Jenny on 07/09/2016.
 */
public class FontAdapter {

    private static HashMap<String, Typeface> fontCashe = new HashMap<>();

    public static Typeface getTypeface(Context context, String fontName) {

        Typeface typeface = fontCashe.get(fontName);

        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), fontName);

            fontCashe.put(fontName, typeface);
        }
        return typeface;
    }

}
