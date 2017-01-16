package brauliomendez.com.mimonitest.viewholder;

import android.view.View;
import android.widget.TextView;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Profile;
import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyItemViewHolder;

/**
 * Created by Braulio on 15/01/2017.
 */

public class ProfileViewHolder extends EasyItemViewHolder {

    @BindView(R.id.option_profile_text_view) TextView optionProfileTextView;

    public ProfileViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bindItem(Profile profile) {
        optionProfileTextView.setText(profile.getOption());
    }
}
