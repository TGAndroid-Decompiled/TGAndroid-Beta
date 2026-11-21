package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends org.telegram.ui.Components.e10 {
    public qw(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
