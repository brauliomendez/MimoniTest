package brauliomendez.com.mimonitest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import brauliomendez.com.mimonitest.R;
import butterknife.ButterKnife;

public class DetailExperienceActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_experience);
        ButterKnife.bind(this);
    }
}
