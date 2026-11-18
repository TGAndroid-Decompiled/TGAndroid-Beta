package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class wk extends oq0 {
    public final Bitmap f53398a;
    public final ArrayList f53399b;
    public final bn f53400c;

    public wk(bn bnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f53400c = bnVar;
        this.f53398a = bitmap;
        this.f53399b = arrayList;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return new org.telegram.messenger.hc(this.f53398a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f53400c.u((org.telegram.messenger.ef) this.f53399b.get(0), e20Var, z10, i10, 0, z11, 0L);
    }
}
