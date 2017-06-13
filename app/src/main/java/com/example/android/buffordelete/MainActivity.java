package com.example.android.buffordelete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Hero> heroName = new ArrayList<>();

        heroName.add(new Hero(R.drawable.ana3, R.drawable.ana2, Ana.class));
        heroName.add(new Hero(R.drawable.bastion3, R.drawable.bastion2, Bastion.class));
        heroName.add(new Hero(R.drawable.dva3, R.drawable.dva2, Dva.class));
        heroName.add(new Hero(R.drawable.genji3, R.drawable.genji2, Genji.class));
        heroName.add(new Hero(R.drawable.hanzo3, R.drawable.hanzo2, Hanzo.class));
        heroName.add(new Hero(R.drawable.junkrat3, R.drawable.junkrat2, Junkrat.class));
        heroName.add(new Hero(R.drawable.lucio3, R.drawable.lucio2, Lucio.class));
        heroName.add(new Hero(R.drawable.mccree3, R.drawable.mccree2, McCree.class));
        heroName.add(new Hero(R.drawable.mei3, R.drawable.mei2, Mei.class));
        heroName.add(new Hero(R.drawable.mercy3, R.drawable.mercy2, Mercy.class));
        heroName.add(new Hero(R.drawable.pharah3, R.drawable.pharah2, Pharah.class));
        heroName.add(new Hero(R.drawable.reaper3, R.drawable.reaper2, Reaper.class));
        heroName.add(new Hero(R.drawable.reinhardt3, R.drawable.reinhardt2, Reinhardt.class));
        heroName.add(new Hero(R.drawable.roadhog3, R.drawable.roadhog2, Roadhog.class));
        heroName.add(new Hero(R.drawable.soldier3, R.drawable.soldier2, Soldier.class));
        heroName.add(new Hero(R.drawable.symmetra3, R.drawable.symmetra2, Symmetra.class));
        heroName.add(new Hero(R.drawable.torbjorn3, R.drawable.torbjorn2, Torbjorn.class));
        heroName.add(new Hero(R.drawable.tracer3, R.drawable.tracer2, Tracer.class));
        heroName.add(new Hero(R.drawable.widowmaker3, R.drawable.widowmaker2, Widowmaker.class));
        heroName.add(new Hero(R.drawable.winston3, R.drawable.winston2, Winston.class));
        heroName.add(new Hero(R.drawable.zarya3, R.drawable.zarya2, Zarya.class));
        heroName.add(new Hero(R.drawable.zenyatta3, R.drawable.zenyatta2, Zenyatta.class));

        //, R.color.sample

        HeroAdapter adapter = new HeroAdapter(this, heroName);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            String DEBUG = "tag";

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Hero hero = heroName.get(position);
                Intent intent = new Intent(MainActivity.this, hero.getHeroClassName());
                Log.v(DEBUG, "name: " + hero.getHeroClassName());
                startActivity(intent);
            }
        });
    }
}
