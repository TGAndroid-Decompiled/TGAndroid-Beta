package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class si extends org.telegram.ui.Components.jo {
    public final bo M;

    public si(bo boVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, i10, document, e6Var);
        this.M = boVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        bo boVar = this.M;
        float y10 = boVar.R0.getY() + y3;
        this.J = boVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
