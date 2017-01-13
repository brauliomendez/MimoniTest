package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Accommodation;
import brauliomendez.com.mimonitest.viewholder.AccommodationViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 13/01/2017.
 */

public class AccommodationAdapter extends EasyAdapter<AccommodationViewHolder, Accommodation> {

    @NotNull @Override public AccommodationViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new AccommodationViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_accommodation, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(AccommodationViewHolder holder, Accommodation accommodation, int i) {
        holder.bindItem(accommodation);
    }
}
