package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Experience;
import brauliomendez.com.mimonitest.viewholder.ExperiencesViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 14/01/2017.
 */

public class ExperiencesAdapter extends EasyAdapter<ExperiencesViewHolder, Experience> {

    @NotNull @Override public ExperiencesViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new ExperiencesViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_experiences, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(ExperiencesViewHolder holder, Experience sectionExperience, int i) {
        holder.bindItem(sectionExperience, sectionExperience.getCityExperiences());
    }
}
