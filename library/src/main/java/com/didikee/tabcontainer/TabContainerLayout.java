package com.didikee.tabcontainer;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by didik on 2017/3/23.
 */

public class TabContainerLayout extends LinearLayout {
    public TabContainerLayout(@NonNull Context context) {
        this(context,null);
    }

    public TabContainerLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TabContainerLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //parser attrs

        //test
        
    }

}
