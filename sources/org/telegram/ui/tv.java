package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class tv extends fi.q {
    public final cx P0;

    public tv(cx cxVar, Context context, cx cxVar2, int i7, int i10) {
        super(context, cxVar2, i7, i10);
        this.P0 = cxVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.h2) this.P0).actionBar;
        if (!kVar.y() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
