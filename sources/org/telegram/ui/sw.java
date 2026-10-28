package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class sw extends di.r {
    public final ey O0;

    public sw(ey eyVar, Context context, ey eyVar2, int i10, int i11) {
        super(context, eyVar2, i10, i11);
        this.O0 = eyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.O0).actionBar;
        if (!kVar.q() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
