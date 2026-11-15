package org.telegram.ui;

import android.app.Activity;
public final class zk extends hi.l3 {
    public final an X0;

    public zk(an anVar, Activity activity) {
        super(activity, 3);
        this.X0 = anVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.X0.R1);
    }
}
