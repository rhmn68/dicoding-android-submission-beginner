package coffeecode.co.submissionandroidbeginner.model;

import java.io.Serializable;

public class ModelListFood implements Serializable {
    private String nameFood;
    private int imageFood;
    private  String descFood;

    public ModelListFood() {
    }

    public ModelListFood(String nameFood, int imageFood, String descFood) {
        this.nameFood = nameFood;
        this.imageFood = imageFood;
        this.descFood = descFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getImageFood() {
        return imageFood;
    }

    public void setImageFood(int imageFood) {
        this.imageFood = imageFood;
    }

    public String getDescFood() {
        return descFood;
    }

    public void setDescFood(String descFood) {
        this.descFood = descFood;
    }
}
