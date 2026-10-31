package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class uw extends th.m {
    public final ay O0;

    public uw(ay ayVar, Context context, ay ayVar2, int i10, int i11) {
        super(context, ayVar2, i10, i11);
        this.O0 = ayVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.O0).actionBar;
        if (!lVar.u() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
