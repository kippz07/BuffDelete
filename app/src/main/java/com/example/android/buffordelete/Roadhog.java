package com.example.android.buffordelete;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Roadhog extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    private boolean buffClick = false;
    private boolean deleteClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_layout);

        ImageView image = (ImageView) findViewById(R.id.heroImage);
        image.setImageResource(R.drawable.roadhog2);

        TextView buff = (TextView) findViewById(R.id.buff);
        TextView delete = (TextView) findViewById(R.id.delete);

        Typeface newFont = Typeface.createFromAsset(getAssets(), "big_noodle_titling_oblique.ttf");
        buff.setTypeface(newFont);
        delete.setTypeface(newFont);

        final ImageView arrow = (ImageView)findViewById(R.id.arrow);
        arrow.setVisibility(View.INVISIBLE);
        final ImageView cross = (ImageView)findViewById(R.id.cross);
        cross.setVisibility(View.INVISIBLE);

        final Animation animationFadeIn = AnimationUtils.loadAnimation(Roadhog.this, R.anim.fadein);
        final Animation animationFadeOut = AnimationUtils.loadAnimation(Roadhog.this, R.anim.fadeout);


        buff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(Roadhog.this, R.raw.roadhog_wholehog);
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

                if (deleteClick) { cross.clearAnimation(); }

                arrow.startAnimation(animationFadeOut);

                animationFadeOut.setAnimationListener(new Animation.AnimationListener() {

                    @Override
                    public void onAnimationStart(Animation animation) {
                        buffClick = true;
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        buffClick = false;
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(Roadhog.this, R.raw.roadhog_serious);
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

                if (buffClick) { arrow.clearAnimation(); }

                cross.startAnimation(animationFadeOut);

                animationFadeOut.setAnimationListener(new Animation.AnimationListener() {

                    @Override
                    public void onAnimationStart(Animation animation) {
                        deleteClick = true;
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        deleteClick = false;
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }
}
