package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class wk extends oq0 {
    public final Bitmap f53447a;
    public final ArrayList f53448b;
    public final bn f53449c;

    public wk(bn bnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f53449c = bnVar;
        this.f53447a = bitmap;
        this.f53448b = arrayList;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return new org.telegram.messenger.hc(this.f53447a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f53449c.u((org.telegram.messenger.ef) this.f53448b.get(0), e20Var, z10, i10, 0, z11, 0L);
    }
}
