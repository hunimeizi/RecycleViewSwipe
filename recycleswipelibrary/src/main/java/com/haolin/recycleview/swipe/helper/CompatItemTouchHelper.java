
package com.haolin.recycleview.swipe.helper;

import androidx.recyclerview.widget.ItemTouchHelper;

public class CompatItemTouchHelper extends ItemTouchHelper {

    ItemTouchHelper.Callback mCallback;
    public CompatItemTouchHelper(ItemTouchHelper.Callback callback) {
        super(callback);
        mCallback = callback;
    }

    public ItemTouchHelper.Callback getCallback() {
        return mCallback;
    }
}
