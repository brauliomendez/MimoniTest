package brauliomendez.com.mimonitest.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.fragment.MessageFragment;
import brauliomendez.com.mimonitest.fragment.ProfileFragment;
import brauliomendez.com.mimonitest.fragment.ServicesFragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_bottom_navigation_view) BottomNavigationView bottomNavigationView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpBottomNavigationView();
        addFragment(new ServicesFragment());
    }

    private void addFragment(Fragment newFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .replace(R.id.main_frame_layout, newFragment)
                .commit();
    }

    private void setUpBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.
                OnNavigationItemSelectedListener() {
            @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_explore:
                        addFragment(new ServicesFragment());
                        break;
                    case R.id.action_messages:
                        addFragment(new MessageFragment());
                        break;
                    case R.id.action_profile:
                        addFragment(new ProfileFragment());
                        break;
                }
                return false;
            }
        });
    }
}
