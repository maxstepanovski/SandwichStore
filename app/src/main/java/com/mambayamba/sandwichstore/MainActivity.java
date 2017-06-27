package com.mambayamba.sandwichstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.mambayamba.sandwichstore.AdapterPattern.Adapter;
import com.mambayamba.sandwichstore.AdapterPattern.CustomerLocation;
import com.mambayamba.sandwichstore.AdapterPattern.NewLocation;
import com.mambayamba.sandwichstore.AdapterPattern.OldLocation;
import com.mambayamba.sandwichstore.BridgePattern.AbstractSandwich;
import com.mambayamba.sandwichstore.BridgePattern.Closed;
import com.mambayamba.sandwichstore.BridgePattern.Open;
import com.mambayamba.sandwichstore.BridgePattern.Sandwich;
import com.mambayamba.sandwichstore.CriteriaPattern.AndCriteria;
import com.mambayamba.sandwichstore.CriteriaPattern.Filter;
import com.mambayamba.sandwichstore.CriteriaPattern.Ingredient;
import com.mambayamba.sandwichstore.CriteriaPattern.LocalFilter;
import com.mambayamba.sandwichstore.CriteriaPattern.NonLocalFilter;
import com.mambayamba.sandwichstore.CriteriaPattern.OrCriteria;
import com.mambayamba.sandwichstore.CriteriaPattern.VegetarianFilter;
import com.mambayamba.sandwichstore.FacadePattern.Facade;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final Filling fillings[] = new Filling[3];
    private RecyclerView recyclerView;
    private DataAdapter adapter;
    private TextView criteriaPatternTest;

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

        TextView oldLocationText = (TextView) findViewById(R.id.old_location);
        OldLocation oldLocation = new CustomerLocation();
        oldLocation.setBuilding("12 str.");
        oldLocation.setFloor(10);
        oldLocation.setOffice("computer office");
        oldLocation.setDesk(27);
        oldLocationText.setText(oldLocation.toString());

        TextView newLocationText = (TextView) findViewById(R.id.new_location);
        NewLocation newLocation = new Adapter(oldLocation);
        newLocationText.setText(newLocation.toString());

        AbstractSandwich openSandwich = new Sandwich(new Open(), "tomato", "egg");
        openSandwich.make();
        AbstractSandwich closedSandwich = new Sandwich(new Closed(), "ham", "ketchup");
        closedSandwich.make();

        ImageView productImage = (ImageView) findViewById(R.id.product_image);
        productImage.setImageResource(new Facade().dispenseDrink());

        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(new Ingredient("Cheddar", "Locally produced", true));
        ingredients.add(new Ingredient("Ham", "Cheshire", false));
        ingredients.add(new Ingredient("Tomato", "Kent", true));
        ingredients.add(new Ingredient("Turkey", "Locally produced", false));

        Filter local = new LocalFilter();
        Filter nonLocal = new NonLocalFilter();
        Filter vegetarian = new VegetarianFilter();
        Filter localAndVegetarian = new AndCriteria(local, vegetarian);
        Filter localOrVegetarian = new OrCriteria(local, vegetarian);

        criteriaPatternTest = (TextView) findViewById(R.id.criteria_pattern_test);
        printIngredients("LOCAL: \n", local.meetCriteria(ingredients));
        printIngredients("NON LOCAL: \n", nonLocal.meetCriteria(ingredients));
        printIngredients("VEGETARIAN: \n", vegetarian.meetCriteria(ingredients));
        printIngredients("localAndVegetarian: \n", localAndVegetarian.meetCriteria(ingredients));
        printIngredients("localOrVegetarian: \n", localOrVegetarian.meetCriteria(ingredients));
    }

    private void printIngredients(String header, List<Ingredient> ingredients){
        criteriaPatternTest.append(header);
        for(Ingredient i: ingredients){
            criteriaPatternTest.append(i.getName());
            criteriaPatternTest.append(" - ");
            criteriaPatternTest.append(i.getLocale());
            criteriaPatternTest.append("\n");
            criteriaPatternTest.toString();
        }
    }
}
