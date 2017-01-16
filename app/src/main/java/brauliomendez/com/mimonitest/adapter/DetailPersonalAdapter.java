package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.ServiceApp;
import brauliomendez.com.mimonitest.viewholder.DetailPersonalViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 16/01/2017.
 */

public class DetailPersonalAdapter extends EasyAdapter<DetailPersonalViewHolder, ServiceApp> {

    @NotNull @Override public DetailPersonalViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new DetailPersonalViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_detail_personal, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(DetailPersonalViewHolder holder, ServiceApp serviceApp, int i) {
        holder.bindItem(serviceApp);
    }
}
