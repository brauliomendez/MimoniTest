package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Place;
import brauliomendez.com.mimonitest.viewholder.PlaceViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 15/01/2017.
 */

public class PlaceAdapter extends EasyAdapter<PlaceViewHolder, Place> {

    @NotNull @Override public PlaceViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new PlaceViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_experiences, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(PlaceViewHolder holder, Place place, int i) {
        holder.bindItem(place, place.getCityPlaces());
    }
}
