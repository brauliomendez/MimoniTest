package brauliomendez.com.mimonitest.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Accommodation;
import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyItemViewHolder;

/**
 * Created by Braulio on 13/01/2017.
 */

public class AccommodationViewHolder extends EasyItemViewHolder {

    @BindView(R.id.accommodation_image_view) ImageView accommodationImageView;
    @BindView(R.id.price_text_view) TextView priceTextView;
    @BindView(R.id.name_text_view) TextView nameTextView;

    public AccommodationViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bindItem(Accommodation accommodation) {
        int id = accommodationImageView.getResources().getIdentifier(accommodation.getImage(), "drawable",
                accommodationImageView.getContext().getPackageName());
        Glide.with(accommodationImageView.getContext()).load(id).into(accommodationImageView);
        priceTextView.setText(accommodation.getPrice());
        nameTextView.setText(accommodation.getName());
    }
}
