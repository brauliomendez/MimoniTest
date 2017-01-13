package brauliomendez.com.mimonitest.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.adapter.ViewPagerAdapter;
import brauliomendez.com.mimonitest.fragment.AccommodationFragment;
import brauliomendez.com.mimonitest.fragment.ExperiencesFragment;
import brauliomendez.com.mimonitest.fragment.PersonalFragment;
import brauliomendez.com.mimonitest.fragment.PlacesFragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_view_pager) ViewPager viewPager;
    @BindView(R.id.main_tab_layout) TabLayout tabLayout;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpViewPager();
        setUpTabLayout();
    }

    private void setUpViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PersonalFragment(), getResources().getString(R.string.name_personal_fragment));
        adapter.addFragment(new AccommodationFragment(), getResources().getString(R.string.name_accommodation_fragment));
        adapter.addFragment(new ExperiencesFragment(), getResources().getString(R.string.name_experiencies_fragment));
        adapter.addFragment(new PlacesFragment(), getResources().getString(R.string.name_places_fragment));
        viewPager.setAdapter(adapter);
    }

    private void setUpTabLayout(){
        tabLayout.setupWithViewPager(viewPager);
    }
}
