package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qv extends fi.q {
    public final yw P0;

    public qv(yw ywVar, Context context, yw ywVar2, int i7, int i10) {
        super(context, ywVar2, i7, i10);
        this.P0 = ywVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.e2) this.P0).actionBar;
        if (!kVar.x() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
