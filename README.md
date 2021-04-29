# RecycleView-侧滑删除

#### 使用方法
1.使用gradle
```js
repositories {
  google()
  mavenCentral()
}

dependencies {
  implementation 'io.github.hunimeizi:haolinRecycleViewSwipe:1.0.0'
}
```
2.使用示例
```js
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
```
3.Adapter配置

如果某个item不想进行侧滑删除，可在adapter中添加限制，在SwipeMenuCreator方法中进行判断，以下举例说明
```js
   override fun getItemViewType(position: Int): Int {
          return if (position % 2 == 1) {
              1
          } else {
              0
          }
      }
```
可见在getItemViewType中设置了itemViewType的值，可根据该值进行判断
```js
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
```

#### 内嵌上传 Maven Central
详细请看教程
[JCenter已经提桶跑路，是时候学会上传到Maven Central了](https://mp.weixin.qq.com/s/CrfYc1KsugJKPy_0rDZ49Q)