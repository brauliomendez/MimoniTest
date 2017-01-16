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
import brauliomendez.com.mimonitest.adapter.PersonalAdapter;
import brauliomendez.com.mimonitest.model.Service;
import brauliomendez.com.mimonitest.model.ServiceResponse;
import brauliomendez.com.mimonitest.util.JsonUtil;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Braulio on 13/01/2017.
 */

public class PersonalFragment extends Fragment {

    @BindView(R.id.personal_recycler_view) RecyclerView recyclerView;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        PersonalAdapter placeAdapter = new PersonalAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(placeAdapter);
        placeAdapter.addItems((ArrayList<Service>) getServices(getActivity()).getServices());
    }

    public ServiceResponse getServices(Activity activity) {
        return new Gson().fromJson(JsonUtil.getDataFromAssets(activity, activity.getResources().
                getString(R.string.name_personal_json)), ServiceResponse.class);
    }
}
