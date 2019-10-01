package coffeecode.co.submissionandroidbeginner.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import coffeecode.co.submissionandroidbeginner.R;
import coffeecode.co.submissionandroidbeginner.model.ModelListFood;
import coffeecode.co.submissionandroidbeginner.utils.Global;

public class DetailFoodActivity extends AppCompatActivity {

    private TextView tvNameFood, tvDescFood;
    private ImageView imageFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        setViewId();
        getDataFromMain();

    }

    private void setViewId() {
        tvNameFood = findViewById(R.id.tvNameFood);
        tvDescFood = findViewById(R.id.tvDescFood);
        imageFood = findViewById(R.id.imageFood);
    }

    private void getDataFromMain() {
        Bundle bundle = getIntent().getExtras();
        ModelListFood listFoods;
        if (bundle != null) {
            listFoods = (ModelListFood) bundle.getSerializable(Global.KEY_DATA_FOOD);
            if (listFoods != null) {
                setView(listFoods);
            }
        }
    }

    private void setView(ModelListFood listFoods) {
        imageFood.setImageResource(listFoods.getImageFood());

        tvNameFood.setText(listFoods.getNameFood());

        tvDescFood.setText(listFoods.getDescFood());
    }
}
