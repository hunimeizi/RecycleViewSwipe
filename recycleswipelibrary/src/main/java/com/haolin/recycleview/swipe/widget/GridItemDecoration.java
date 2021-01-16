/*
 * AUTHOR：YanZhenjie
 *
 * DESCRIPTION：create the File, and add the content.
 *
 * Copyright © www.mamaqunaer.com. All Rights Reserved
 *
 */
package com.haolin.recycleview.swipe.widget;


import androidx.annotation.ColorInt;

@Deprecated
public class GridItemDecoration extends DefaultItemDecoration {

    public GridItemDecoration(@ColorInt int color) {
        super(color);
    }

    public GridItemDecoration(@ColorInt int color, int dividerWidth, int dividerHeight, int... excludeViewType) {
        super(color, dividerWidth, dividerHeight, excludeViewType);
    }
}
