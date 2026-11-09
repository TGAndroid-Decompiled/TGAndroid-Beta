package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class rv extends di.q {
    public final yw O0;

    public rv(yw ywVar, Context context, yw ywVar2, int i7, int i10) {
        super(context, ywVar2, i7, i10);
        this.O0 = ywVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.O0).actionBar;
        if (!kVar.w() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
