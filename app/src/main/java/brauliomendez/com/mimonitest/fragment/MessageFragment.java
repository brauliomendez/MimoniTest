package brauliomendez.com.mimonitest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import brauliomendez.com.mimonitest.R;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Braulio on 15/01/2017.
 */

public class MessageFragment extends Fragment {

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.explore_button) void goToMainActivity() {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .replace(R.id.main_frame_layout, new ServicesFragment())
                .commit();
    }
}
