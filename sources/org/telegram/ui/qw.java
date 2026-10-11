package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends org.telegram.ui.Components.b10 {
    public final sy B0;

    public qw(sy syVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = syVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f41947m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
