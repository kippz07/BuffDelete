package com.example.android.buffordelete;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Jenny on 07/09/2016.
 */
public class CustomTextView extends TextView {

    public CustomTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontAdapter.getTypeface(context, "big_noodle_titling_oblique.ttf");

        setTypeface(customFont);
    }
}
