package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class tx extends org.telegram.ui.Components.s00 {
    public final ey B0;

    public tx(ey eyVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.B0 = eyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f39045n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
