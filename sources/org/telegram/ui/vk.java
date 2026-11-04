package org.telegram.ui;

import android.app.Activity;
public final class vk extends gi.l3 {
    public final wm X0;

    public vk(wm wmVar, Activity activity) {
        super(activity, 3);
        this.X0 = wmVar;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.X0.R1);
    }
}
