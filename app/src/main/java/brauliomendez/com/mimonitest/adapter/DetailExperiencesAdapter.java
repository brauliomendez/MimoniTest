package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.CityExperience;
import brauliomendez.com.mimonitest.viewholder.DetailExperiencesViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 14/01/2017.
 */

public class DetailExperiencesAdapter extends EasyAdapter<DetailExperiencesViewHolder, CityExperience> {

    @NotNull @Override public DetailExperiencesViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new DetailExperiencesViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.detail_experience_card, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(DetailExperiencesViewHolder holder, CityExperience experience, int i) {
        holder.bindItem(experience);
    }
}
