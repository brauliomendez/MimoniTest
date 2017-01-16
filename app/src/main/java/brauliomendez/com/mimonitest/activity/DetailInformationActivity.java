package brauliomendez.com.mimonitest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import brauliomendez.com.mimonitest.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailInformationActivity extends AppCompatActivity {

    @BindView(R.id.detail_info_image_view) ImageView detailInfoImageView;
    @BindView(R.id.detail_info_name_text_view) TextView detailInfoNameTextView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_information);
        ButterKnife.bind(this);
        setItem();
    }

    private void setItem() {
        Glide.with(this).load(getIntent().getExtras().getString("image")).centerCrop().into(detailInfoImageView);
        detailInfoNameTextView.setText(getIntent().getExtras().getString("name"));
    }
}
