package brauliomendez.com.mimonitest.viewholder;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import brauliomendez.com.mimonitest.R;
import brauliomendez.com.mimonitest.activity.DetailInformationActivity;
import brauliomendez.com.mimonitest.adapter.DetailPersonalAdapter;
import brauliomendez.com.mimonitest.model.Service;
import brauliomendez.com.mimonitest.model.ServiceApp;
import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.util.RecyclerViewItemClickListener;
import mx.leo.easyrecycler.util.extensions.RecyclerViewExtensionsKt;
import mx.leo.easyrecycler.viewholder.EasyItemViewHolder;

/**
 * Created by Braulio on 16/01/2017.
 */

public class PersonalViewHolder extends EasyItemViewHolder {

    @BindView(R.id.information_experience_button) Button nameExperienceButton;
    @BindView(R.id.name_experience_text_view) TextView nameExperienceTextView;
    @BindView(R.id.main_item_recycler_view) RecyclerView recyclerView;

    public PersonalViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bindItem(Service service) {
        nameExperienceTextView.setText(service.getName());
    }

    public void setUpRecyclerView(List<ServiceApp> serviceApp) {
        final DetailPersonalAdapter detailPersonalAdapter = new DetailPersonalAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(detailPersonalAdapter);
        detailPersonalAdapter.addItems((ArrayList<ServiceApp>) serviceApp);
        RecyclerViewExtensionsKt.OnItemClickListener(recyclerView, new RecyclerViewItemClickListener.OnItemClickListener() {
            @Override public void onItemClick(View view, Integer integer) {
                ServiceApp service = detailPersonalAdapter.getItems().get(integer);
                Intent intent = new Intent(recyclerView.getContext(), DetailInformationActivity.class);
                intent.putExtra("image", service.getImage());
                intent.putExtra("name", service.getName());
                recyclerView.getContext().startActivity(intent);
            }
        });
    }
}
