package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class tw extends th.m {
    public final zx O0;

    public tw(zx zxVar, Context context, zx zxVar2, int i10, int i11) {
        super(context, zxVar2, i10, i11);
        this.O0 = zxVar;
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
