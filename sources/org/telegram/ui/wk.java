package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class wk extends oq0 {
    public final Bitmap f53448a;
    public final ArrayList f53449b;
    public final bn f53450c;

    public wk(bn bnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f53450c = bnVar;
        this.f53448a = bitmap;
        this.f53449b = arrayList;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return new org.telegram.messenger.ic(this.f53448a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f53450c.u((org.telegram.messenger.ff) this.f53449b.get(0), f20Var, z10, i10, 0, z11, 0L);
    }
}
