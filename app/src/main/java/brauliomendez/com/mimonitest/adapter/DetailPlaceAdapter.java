package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.CityPlace;
import brauliomendez.com.mimonitest.viewholder.DetailPlaceViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 15/01/2017.
 */

public class DetailPlaceAdapter extends EasyAdapter<DetailPlaceViewHolder, CityPlace> {

    @NotNull @Override public DetailPlaceViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new DetailPlaceViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_detail_place, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(DetailPlaceViewHolder holder, CityPlace cityPlace, int i) {
        holder.bindItem(cityPlace);
    }
}
