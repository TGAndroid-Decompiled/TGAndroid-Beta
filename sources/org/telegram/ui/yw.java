package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

public final class yw extends jh.p {
    public final gy K0;

    public yw(gy gyVar, Context context, gy gyVar2, int i10, int i11) {
        super(context, gyVar2, i10, i11);
        this.K0 = gyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return !((org.telegram.ui.ActionBar.n2) this.K0).actionBar.t() && super.dispatchTouchEvent(motionEvent);
    }
}
