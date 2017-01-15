package brauliomendez.com.mimonitest.viewholder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.adapter.DetailExperiencesAdapter;
import brauliomendez.com.mimonitest.model.CityExperience;
import brauliomendez.com.mimonitest.model.Experience;
import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyItemViewHolder;

/**
 * Created by Braulio on 14/01/2017.
 */

public class ExperiencesViewHolder extends EasyItemViewHolder {

    @BindView(R.id.information_experience_button) Button nameExperienceButton;
    @BindView(R.id.name_experience_text_view) TextView nameExperienceTextView;
    @BindView(R.id.experiences_item_recycler_view) RecyclerView recyclerView;

    public ExperiencesViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bindItem(Experience experience, List<CityExperience> experiences) {
        nameExperienceTextView.setText(experience.getCity());
        DetailExperiencesAdapter experiencesAdapter = new DetailExperiencesAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(experiencesAdapter);
        experiencesAdapter.addItems((ArrayList<CityExperience>) experiences);
    }
}
