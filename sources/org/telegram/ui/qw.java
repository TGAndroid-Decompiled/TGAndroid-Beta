package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends org.telegram.ui.Components.c10 {
    public qw(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() < 0.25f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
