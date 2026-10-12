package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ww extends org.telegram.ui.Components.w00 {
    public final yy B0;

    public ww(yy yyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.B0 = yyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f42366m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
