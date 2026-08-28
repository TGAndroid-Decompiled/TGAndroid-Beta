package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class sx extends org.telegram.ui.Components.m10 {
    public sx(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
