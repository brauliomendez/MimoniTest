package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Experience;
import brauliomendez.com.mimonitest.viewholder.ExperienceViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 14/01/2017.
 */

public class ExperienceAdapter extends EasyAdapter<ExperienceViewHolder, Experience> {

    @NotNull @Override public ExperienceViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new ExperienceViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.layout_main_adapter, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(ExperienceViewHolder holder, Experience sectionExperience, int i) {
        holder.bindItem(sectionExperience);
        holder.setUpDetailRecyclerView(sectionExperience.getCityExperiences());
    }
}
