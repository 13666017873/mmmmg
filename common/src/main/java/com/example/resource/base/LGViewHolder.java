package com.example.resource.base;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class LGViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> mViews;
    private View mConvertView;//缓存itemView内部的子View

    public LGViewHolder(View itemView) {
        super(itemView);
        mConvertView = itemView;
        mViews = new SparseArray<>();
    }

    /**
     * 加载layoutId视图并用LGViewHolder保存
     * @param parent
     * @param layoutId
     * @return
     */
    protected static LGViewHolder getViewHolder(ViewGroup parent, int layoutId) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
        return new LGViewHolder(itemView);
    }

    /**
     * 根据ItemView的id获取子视图View
     * @param viewId
     * @return
     */
    public View getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return view;
    }
}