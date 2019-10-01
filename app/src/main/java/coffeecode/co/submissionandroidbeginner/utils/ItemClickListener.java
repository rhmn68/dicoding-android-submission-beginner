package coffeecode.co.submissionandroidbeginner.utils;

import android.view.View;

import coffeecode.co.submissionandroidbeginner.model.ModelListFood;

public interface ItemClickListener {
    void onItemClick(View view, int position, ModelListFood modelListFood);
}