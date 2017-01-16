package brauliomendez.com.mimonitest.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.ServiceApp;
import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyViewHolder;

/**
 * Created by Braulio on 16/01/2017.
 */

public class DetailPersonalViewHolder extends EasyViewHolder {

    @BindView(R.id.detail_personal_image_view) ImageView detailPersonalImageView;
    @BindView(R.id.detail_service_text_view) TextView detailServiceTextView;
    @BindView(R.id.detail_name_text_view) TextView detailNameTextView;

    public DetailPersonalViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bindItem(ServiceApp serviceApp) {
        Glide.with(detailPersonalImageView.getContext()).load(serviceApp.getImage())
                .centerCrop().into(detailPersonalImageView);
        detailServiceTextView.setText(serviceApp.getName());
        detailNameTextView.setText(serviceApp.getPrice());
    }
}
