package com.mambayamba.sandwichstore;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final Filling fillings[] = new Filling[3];
    private RecyclerView recyclerView;
    private DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillings[0] = new Filling(R.drawable.cheese, R.string.cheese);
        fillings[1] = new Filling(R.drawable.ham, R.string.ham);
        fillings[2] = new Filling(R.drawable.tomatoe, R.string.tomatoe);

        recyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        adapter = new DataAdapter(fillings);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
