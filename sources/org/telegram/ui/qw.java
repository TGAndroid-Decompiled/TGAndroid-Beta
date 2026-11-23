package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends org.telegram.ui.Components.oz {
    public final bx I0;

    public qw(bx bxVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.I0 = bxVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.I0.f46598p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
