package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class xi extends org.telegram.ui.Components.bp {
    public final eo M;

    public xi(eo eoVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, i10, document, c6Var);
        this.M = eoVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        eo eoVar = this.M;
        float y10 = eoVar.R0.getY() + y3;
        this.J = eoVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
