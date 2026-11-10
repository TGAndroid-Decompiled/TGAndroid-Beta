package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class sv extends di.q {
    public final zw O0;

    public sv(zw zwVar, Context context, zw zwVar2, int i7, int i10) {
        super(context, zwVar2, i7, i10);
        this.O0 = zwVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.f2) this.O0).actionBar;
        if (!lVar.x() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
