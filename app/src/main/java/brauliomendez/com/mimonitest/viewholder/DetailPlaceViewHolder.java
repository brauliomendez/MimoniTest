package brauliomendez.com.mimonitest.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.CityPlace;
import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyViewHolder;

/**
 * Created by Braulio on 15/01/2017.
 */

public class DetailPlaceViewHolder extends EasyViewHolder {

    @BindView(R.id.detail_place_image_view) ImageView detailPlaceImageView;
    @BindView(R.id.detail_autor_text_view) TextView detailAutorTextView;
    @BindView(R.id.detail_job_text_view) TextView detailJobTextView;

    public DetailPlaceViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bindItem(CityPlace experience) {
        detailAutorTextView.setText(experience.getAutor());
        detailJobTextView.setText(experience.getJob());
    }
}
