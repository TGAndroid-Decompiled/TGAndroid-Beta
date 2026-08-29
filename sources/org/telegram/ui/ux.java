package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ux extends org.telegram.ui.Components.x10 {
    public ux(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
