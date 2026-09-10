package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class uw extends org.telegram.ui.Components.r00 {
    public final wy B0;

    public uw(wy wyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.B0 = wyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f38471m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
