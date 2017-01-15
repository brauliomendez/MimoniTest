package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.CityExperience;
import brauliomendez.com.mimonitest.viewholder.DetailExperienceViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 14/01/2017.
 */

public class DetailExperienceAdapter extends EasyAdapter<DetailExperienceViewHolder, CityExperience> {

    @NotNull @Override public DetailExperienceViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new DetailExperienceViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_detail_experience, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(DetailExperienceViewHolder holder, CityExperience experience, int i) {
        holder.bindItem(experience);
    }
}
