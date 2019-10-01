package coffeecode.co.submissionandroidbeginner.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import coffeecode.co.submissionandroidbeginner.R;
import coffeecode.co.submissionandroidbeginner.adapter.AdapterCardFood;
import coffeecode.co.submissionandroidbeginner.adapter.AdapterGridFood;
import coffeecode.co.submissionandroidbeginner.adapter.AdapterListFood;
import coffeecode.co.submissionandroidbeginner.data.FoodData;
import coffeecode.co.submissionandroidbeginner.model.ModelListFood;
import coffeecode.co.submissionandroidbeginner.utils.Global;
import coffeecode.co.submissionandroidbeginner.utils.ItemClickListener;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Bundle bundle = new Bundle();

    private AdapterListFood adapterListFood;
    private AdapterGridFood adapterGridFood;
    private AdapterCardFood adapterCardFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViewId();
        showListRecyclerView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showListRecyclerView();
                break;
            case R.id.action_grid :
                showGridRecyclerView();
                break;
            case R.id.action_cardview :
                showCardRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showListRecyclerView() {
        adapterListFood = new AdapterListFood(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position, ModelListFood modelListFood) {
                Intent intent = new Intent(MainActivity.this, DetailFoodActivity.class);
                bundle.putSerializable(Global.KEY_DATA_FOOD, modelListFood);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        adapterListFood.setListFoods(FoodData.getListData());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterListFood);
    }

    private void showGridRecyclerView(){
        adapterGridFood = new AdapterGridFood(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position, ModelListFood modelListFood) {
                Intent intent = new Intent(MainActivity.this, DetailFoodActivity.class);
                bundle.putSerializable(Global.KEY_DATA_FOOD, modelListFood);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        adapterGridFood.setListFoods(FoodData.getListData());

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapterGridFood);
    }

    private void showCardRecyclerView(){
        adapterCardFood = new AdapterCardFood(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position, ModelListFood modelListFood) {
                Intent intent = new Intent(MainActivity.this, DetailFoodActivity.class);
                bundle.putSerializable(Global.KEY_DATA_FOOD, modelListFood);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        adapterCardFood.setListFoods(FoodData.getListData());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterCardFood);
    }

    private void setViewId() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
    }

}
