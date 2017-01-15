package brauliomendez.com.mimonitest.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

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
    @BindView(R.id.main_bottom_navigation_view) BottomNavigationView bottomNavigationView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpViewPager();
        setUpTabLayout();
        setUpBottomNavigationView();
    }

    private void setUpViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PersonalFragment(), getResources().getString(R.string.name_personal_fragment));
        adapter.addFragment(new AccommodationFragment(), getResources().getString(R.string.name_accommodation_fragment));
        adapter.addFragment(new ExperiencesFragment(), getResources().getString(R.string.name_experiencies_fragment));
        adapter.addFragment(new PlacesFragment(), getResources().getString(R.string.name_places_fragment));
        viewPager.setAdapter(adapter);
    }

    private void setUpTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpBottomNavigationView(){
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.
                OnNavigationItemSelectedListener() {
            @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_explore:
                        Toast.makeText(MainActivity.this, ".l.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_messages:
                        Toast.makeText(MainActivity.this, ".l.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_profile:
                        Toast.makeText(MainActivity.this, ".l.", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }
}
