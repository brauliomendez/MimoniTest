package brauliomendez.com.mimonitest.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.util.ArrayList;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.adapter.ExperienceAdapter;
import brauliomendez.com.mimonitest.model.Experience;
import brauliomendez.com.mimonitest.model.ExperienceResponse;
import brauliomendez.com.mimonitest.util.JsonUtil;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Braulio on 13/01/2017.
 */

public class ExperienceFragment extends Fragment {

    @BindView(R.id.experience_recycler_view) RecyclerView recyclerView;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_experience, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        final ExperienceAdapter experiencesAdapter = new ExperienceAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(experiencesAdapter);
        experiencesAdapter.addItems((ArrayList<Experience>) getServices(getActivity()).getExperiences());
    }

    public ExperienceResponse getServices(Activity activity) {
        return new Gson().fromJson(JsonUtil.getDataFromAssets(activity, activity.getResources().
                getString(R.string.name_experiences_json)), ExperienceResponse.class);
    }
}
