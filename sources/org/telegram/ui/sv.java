package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class sv extends fi.q {
    public final bx P0;

    public sv(bx bxVar, Context context, bx bxVar2, int i7, int i10) {
        super(context, bxVar2, i7, i10);
        this.P0 = bxVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.P0).actionBar;
        if (!kVar.x() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
