package com.haolin.recycleview.sliding.delete.sample.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    protected Context mContext;
    protected List<T> mList; // 数据源
    protected LayoutInflater inflater;

    public BaseAdapter(Context context) {
        this.mContext = context;
        this.mList = new ArrayList<>();
        inflater = (LayoutInflater) mContext.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return onCreateVH(parent, viewType);
    }

    @Override
    public void onBindViewHolder(VH vh, int position) {
        onBindVH(vh, position);
    }


    public abstract VH onCreateVH(ViewGroup parent, int viewType);

    protected abstract void onBindVH(VH vh, int position);


    public void refreshData(List<T> data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        mList.clear();
        mList.addAll(data);
        notifyDataSetChanged();
    }

    public void loadMoreData(List<T> data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        mList.addAll(data);
        notifyDataSetChanged();
    }

    public void loadMoreData(int index, List<T> data) {
        if (data == null) return;
        mList.addAll(index, data);
        notifyDataSetChanged();
    }

    public void loadReplaceData(int index, T data) {
        if (data == null) return;
        mList.set(index, data);
        notifyDataSetChanged();
    }

    private int type;

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getItemViewType(int position) {
        return type;
    }

    public List<T> getData(){
        return mList;
    }
}
