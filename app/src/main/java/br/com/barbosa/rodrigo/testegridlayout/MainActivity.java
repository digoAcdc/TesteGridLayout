package br.com.barbosa.rodrigo.testegridlayout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ItemObject> rowListItem = getAllItemList();

        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();

        int qtdColuns = 3;

        if (width > height) {
            //LandScape
            qtdColuns = 3;

        }else{
            //Portrait
            qtdColuns = 2;
        }

        lLayout = new GridLayoutManager(MainActivity.this, qtdColuns);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("United States", R.drawable.android));
        allItems.add(new ItemObject("Canada", R.drawable.android1));
        allItems.add(new ItemObject("United Kingdom", R.drawable.android3));
        allItems.add(new ItemObject("Germany", R.drawable.android));
        allItems.add(new ItemObject("Sweden", R.drawable.android1));
        allItems.add(new ItemObject("United Kingdom", R.drawable.android3));
        allItems.add(new ItemObject("Germany", R.drawable.android));
        allItems.add(new ItemObject("Sweden", R.drawable.android1));
        allItems.add(new ItemObject("United States", R.drawable.android3));
        allItems.add(new ItemObject("Canada", R.drawable.android));
        allItems.add(new ItemObject("United Kingdom", R.drawable.android1));
        allItems.add(new ItemObject("Germany", R.drawable.android3));
        allItems.add(new ItemObject("Sweden", R.drawable.android));
        allItems.add(new ItemObject("United Kingdom", R.drawable.android1));
        allItems.add(new ItemObject("Germany", R.drawable.android3));
        allItems.add(new ItemObject("Sweden", R.drawable.android));

        return allItems;
    }
}
