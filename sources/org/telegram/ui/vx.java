package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

public final class vx extends org.telegram.ui.Components.p10 {
    public vx(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || getAlpha() >= 0.25f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
