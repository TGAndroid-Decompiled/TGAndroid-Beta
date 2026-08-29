package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class xw extends lh.p {
    public final fy K0;

    public xw(fy fyVar, Context context, fy fyVar2, int i10, int i11) {
        super(context, fyVar2, i10, i11);
        this.K0 = fyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.K0).actionBar;
        if (!lVar.s() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
