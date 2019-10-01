package coffeecode.co.submissionandroidbeginner.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import coffeecode.co.submissionandroidbeginner.R;
import coffeecode.co.submissionandroidbeginner.model.ModelListFood;
import coffeecode.co.submissionandroidbeginner.utils.ItemClickListener;

public class AdapterListFood extends RecyclerView.Adapter<AdapterListFood.ViewHolder>{

    private ArrayList<ModelListFood> listFoods = new ArrayList<>();
    private ItemClickListener itemClickListener;

    public AdapterListFood(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_food, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bindItem(listFoods.get(i), i, itemClickListener);
    }

    @Override
    public int getItemCount() {
        return listFoods.size();
    }

    public void setListFoods(ArrayList<ModelListFood> listFoods) {
        this.listFoods = listFoods;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameFood, tvDescFood;
        private ImageView imageFood;
        private View itemView;

        ViewHolder(@NonNull final View itemView) {
            super(itemView);

            tvNameFood = itemView.findViewById(R.id.tvNameFood);
            tvDescFood = itemView.findViewById(R.id.tvDescFood);
            imageFood = itemView.findViewById(R.id.imageFood);

            this.itemView = itemView;
        }

        void bindItem(final ModelListFood item, final int position, final ItemClickListener itemClickListener){
            tvNameFood.setText(item.getNameFood());
            tvDescFood.setText(item.getDescFood());
            imageFood.setImageResource(item.getImageFood());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickListener.onItemClick(itemView, position, item);
                }
            });
        }
    }
}
