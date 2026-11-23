package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class wk extends oq0 {
    public final Bitmap f53695a;
    public final ArrayList f53696b;
    public final bn f53697c;

    public wk(bn bnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f53697c = bnVar;
        this.f53695a = bitmap;
        this.f53696b = arrayList;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return new org.telegram.messenger.hc(this.f53695a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f53697c.u((org.telegram.messenger.ef) this.f53696b.get(0), d20Var, z10, i10, 0, z11, 0L);
    }
}
