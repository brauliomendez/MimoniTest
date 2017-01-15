package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Profile;
import brauliomendez.com.mimonitest.viewholder.HeaderProfileViewHolder;
import brauliomendez.com.mimonitest.viewholder.ProfileViewHolder;
import mx.leo.easyrecycler.adapter.EasyHeaderAdapter;
import mx.leo.easyrecycler.viewholder.EasyHeaderViewHolder;
import mx.leo.easyrecycler.viewholder.EasyItemViewHolder;
import mx.leo.easyrecycler.viewholder.EasyViewHolder;

/**
 * Created by Braulio on 15/01/2017.
 */

public class ProfileAdapter extends EasyHeaderAdapter<Profile> {

    @NotNull @Override public EasyHeaderViewHolder createHeaderViewHolder(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_profile_recycler_view, viewGroup, false);
        return new HeaderProfileViewHolder(view);
    }

    @NotNull @Override public EasyItemViewHolder createItemViewHolder(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_profile, viewGroup, false);
        return new ProfileViewHolder(view);
    }

    @Override public void onBindHeaderViewHolder(EasyViewHolder easyViewHolder) {

    }

    @Override public void onBindItemViewHolder(EasyViewHolder holder, Profile profile, int i) {
        ((ProfileViewHolder) holder).bindItem(profile);
    }
}
