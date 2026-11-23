package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class wk extends pq0 {
    public final Bitmap f53410a;
    public final ArrayList f53411b;
    public final bn f53412c;

    public wk(bn bnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f53412c = bnVar;
        this.f53410a = bitmap;
        this.f53411b = arrayList;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return new org.telegram.messenger.ic(this.f53410a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f53412c.u((org.telegram.messenger.ff) this.f53411b.get(0), f20Var, z10, i10, 0, z11, 0L);
    }
}
