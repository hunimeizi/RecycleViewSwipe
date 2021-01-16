package com.haolin.recycleview.sliding.delete.sample.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.haolin.recycleview.sliding.delete.sample.R
import com.haolin.recycleview.sliding.delete.sample.base.BaseAdapter
import com.haolin.recycleview.sliding.delete.sample.base.BaseViewHolder
import com.haolin.recycleview.sliding.delete.sample.databinding.ItemMainBinding

class MainAdapter(mContext: Context) :
    BaseAdapter<String, BaseViewHolder<ItemMainBinding>>(mContext) {

    override fun onCreateVH(parent: ViewGroup?, viewType: Int): BaseViewHolder<ItemMainBinding> {
        return BaseViewHolder(DataBindingUtil.inflate(inflater, R.layout.item_main, parent, false))
    }

    override fun onBindVH(vh: BaseViewHolder<ItemMainBinding>?, position: Int) {
        val binding = vh!!.binding
        binding.kName = mList[position]
        binding.executePendingBindings()
    }

    override fun getItemViewType(position: Int): Int {
        return if (position % 2 == 1) {
            1
        } else {
            0
        }
    }
}