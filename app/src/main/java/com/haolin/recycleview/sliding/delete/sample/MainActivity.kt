package com.haolin.recycleview.sliding.delete.sample

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.haolin.recycleview.sliding.delete.sample.adapter.MainAdapter
import com.haolin.recycleview.sliding.delete.sample.databinding.ActivityMainBinding
import com.haolin.recycleview.swipe.SwipeMenuCreator
import com.haolin.recycleview.swipe.SwipeMenuItem
import com.haolin.recycleview.swipe.SwipeMenuItemClickListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding =  DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val mSwipeMenuCreator =
            SwipeMenuCreator { leftMenu, rightMenu, viewType ->
                if (viewType == 1) {
                    val property: SwipeMenuItem = SwipeMenuItem(this)
                        .setText("删除")
                        .setTextColor(ContextCompat.getColor(this, R.color.white))
                        .setWidth(220)
                        .setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                        .setHeight(ViewGroup.LayoutParams.MATCH_PARENT)
                    rightMenu.addMenuItem(property)
                }
            }
        binding.recyclerView.setSwipeMenuCreator(mSwipeMenuCreator)
        val deleteItemListener =
            SwipeMenuItemClickListener { menuBridge ->
                menuBridge.closeMenu()
                val adapterPosition: Int = menuBridge.adapterPosition
                Toast.makeText(this,"删除$adapterPosition",Toast.LENGTH_SHORT).show()
            }
        binding.recyclerView.setSwipeMenuItemClickListener(deleteItemListener)
        val mAdapter = MainAdapter(this)
        binding.recyclerView.adapter = mAdapter
        val mList : MutableList<String> = ArrayList()
        mList.add("小明")
        mList.add("小红")
        mList.add("小白")
        mList.add("小李")
        mAdapter.refreshData(mList)
    }
}