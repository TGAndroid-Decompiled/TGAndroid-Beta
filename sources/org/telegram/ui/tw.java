package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class tw extends ci.r {
    public final cy O0;

    public tw(cy cyVar, Context context, cy cyVar2, int i10, int i11) {
        super(context, cyVar2, i10, i11);
        this.O0 = cyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        if (!kVar.t() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
