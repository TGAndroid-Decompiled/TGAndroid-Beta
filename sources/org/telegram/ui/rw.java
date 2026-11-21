package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class rw extends org.telegram.ui.Components.rz {
    public final cx I0;

    public rw(cx cxVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.I0 = cxVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.I0.f46768p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
