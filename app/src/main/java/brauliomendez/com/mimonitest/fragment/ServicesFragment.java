package brauliomendez.com.mimonitest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.adapter.ViewPagerAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Braulio on 15/01/2017.
 */

public class ServicesFragment extends Fragment {

    @BindView(R.id.main_view_pager) ViewPager viewPager;
    @BindView(R.id.main_tab_layout) TabLayout tabLayout;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpViewPager();
        setUpTabLayout();
    }

    private void setUpViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PersonalFragment(), getResources().getString(R.string.name_personal_fragment));
        adapter.addFragment(new AccommodationFragment(), getResources().getString(R.string.name_accommodation_fragment));
        adapter.addFragment(new ExperienceFragment(), getResources().getString(R.string.name_experiencies_fragment));
        adapter.addFragment(new PlaceFragment(), getResources().getString(R.string.name_places_fragment));
        viewPager.setAdapter(adapter);
    }

    private void setUpTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
    }
}
