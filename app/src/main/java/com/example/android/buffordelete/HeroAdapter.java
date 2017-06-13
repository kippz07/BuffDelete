package com.example.android.buffordelete;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;
import java.util.ArrayList;

/**
 * Created by Jenny on 07/09/2016.
 */
public class HeroAdapter extends ArrayAdapter<Hero> {

    //private int mColorResourceId; , int colorResourceId

    public HeroAdapter(Activity context, ArrayList<Hero> heroName) {
        super(context, 0, heroName);
       // mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Hero} object located at this position in the list
        Hero currentHero = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
//        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_container);
        // Get the version name from the current Hero object and
        // set this text on the name TextView
//        nameTextView.setText(currentHero.getHeroName());

        ImageView nameView = (ImageView) listItemView.findViewById(R.id.heroName);
        nameView.setImageResource(currentHero.getNameResourceId());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.heroIcon);
        iconView.setImageResource(currentHero.getImageResourceId());

        return listItemView;
    }
}
