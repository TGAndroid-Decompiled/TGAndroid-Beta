package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qx extends org.telegram.ui.Components.s00 {
    public final cy B0;

    public qx(cy cyVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.B0 = cyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f38633n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
