package com.haolin.recycleview.swipe.touch;


import com.haolin.recycleview.swipe.helper.CompatItemTouchHelper;

public class DefaultItemTouchHelper extends CompatItemTouchHelper {

    private final DefaultItemTouchHelperCallback mDefaultItemTouchHelperCallback;

    public DefaultItemTouchHelper() {
        this(new DefaultItemTouchHelperCallback());
    }

    private DefaultItemTouchHelper(DefaultItemTouchHelperCallback callback) {
        super(callback);
        mDefaultItemTouchHelperCallback = (DefaultItemTouchHelperCallback) getCallback();
    }

    public void setOnItemMoveListener(OnItemMoveListener onItemMoveListener) {
        mDefaultItemTouchHelperCallback.setOnItemMoveListener(onItemMoveListener);
    }


    public OnItemMoveListener getOnItemMoveListener() {
        return mDefaultItemTouchHelperCallback.getOnItemMoveListener();
    }


    public void setOnItemMovementListener(OnItemMovementListener onItemMovementListener) {
        mDefaultItemTouchHelperCallback.setOnItemMovementListener(onItemMovementListener);
    }

    public OnItemMovementListener getOnItemMovementListener() {
        return mDefaultItemTouchHelperCallback.getOnItemMovementListener();
    }

    public void setLongPressDragEnabled(boolean canDrag) {
        mDefaultItemTouchHelperCallback.setLongPressDragEnabled(canDrag);
    }

    public boolean isLongPressDragEnabled() {
        return mDefaultItemTouchHelperCallback.isLongPressDragEnabled();
    }


    public void setItemViewSwipeEnabled(boolean canSwipe) {
        mDefaultItemTouchHelperCallback.setItemViewSwipeEnabled(canSwipe);
    }

    public boolean isItemViewSwipeEnabled() {
        return this.mDefaultItemTouchHelperCallback.isItemViewSwipeEnabled();
    }


    public void setOnItemStateChangedListener(OnItemStateChangedListener onItemStateChangedListener) {
        this.mDefaultItemTouchHelperCallback.setOnItemStateChangedListener(onItemStateChangedListener);
    }


    public OnItemStateChangedListener getOnItemStateChangedListener() {
        return this.mDefaultItemTouchHelperCallback.getOnItemStateChangedListener();
    }

}
