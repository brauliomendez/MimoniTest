package brauliomendez.com.mimonitest.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.model.Service;
import brauliomendez.com.mimonitest.viewholder.PersonalViewHolder;
import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by Braulio on 16/01/2017.
 */

public class PersonalAdapter extends EasyAdapter<PersonalViewHolder, Service> {

    @NotNull @Override public PersonalViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new PersonalViewHolder(LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.layout_main_adapter, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(PersonalViewHolder holder, Service service, int i) {
        holder.bindItem(service);
        holder.setUpRecyclerView(service.getAppServices());
    }
}
