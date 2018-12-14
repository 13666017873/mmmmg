package com.example.resource.ui.adapter;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.resource.R;
import com.example.resource.base.LGRecycleViewAdapter;
import com.example.resource.base.LGViewHolder;
import com.example.resource.entity.MainBean;

import java.util.List;

public class MainAdapter extends LGRecycleViewAdapter<MainBean>
        implements LGRecycleViewAdapter.ItemClickListener {

    private List<MainBean> dataList;

    public MainAdapter(List<MainBean> dataList) {
        super(dataList);
        this.dataList = dataList;
    }

    @Override
    public int getItemViewType(int position) {
        return dataList.get(position).getBg();
    }

    @Override
    public int getLayoutId(int viewType) {
        switch (viewType) {
            case 0:
                return R.layout.item_main;
            case 1:
                return R.layout.item_main1;
            default:
                return R.layout.item_main;
        }
    }

    @Override
    public void convert(LGViewHolder holder, MainBean mainBean, int position) {

        TextView title = (TextView) holder.getView(R.id.item_main_center_text);
        title.setText(mainBean.getTitle());

        setOnItemClickListener(R.id.item_main_root, this);
    }

    @Override
    public void onItemClicked(View view, int position) {
        Log.e("dfdf", String.valueOf(position));
    }
}
