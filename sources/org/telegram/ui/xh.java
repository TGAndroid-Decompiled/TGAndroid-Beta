package org.telegram.ui;

import android.app.Activity;
public final class xh extends org.telegram.ui.Cells.t0 {
    public final wm f52026u2;

    public xh(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, wm wmVar) {
        super(activity, e6Var, false);
        this.f52026u2 = wmVar;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        float y9 = getY();
        wm wmVar = this.f52026u2;
        h0(wmVar.f51322g1.getY() + y9, wmVar.m1.getBackgroundSizeY());
    }
}
