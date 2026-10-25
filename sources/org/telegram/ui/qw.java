package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qw extends di.r {
    public final cy O0;

    public qw(cy cyVar, Context context, cy cyVar2, int i10, int i11) {
        super(context, cyVar2, i10, i11);
        this.O0 = cyVar;
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
