package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class vw extends ih.r {
    public final dy K0;

    public vw(dy dyVar, Context context, dy dyVar2, int i9, int i10) {
        super(context, dyVar2, i9, i10);
        this.K0 = dyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.K0).actionBar;
        if (!kVar.s() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
