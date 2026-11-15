package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class zh extends org.telegram.ui.Components.xn {
    public final an N;

    public zh(an anVar, Activity activity, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, i7, document, e6Var);
        this.N = anVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.N;
        float y11 = anVar.f45201g1.getY() + y10;
        this.K = anVar.f45278m1.getBackgroundSizeY();
        this.J = y11;
    }
}
