package com.didikee.tabcontainer;

/**
 * Created by didik on 2017/3/23.
 */

public interface ViewPagerTracker {
    /**
     * 静止的时候，当前的Viewpager的index
     * @param cur 当前页index
     * @param pre 之前页index
     */
    void onIdleStatus(int cur,int pre);

    /**
     * 正在切换中，偏移量
     * @param offset 0~~1.0f
     */
    void onSwitching(float offset);
}
