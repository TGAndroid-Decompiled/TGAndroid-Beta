package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class vh extends org.telegram.ui.Components.on {
    public final wm N;

    public vh(wm wmVar, Activity activity, int i3, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, i3, document, e6Var);
        this.N = wmVar;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        float y9 = getY();
        wm wmVar = this.N;
        float y10 = wmVar.f51322g1.getY() + y9;
        this.K = wmVar.m1.getBackgroundSizeY();
        this.J = y10;
    }
}
