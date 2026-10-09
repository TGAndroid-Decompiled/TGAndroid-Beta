package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends org.telegram.ui.Components.a10 {
    public final ty B0;

    public qw(ty tyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.B0 = tyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f42212m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
