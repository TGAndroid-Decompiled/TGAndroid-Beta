package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class sw extends org.telegram.ui.Components.d10 {
    public final vy B0;

    public sw(vy vyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.B0 = vyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f42945m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
