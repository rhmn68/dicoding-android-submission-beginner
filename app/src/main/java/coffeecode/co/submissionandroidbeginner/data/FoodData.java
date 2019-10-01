package coffeecode.co.submissionandroidbeginner.data;

import java.util.ArrayList;

import coffeecode.co.submissionandroidbeginner.R;
import coffeecode.co.submissionandroidbeginner.model.ModelListFood;

public class FoodData {
    private static String[] dataNameFood = new String[]{
            "Bakso Seuhah",
            "Mie Goreng Kuah",
            "Nu Peunting Lada",
            "Tahu Gejrot"
    };

    private static String[] dataDescFood = new String[]{
            "Bakso Seuhan yang penting nikmat tersedia di toko terdekat jika anda kuat makanlah ini, makanan sehat menggiurkan dan membuat anda sakit perut!!",
            "Mie Goreng Kuah yang penting nikmat tersedia di toko terdekat jika anda kuat makanlah ini, makanan sehat menggiurkan dan membuat anda sakit perut!!",
            "Nu Peunting Lada yang penting nikmat tersedia di toko terdekat jika anda kuat makanlah ini, makanan sehat menggiurkan dan membuat anda sakit perut!!",
            "Tahu Gejrot yang penting nikmat tersedia di toko terdekat jika anda kuat makanlah ini, makanan sehat menggiurkan dan membuat anda sakit perut!!"
    };

    private static int[] dataImageFood = new int[]{
            R.drawable.bakso_seuhah,
            R.drawable.mie_goreng_kuah,
            R.drawable.nupenting_lada,
            R.drawable.tahu_gejrot
    };

    public static ArrayList<ModelListFood> getListData(){
        ArrayList<ModelListFood> listFoods = new ArrayList<>();
        for (int i = 0; i < dataNameFood.length; i++){
            listFoods.add(new ModelListFood(dataNameFood[i], dataImageFood[i], dataDescFood[i]));
        }
        return listFoods;
    }
}
