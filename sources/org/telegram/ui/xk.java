package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class xk extends pq0 {
    public final Bitmap f51682a;
    public final ArrayList f51683b;
    public final cn f51684c;

    public xk(cn cnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f51684c = cnVar;
        this.f51682a = bitmap;
        this.f51683b = arrayList;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return new org.telegram.messenger.jc(this.f51682a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.f51684c.u((org.telegram.messenger.gf) this.f51683b.get(0), j20Var, z9, i10, 0, z10, 0L);
    }
}
