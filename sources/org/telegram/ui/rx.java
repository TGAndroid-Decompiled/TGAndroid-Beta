package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class rx extends org.telegram.ui.Components.m20 {
    public rx(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
