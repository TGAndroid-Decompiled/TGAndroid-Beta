package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class sw extends org.telegram.ui.Components.k00 {
    public final uy B0;

    public sw(uy uyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.B0 = uyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f41326m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
