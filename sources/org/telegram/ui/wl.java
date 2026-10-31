package org.telegram.ui;

import android.app.Activity;
public final class wl extends vh.p2 {
    public final un L0;

    public wl(un unVar, Activity activity) {
        super(activity, 3);
        this.L0 = unVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - org.telegram.messenger.i0.L(120.0f)) + this.L0.Q1);
    }
}
