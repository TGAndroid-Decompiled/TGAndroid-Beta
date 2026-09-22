package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ti extends org.telegram.ui.Components.jo {
    public final zn M;

    public ti(zn znVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.M = znVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        zn znVar = this.M;
        float y10 = znVar.R0.getY() + y3;
        this.J = znVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
