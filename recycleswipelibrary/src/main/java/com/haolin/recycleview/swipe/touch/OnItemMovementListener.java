
package com.haolin.recycleview.swipe.touch;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

public interface OnItemMovementListener {

    int INVALID = 0;

    int LEFT = ItemTouchHelper.LEFT;

    int UP = ItemTouchHelper.UP;

    int RIGHT = ItemTouchHelper.RIGHT;

    int DOWN = ItemTouchHelper.DOWN;

    int onDragFlags(RecyclerView recyclerView, RecyclerView.ViewHolder targetViewHolder);

    int onSwipeFlags(RecyclerView recyclerView, RecyclerView.ViewHolder targetViewHolder);

}
