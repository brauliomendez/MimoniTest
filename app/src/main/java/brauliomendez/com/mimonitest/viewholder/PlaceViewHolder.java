package brauliomendez.com.mimonitest.viewholder;

import android.view.View;

import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyViewHolder;

/**
 * Created by Braulio on 15/01/2017.
 */

public class PlaceViewHolder extends EasyViewHolder {

    public PlaceViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
