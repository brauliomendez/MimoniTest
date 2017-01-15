package brauliomendez.com.mimonitest.viewholder;

import android.view.View;

import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyHeaderViewHolder;

/**
 * Created by Braulio on 15/01/2017.
 */

public class HeaderProfileViewHolder extends EasyHeaderViewHolder {

    public HeaderProfileViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
