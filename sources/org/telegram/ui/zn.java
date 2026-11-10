package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class zn extends org.telegram.ui.Components.hm0 {
    public final io N;

    public zn(io ioVar, Context context, org.telegram.ui.Components.gm0 gm0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, gm0Var, h6Var, false);
        this.N = ioVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.N.L && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.N.L && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }
}
