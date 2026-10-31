package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qx extends org.telegram.ui.Components.tz {
    public final ay B0;

    public qx(ay ayVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.B0 = ayVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f35841n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
